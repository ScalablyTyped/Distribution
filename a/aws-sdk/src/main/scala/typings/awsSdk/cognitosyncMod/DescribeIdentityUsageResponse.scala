package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIdentityUsageResponse extends js.Object {
  /**
    * Usage information for the identity.
    */
  var IdentityUsage: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityUsage] = js.native
}

object DescribeIdentityUsageResponse {
  @scala.inline
  def apply(): DescribeIdentityUsageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIdentityUsageResponse]
  }
  @scala.inline
  implicit class DescribeIdentityUsageResponseOps[Self <: DescribeIdentityUsageResponse] (val x: Self) extends AnyVal {
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
    def setIdentityUsage(value: IdentityUsage): Self = this.set("IdentityUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityUsage: Self = this.set("IdentityUsage", js.undefined)
  }
  
}

