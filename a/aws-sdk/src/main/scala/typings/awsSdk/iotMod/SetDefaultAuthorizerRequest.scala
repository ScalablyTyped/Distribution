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
  @scala.inline
  implicit class SetDefaultAuthorizerRequestOps[Self <: SetDefaultAuthorizerRequest] (val x: Self) extends AnyVal {
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
  }
  
}

