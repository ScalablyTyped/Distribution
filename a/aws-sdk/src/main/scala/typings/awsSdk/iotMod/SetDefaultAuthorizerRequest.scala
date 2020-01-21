package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDefaultAuthorizerRequest extends js.Object {
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName = js.native
}

object SetDefaultAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): SetDefaultAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetDefaultAuthorizerRequest]
  }
}

