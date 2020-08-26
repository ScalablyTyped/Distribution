package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoipAddressUsage extends js.Object {
  /**
    * The allocation ID of the address.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  /**
    * The AWS service.
    */
  var AwsService: js.UndefOr[String] = js.native
  /**
    * The customer-owned IP address.
    */
  var CoIp: js.UndefOr[String] = js.native
}

object CoipAddressUsage {
  @scala.inline
  def apply(): CoipAddressUsage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoipAddressUsage]
  }
  @scala.inline
  implicit class CoipAddressUsageOps[Self <: CoipAddressUsage] (val x: Self) extends AnyVal {
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
    def setAllocationId(value: String): Self = this.set("AllocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationId: Self = this.set("AllocationId", js.undefined)
    @scala.inline
    def setAwsAccountId(value: String): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccountId: Self = this.set("AwsAccountId", js.undefined)
    @scala.inline
    def setAwsService(value: String): Self = this.set("AwsService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsService: Self = this.set("AwsService", js.undefined)
    @scala.inline
    def setCoIp(value: String): Self = this.set("CoIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCoIp: Self = this.set("CoIp", js.undefined)
  }
  
}

