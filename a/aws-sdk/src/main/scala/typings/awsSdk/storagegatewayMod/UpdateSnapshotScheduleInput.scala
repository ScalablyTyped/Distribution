package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateSnapshotScheduleInput extends StObject {
  
  /**
    * Optional description of the snapshot that overwrites the existing description.
    */
  var Description: js.UndefOr[typings.awsSdk.storagegatewayMod.Description] = js.native
  
  /**
    * Frequency of snapshots. Specify the number of hours between snapshots.
    */
  var RecurrenceInHours: typings.awsSdk.storagegatewayMod.RecurrenceInHours = js.native
  
  /**
    * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var StartAt: HourOfDay = js.native
  
  /**
    * A list of up to 50 tags that can be assigned to a snapshot. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers representable in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256. 
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the volume. Use the ListVolumes operation to return a list of gateway volumes.
    */
  var VolumeARN: typings.awsSdk.storagegatewayMod.VolumeARN = js.native
}
object UpdateSnapshotScheduleInput {
  
  @scala.inline
  def apply(RecurrenceInHours: RecurrenceInHours, StartAt: HourOfDay, VolumeARN: VolumeARN): UpdateSnapshotScheduleInput = {
    val __obj = js.Dynamic.literal(RecurrenceInHours = RecurrenceInHours.asInstanceOf[js.Any], StartAt = StartAt.asInstanceOf[js.Any], VolumeARN = VolumeARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSnapshotScheduleInput]
  }
  
  @scala.inline
  implicit class UpdateSnapshotScheduleInputMutableBuilder[Self <: UpdateSnapshotScheduleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setRecurrenceInHours(value: RecurrenceInHours): Self = StObject.set(x, "RecurrenceInHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartAt(value: HourOfDay): Self = StObject.set(x, "StartAt", value.asInstanceOf[js.Any])
    
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
