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
  def apply(
    AllocationId: String = null,
    AwsAccountId: String = null,
    AwsService: String = null,
    CoIp: String = null
  ): CoipAddressUsage = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (AwsAccountId != null) __obj.updateDynamic("AwsAccountId")(AwsAccountId.asInstanceOf[js.Any])
    if (AwsService != null) __obj.updateDynamic("AwsService")(AwsService.asInstanceOf[js.Any])
    if (CoIp != null) __obj.updateDynamic("CoIp")(CoIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoipAddressUsage]
  }
}

