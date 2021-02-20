package typings.awsSdk.codeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRepositoryEndpointResult extends StObject {
  
  /**
    *  A string that specifies the URL of the returned endpoint. 
    */
  var repositoryEndpoint: js.UndefOr[String] = js.native
}
object GetRepositoryEndpointResult {
  
  @scala.inline
  def apply(): GetRepositoryEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryEndpointResult]
  }
  
  @scala.inline
  implicit class GetRepositoryEndpointResultMutableBuilder[Self <: GetRepositoryEndpointResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryEndpoint(value: String): Self = StObject.set(x, "repositoryEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryEndpointUndefined: Self = StObject.set(x, "repositoryEndpoint", js.undefined)
  }
}
