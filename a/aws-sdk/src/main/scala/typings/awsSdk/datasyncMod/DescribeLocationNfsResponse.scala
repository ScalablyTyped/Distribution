package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLocationNfsResponse extends js.Object {
  /**
    * The time that the NFS location was created.
    */
  var CreationTime: js.UndefOr[Time] = js.native
  /**
    * The Amazon resource Name (ARN) of the NFS location that was described.
    */
  var LocationArn: js.UndefOr[typings.awsSdk.datasyncMod.LocationArn] = js.native
  /**
    * The URL of the source NFS location that was described.
    */
  var LocationUri: js.UndefOr[typings.awsSdk.datasyncMod.LocationUri] = js.native
  /**
    * The NFS mount options that DataSync used to mount your NFS share.
    */
  var MountOptions: js.UndefOr[NfsMountOptions] = js.native
  var OnPremConfig: js.UndefOr[typings.awsSdk.datasyncMod.OnPremConfig] = js.native
}

object DescribeLocationNfsResponse {
  @scala.inline
  def apply(
    CreationTime: Time = null,
    LocationArn: LocationArn = null,
    LocationUri: LocationUri = null,
    MountOptions: NfsMountOptions = null,
    OnPremConfig: OnPremConfig = null
  ): DescribeLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (LocationArn != null) __obj.updateDynamic("LocationArn")(LocationArn.asInstanceOf[js.Any])
    if (LocationUri != null) __obj.updateDynamic("LocationUri")(LocationUri.asInstanceOf[js.Any])
    if (MountOptions != null) __obj.updateDynamic("MountOptions")(MountOptions.asInstanceOf[js.Any])
    if (OnPremConfig != null) __obj.updateDynamic("OnPremConfig")(OnPremConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLocationNfsResponse]
  }
}

