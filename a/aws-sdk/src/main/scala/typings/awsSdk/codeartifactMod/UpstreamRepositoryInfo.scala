package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpstreamRepositoryInfo extends StObject {
  
  /**
    *  The name of an upstream repository. 
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.undefined
}
object UpstreamRepositoryInfo {
  
  @scala.inline
  def apply(): UpstreamRepositoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpstreamRepositoryInfo]
  }
  
  @scala.inline
  implicit class UpstreamRepositoryInfoMutableBuilder[Self <: UpstreamRepositoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNameUndefined: Self = StObject.set(x, "repositoryName", js.undefined)
  }
}
