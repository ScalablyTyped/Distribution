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
    * The Amazon Resource Name (ARN) of the NFS location that was described.
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
  def apply(): DescribeLocationNfsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocationNfsResponse]
  }
  @scala.inline
  implicit class DescribeLocationNfsResponseOps[Self <: DescribeLocationNfsResponse] (val x: Self) extends AnyVal {
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
    def setCreationTime(value: Time): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    @scala.inline
    def setLocationArn(value: LocationArn): Self = this.set("LocationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationArn: Self = this.set("LocationArn", js.undefined)
    @scala.inline
    def setLocationUri(value: LocationUri): Self = this.set("LocationUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationUri: Self = this.set("LocationUri", js.undefined)
    @scala.inline
    def setMountOptions(value: NfsMountOptions): Self = this.set("MountOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMountOptions: Self = this.set("MountOptions", js.undefined)
    @scala.inline
    def setOnPremConfig(value: OnPremConfig): Self = this.set("OnPremConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPremConfig: Self = this.set("OnPremConfig", js.undefined)
  }
  
}

