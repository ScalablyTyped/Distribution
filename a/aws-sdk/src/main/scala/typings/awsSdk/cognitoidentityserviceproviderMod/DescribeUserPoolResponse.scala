package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserPoolResponse extends js.Object {
  /**
    * The container of metadata returned by the server to describe the pool.
    */
  var UserPool: js.UndefOr[UserPoolType] = js.native
}

object DescribeUserPoolResponse {
  @scala.inline
  def apply(): DescribeUserPoolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserPoolResponse]
  }
  @scala.inline
  implicit class DescribeUserPoolResponseOps[Self <: DescribeUserPoolResponse] (val x: Self) extends AnyVal {
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
    def setUserPool(value: UserPoolType): Self = this.set("UserPool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserPool: Self = this.set("UserPool", js.undefined)
  }
  
}

