package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotFromVolumeRecoveryPointInput extends StObject {
  
  /**
    * Textual description of the snapshot that appears in the Amazon EC2 console, Elastic Block Store snapshots panel in the Description field, and in the AWS Storage Gateway snapshot Details pane, Description field.
    */
  var SnapshotDescription: typings.awsSdk.storagegatewayMod.SnapshotDescription
  
  /**
    * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN
}
object CreateSnapshotFromVolumeRecoveryPointInput {
  
  @scala.inline
  def apply(SnapshotDescription: SnapshotDescription, VolumeARN: VolumeARN): CreateSnapshotFromVolumeRecoveryPointInput = {
    val __obj = js.Dynamic.literal(SnapshotDescription = SnapshotDescription.asInstanceOf[js.Any], VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointInput]
  }
  
  @scala.inline
  implicit class CreateSnapshotFromVolumeRecoveryPointInputMutableBuilder[Self <: CreateSnapshotFromVolumeRecoveryPointInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotDescription(value: SnapshotDescription): Self = StObject.set(x, "SnapshotDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
  }
}
