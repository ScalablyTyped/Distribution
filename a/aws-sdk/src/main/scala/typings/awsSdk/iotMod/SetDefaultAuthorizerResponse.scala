package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetDefaultAuthorizerResponse extends js.Object {
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
}

object SetDefaultAuthorizerResponse {
  @scala.inline
  def apply(authorizerArn: AuthorizerArn = null, authorizerName: AuthorizerName = null): SetDefaultAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizerArn != null) __obj.updateDynamic("authorizerArn")(authorizerArn.asInstanceOf[js.Any])
    if (authorizerName != null) __obj.updateDynamic("authorizerName")(authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultAuthorizerResponse]
  }
}

