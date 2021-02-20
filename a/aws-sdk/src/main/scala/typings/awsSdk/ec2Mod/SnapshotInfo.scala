package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotInfo extends StObject {
  
  /**
    * Description specified by the CreateSnapshotRequest that has been applied to all snapshots.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * Account id used when creating this snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.native
  
  /**
    * Progress this snapshot has made towards completing.
    */
  var Progress: js.UndefOr[String] = js.native
  
  /**
    * Snapshot id that can be used to describe this snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
  
  /**
    * Time this snapshot was started. This is the same for all snapshots initiated by the same request.
    */
  var StartTime: js.UndefOr[MillisecondDateTime] = js.native
  
  /**
    * Current state of the snapshot.
    */
  var State: js.UndefOr[SnapshotState] = js.native
  
  /**
    * Tags associated with this snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Source volume from which this snapshot was created.
    */
  var VolumeId: js.UndefOr[String] = js.native
  
  /**
    * Size of the volume from which this snapshot was created.
    */
  var VolumeSize: js.UndefOr[Integer] = js.native
}
object SnapshotInfo {
  
  @scala.inline
  def apply(): SnapshotInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotInfo]
  }
  
  @scala.inline
  implicit class SnapshotInfoMutableBuilder[Self <: SnapshotInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    @scala.inline
    def setProgress(value: String): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setStartTime(value: MillisecondDateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setState(value: SnapshotState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: Integer): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
  }
}
