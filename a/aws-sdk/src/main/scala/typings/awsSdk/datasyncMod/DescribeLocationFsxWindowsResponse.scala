package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationFsxWindowsResponse extends js.Object {
  /**
    * The time that the FSx for Windows location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  /**
    * The name of the Windows domain that the FSx for Windows server belongs to.
    */
  var Domain: js.UndefOr[SmbDomain] = js.native
  /**
    * The Amazon resource Name (ARN) of the FSx for Windows location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the FSx for Windows location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the security groups that are configured for the for the FSx for Windows file system.
    */
  var SecurityGroupArns: js.UndefOr[Ec2SecurityGroupArnList] = js.native
  /**
    * The user who has the permissions to access files and folders in the FSx for Windows file system.
    */
  var User: js.UndefOr[SmbUser] = js.native
}

object DescribeLocationFsxWindowsResponse {
  @scala.inline
  def apply(
    CreationTime: Time = null,
    Domain: SmbDomain = null,
    LocationArn: LocationArn = null,
    LocationUri: LocationUri = null,
    SecurityGroupArns: Ec2SecurityGroupArnList = null,
    User: SmbUser = null
  ): DescribeLocationFsxWindowsResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn.asInstanceOf[js.Any])
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri.asInstanceOf[js.Any])
    if (SecurityGroupArns != null) __obj.updateDynamic("SecurityGroupArns")(SecurityGroupArns.asInstanceOf[js.Any])
    if (User != null) __obj.updateDynamic("User")(User.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationFsxWindowsResponse]
  }
}

