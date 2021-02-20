package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitSubmodulesConfig extends StObject {
  
  /**
    *  Set to true to fetch Git submodules for your AWS CodeBuild build project. 
    */
  var fetchSubmodules: WrapperBoolean = js.native
}
object GitSubmodulesConfig {
  
  @scala.inline
  def apply(fetchSubmodules: WrapperBoolean): GitSubmodulesConfig = {
    val __obj = js.Dynamic.literal(fetchSubmodules = fetchSubmodules.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitSubmodulesConfig]
  }
  
  @scala.inline
  implicit class GitSubmodulesConfigMutableBuilder[Self <: GitSubmodulesConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFetchSubmodules(value: WrapperBoolean): Self = StObject.set(x, "fetchSubmodules", value.asInstanceOf[js.Any])
  }
}
