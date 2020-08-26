package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeployablePatchSnapshotForInstanceResult extends js.Object {
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  /**
    * Returns the specific operating system (for example Windows Server 2012 or Amazon Linux 2015.09) on the instance for the specified patch snapshot.
    */
  var Product: js.UndefOr[typings.awsSdk.ssmMod.Product] = js.native
  /**
    * A pre-signed Amazon S3 URL that can be used to download the patch snapshot.
    */
  var SnapshotDownloadUrl: js.UndefOr[typings.awsSdk.ssmMod.SnapshotDownloadUrl] = js.native
  /**
    * The user-defined snapshot ID.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ssmMod.SnapshotId] = js.native
}

object GetDeployablePatchSnapshotForInstanceResult {
  @scala.inline
  def apply(): GetDeployablePatchSnapshotForInstanceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeployablePatchSnapshotForInstanceResult]
  }
  @scala.inline
  implicit class GetDeployablePatchSnapshotForInstanceResultOps[Self <: GetDeployablePatchSnapshotForInstanceResult] (val x: Self) extends AnyVal {
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
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setProduct(value: Product): Self = this.set("Product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("Product", js.undefined)
    @scala.inline
    def setSnapshotDownloadUrl(value: SnapshotDownloadUrl): Self = this.set("SnapshotDownloadUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotDownloadUrl: Self = this.set("SnapshotDownloadUrl", js.undefined)
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
  }
  
}

