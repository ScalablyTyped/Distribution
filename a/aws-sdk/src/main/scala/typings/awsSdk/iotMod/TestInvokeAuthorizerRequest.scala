package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The signature made with the token and your custom authentication service's private key.
    */
  var tokenSignature: js.UndefOr[TokenSignature] = js.native
}

object TestInvokeAuthorizerRequest {
  @scala.inline
  def apply(
    authorizerName: AuthorizerName,
    httpContext: HttpContext = null,
    mqttContext: MqttContext = null,
    tlsContext: TlsContext = null,
    token: Token = null,
    tokenSignature: TokenSignature = null
  ): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    if (httpContext != null) __obj.updateDynamic("httpContext")(httpContext.asInstanceOf[js.Any])
    if (mqttContext != null) __obj.updateDynamic("mqttContext")(mqttContext.asInstanceOf[js.Any])
    if (tlsContext != null) __obj.updateDynamic("tlsContext")(tlsContext.asInstanceOf[js.Any])
    if (token != null) __obj.updateDynamic("token")(token.asInstanceOf[js.Any])
    if (tokenSignature != null) __obj.updateDynamic("tokenSignature")(tokenSignature.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
}

