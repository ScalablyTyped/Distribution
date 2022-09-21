package typings.cucumberCiEnvironment

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CiEnvironment extends StObject {
    
    var buildNumber: js.UndefOr[String] = js.undefined
    
    var git: js.UndefOr[Git] = js.undefined
    
    var name: String
    
    var url: String
  }
  object CiEnvironment {
    
    inline def apply(name: String, url: String): CiEnvironment = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CiEnvironment]
    }
    
    extension [Self <: CiEnvironment](x: Self) {
      
      inline def setBuildNumber(value: String): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
      
      inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
      
      inline def setGit(value: Git): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait CiEnvironments extends StObject {
    
    var ciEnvironments: js.Array[CiEnvironment]
  }
  object CiEnvironments {
    
    inline def apply(ciEnvironments: js.Array[CiEnvironment]): CiEnvironments = {
      val __obj = js.Dynamic.literal(ciEnvironments = ciEnvironments.asInstanceOf[js.Any])
      __obj.asInstanceOf[CiEnvironments]
    }
    
    extension [Self <: CiEnvironments](x: Self) {
      
      inline def setCiEnvironments(value: js.Array[CiEnvironment]): Self = StObject.set(x, "ciEnvironments", value.asInstanceOf[js.Any])
      
      inline def setCiEnvironmentsVarargs(value: CiEnvironment*): Self = StObject.set(x, "ciEnvironments", js.Array(value*))
    }
  }
  
  type Env = Record[String, js.UndefOr[String]]
  
  trait Git extends StObject {
    
    var branch: js.UndefOr[String] = js.undefined
    
    var remote: String
    
    var revision: String
    
    var tag: js.UndefOr[String] = js.undefined
  }
  object Git {
    
    inline def apply(remote: String, revision: String): Git = {
      val __obj = js.Dynamic.literal(remote = remote.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
      __obj.asInstanceOf[Git]
    }
    
    extension [Self <: Git](x: Self) {
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setRemote(value: String): Self = StObject.set(x, "remote", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
