package typings.awsSdk.cognitoidentityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityInput extends js.Object {
  /**
    * A unique identifier in the format REGION:GUID.
    */
  var IdentityId: typings.awsSdk.cognitoidentityMod.IdentityId = js.native
}

object DescribeIdentityInput {
  @scala.inline
  def apply(IdentityId: IdentityId): DescribeIdentityInput = {
    val __obj = js.Dynamic.literal(IdentityId = IdentityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIdentityInput]
  }
  @scala.inline
  implicit class DescribeIdentityInputOps[Self <: DescribeIdentityInput] (val x: Self) extends AnyVal {
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
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
  }
  
}

