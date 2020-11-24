package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSnapshotRecordSourceInfo extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the source instance or disk snapshot.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The date when the source instance or disk snapshot was created.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  
  /**
    * A list of objects describing a disk snapshot.
    */
  var diskSnapshotInfo: js.UndefOr[DiskSnapshotInfo] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the snapshot's source instance or disk.
    */
  var fromResourceArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the snapshot's source instance or disk.
    */
  var fromResourceName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A list of objects describing an instance snapshot.
    */
  var instanceSnapshotInfo: js.UndefOr[InstanceSnapshotInfo] = js.native
  
  /**
    * The name of the source instance or disk snapshot.
    */
  var name: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The Lightsail resource type (e.g., InstanceSnapshot or DiskSnapshot).
    */
  var resourceType: js.UndefOr[ExportSnapshotRecordSourceType] = js.native
}
object ExportSnapshotRecordSourceInfo {
  
  @scala.inline
  def apply(): ExportSnapshotRecordSourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSnapshotRecordSourceInfo]
  }
  
  @scala.inline
  implicit class ExportSnapshotRecordSourceInfoOps[Self <: ExportSnapshotRecordSourceInfo] (val x: Self) extends AnyVal {
    
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
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    
    @scala.inline
    def setDiskSnapshotInfo(value: DiskSnapshotInfo): Self = this.set("diskSnapshotInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskSnapshotInfo: Self = this.set("diskSnapshotInfo", js.undefined)
    
    @scala.inline
    def setFromResourceArn(value: NonEmptyString): Self = this.set("fromResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromResourceArn: Self = this.set("fromResourceArn", js.undefined)
    
    @scala.inline
    def setFromResourceName(value: NonEmptyString): Self = this.set("fromResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromResourceName: Self = this.set("fromResourceName", js.undefined)
    
    @scala.inline
    def setInstanceSnapshotInfo(value: InstanceSnapshotInfo): Self = this.set("instanceSnapshotInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceSnapshotInfo: Self = this.set("instanceSnapshotInfo", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ExportSnapshotRecordSourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
}
