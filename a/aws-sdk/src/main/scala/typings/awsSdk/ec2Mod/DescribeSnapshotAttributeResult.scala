package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSnapshotAttributeResult extends js.Object {
  /**
    * The users and groups that have the permissions for creating volumes from the snapshot.
    */
  var CreateVolumePermissions: js.UndefOr[CreateVolumePermissionList] = js.native
  /**
    * The product codes.
    */
  var ProductCodes: js.UndefOr[ProductCodeList] = js.native
  /**
    * The ID of the EBS snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
}

object DescribeSnapshotAttributeResult {
  @scala.inline
  def apply(): DescribeSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotAttributeResult]
  }
  @scala.inline
  implicit class DescribeSnapshotAttributeResultOps[Self <: DescribeSnapshotAttributeResult] (val x: Self) extends AnyVal {
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
    def setCreateVolumePermissionsVarargs(value: CreateVolumePermission*): Self = this.set("CreateVolumePermissions", js.Array(value :_*))
    @scala.inline
    def setCreateVolumePermissions(value: CreateVolumePermissionList): Self = this.set("CreateVolumePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateVolumePermissions: Self = this.set("CreateVolumePermissions", js.undefined)
    @scala.inline
    def setProductCodesVarargs(value: ProductCode*): Self = this.set("ProductCodes", js.Array(value :_*))
    @scala.inline
    def setProductCodes(value: ProductCodeList): Self = this.set("ProductCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductCodes: Self = this.set("ProductCodes", js.undefined)
    @scala.inline
    def setSnapshotId(value: String): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("SnapshotId", js.undefined)
  }
  
}

