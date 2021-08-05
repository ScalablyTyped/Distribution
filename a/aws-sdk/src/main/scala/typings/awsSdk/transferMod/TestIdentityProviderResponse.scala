package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestIdentityProviderResponse extends StObject {
  
  /**
    * A message that indicates whether the test was successful or not.
    */
  var Message: js.UndefOr[typings.awsSdk.transferMod.Message] = js.undefined
  
  /**
    * The response that is returned from your API Gateway.
    */
  var Response: js.UndefOr[typings.awsSdk.transferMod.Response] = js.undefined
  
  /**
    * The HTTP status code that is the response from your API Gateway.
    */
  var StatusCode: typings.awsSdk.transferMod.StatusCode
  
  /**
    * The endpoint of the service used to authenticate a user.
    */
  var Url: typings.awsSdk.transferMod.Url
}
object TestIdentityProviderResponse {
  
  inline def apply(StatusCode: StatusCode, Url: Url): TestIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderResponse]
  }
  
  extension [Self <: TestIdentityProviderResponse](x: Self) {
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setResponse(value: Response): Self = StObject.set(x, "Response", value.asInstanceOf[js.Any])
    
    inline def setResponseUndefined: Self = StObject.set(x, "Response", js.undefined)
    
    inline def setStatusCode(value: StatusCode): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: Url): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
  }
}
