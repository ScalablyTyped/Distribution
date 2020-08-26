package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserPoolRequest extends js.Object {
  /**
    * The user pool ID for the user pool you want to describe.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DescribeUserPoolRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DescribeUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserPoolRequest]
  }
  @scala.inline
  implicit class DescribeUserPoolRequestOps[Self <: DescribeUserPoolRequest] (val x: Self) extends AnyVal {
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
    def setUserPoolId(value: UserPoolIdType): Self = this.set("UserPoolId", value.asInstanceOf[js.Any])
  }
  
}

