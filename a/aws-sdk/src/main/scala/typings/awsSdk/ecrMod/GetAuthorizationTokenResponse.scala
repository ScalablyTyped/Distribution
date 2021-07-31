package typings.awsSdk.ecrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthorizationTokenResponse extends StObject {
  
  /**
    * A list of authorization token data objects that correspond to the registryIds values in the request.
    */
  var authorizationData: js.UndefOr[AuthorizationDataList] = js.undefined
}
object GetAuthorizationTokenResponse {
  
  @scala.inline
  def apply(): GetAuthorizationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAuthorizationTokenResponse]
  }
  
  @scala.inline
  implicit class GetAuthorizationTokenResponseMutableBuilder[Self <: GetAuthorizationTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizationData(value: AuthorizationDataList): Self = StObject.set(x, "authorizationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationDataUndefined: Self = StObject.set(x, "authorizationData", js.undefined)
    
    @scala.inline
    def setAuthorizationDataVarargs(value: AuthorizationData*): Self = StObject.set(x, "authorizationData", js.Array(value :_*))
  }
}
