package typings.awsSdk.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestIdentityProviderResponse extends js.Object {
  
  /**
    * A message that indicates whether the test was successful or not.
    */
  var Message: js.UndefOr[typings.awsSdk.transferMod.Message] = js.native
  
  /**
    * The response that is returned from your API Gateway.
    */
  var Response: js.UndefOr[typings.awsSdk.transferMod.Response] = js.native
  
  /**
    * The HTTP status code that is the response from your API Gateway.
    */
  var StatusCode: typings.awsSdk.transferMod.StatusCode = js.native
  
  /**
    * The endpoint of the service used to authenticate a user.
    */
  var Url: typings.awsSdk.transferMod.Url = js.native
}
object TestIdentityProviderResponse {
  
  @scala.inline
  def apply(StatusCode: StatusCode, Url: Url): TestIdentityProviderResponse = {
    val __obj = js.Dynamic.literal(StatusCode = StatusCode.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestIdentityProviderResponse]
  }
  
  @scala.inline
  implicit class TestIdentityProviderResponseOps[Self <: TestIdentityProviderResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatusCode(value: StatusCode): Self = this.set("StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: Url): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: Message): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setResponse(value: Response): Self = this.set("Response", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponse: Self = this.set("Response", js.undefined)
  }
}
