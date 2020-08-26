package typings.awsSdk.opsworkscmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAccountAttributesResponse extends js.Object {
  /**
    *  The attributes that are currently set for the account. 
    */
  var Attributes: js.UndefOr[AccountAttributes] = js.native
}

object DescribeAccountAttributesResponse {
  @scala.inline
  def apply(): DescribeAccountAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAccountAttributesResponse]
  }
  @scala.inline
  implicit class DescribeAccountAttributesResponseOps[Self <: DescribeAccountAttributesResponse] (val x: Self) extends AnyVal {
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
    def setAttributesVarargs(value: AccountAttribute*): Self = this.set("Attributes", js.Array(value :_*))
    @scala.inline
    def setAttributes(value: AccountAttributes): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
  
}

