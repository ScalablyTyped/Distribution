package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportSnapshotRecordSourceInfo extends StObject {
  
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
  implicit class ExportSnapshotRecordSourceInfoMutableBuilder[Self <: ExportSnapshotRecordSourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setDiskSnapshotInfo(value: DiskSnapshotInfo): Self = StObject.set(x, "diskSnapshotInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskSnapshotInfoUndefined: Self = StObject.set(x, "diskSnapshotInfo", js.undefined)
    
    @scala.inline
    def setFromResourceArn(value: NonEmptyString): Self = StObject.set(x, "fromResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromResourceArnUndefined: Self = StObject.set(x, "fromResourceArn", js.undefined)
    
    @scala.inline
    def setFromResourceName(value: NonEmptyString): Self = StObject.set(x, "fromResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromResourceNameUndefined: Self = StObject.set(x, "fromResourceName", js.undefined)
    
    @scala.inline
    def setInstanceSnapshotInfo(value: InstanceSnapshotInfo): Self = StObject.set(x, "instanceSnapshotInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceSnapshotInfoUndefined: Self = StObject.set(x, "instanceSnapshotInfo", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setResourceType(value: ExportSnapshotRecordSourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
