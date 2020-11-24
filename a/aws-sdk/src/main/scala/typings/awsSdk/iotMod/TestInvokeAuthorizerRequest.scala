package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeAuthorizerRequest extends js.Object {
  
  /**
    * The custom authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
  
  /**
    * Specifies a test HTTP authorization request.
    */
  var httpContext: js.UndefOr[HttpContext] = js.native
  
  /**
    * Specifies a test MQTT authorization request.
    */
  var mqttContext: js.UndefOr[MqttContext] = js.native
  
  /**
    * Specifies a test TLS authorization request.
    */
  var tlsContext: js.UndefOr[TlsContext] = js.native
  
  /**
    * The token returned by your custom authentication service.
    */
  var token: js.UndefOr[Token] = js.native
  
  /**
    * The signature made with the token and your custom authentication service's private key. This value must be Base-64-encoded.
    */
  var tokenSignature: js.UndefOr[TokenSignature] = js.native
}
object TestInvokeAuthorizerRequest {
  
  @scala.inline
  def apply(authorizerName: AuthorizerName): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
  
  @scala.inline
  implicit class TestInvokeAuthorizerRequestOps[Self <: TestInvokeAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthorizerName(value: AuthorizerName): Self = this.set("authorizerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpContext(value: HttpContext): Self = this.set("httpContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpContext: Self = this.set("httpContext", js.undefined)
    
    @scala.inline
    def setMqttContext(value: MqttContext): Self = this.set("mqttContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMqttContext: Self = this.set("mqttContext", js.undefined)
    
    @scala.inline
    def setTlsContext(value: TlsContext): Self = this.set("tlsContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsContext: Self = this.set("tlsContext", js.undefined)
    
    @scala.inline
    def setToken(value: Token): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
    
    @scala.inline
    def setTokenSignature(value: TokenSignature): Self = this.set("tokenSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenSignature: Self = this.set("tokenSignature", js.undefined)
  }
}
