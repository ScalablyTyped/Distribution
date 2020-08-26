package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuthorizerRequest extends js.Object {
  /**
    * The name of the authorizer to describe.
    */
  var authorizerName: AuthorizerName = js.native
}

object DescribeAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): DescribeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAuthorizerRequest]
  }
  @scala.inline
  implicit class DescribeAuthorizerRequestOps[Self <: DescribeAuthorizerRequest] (val x: Self) extends AnyVal {
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

