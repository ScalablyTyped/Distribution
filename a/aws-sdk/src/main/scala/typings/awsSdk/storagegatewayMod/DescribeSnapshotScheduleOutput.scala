package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotScheduleOutput extends StObject {
  
  /**
    * The snapshot description.
    */
  var Description: js.UndefOr[typings.awsSdk.storagegatewayMod.Description] = js.undefined
  
  /**
    * The number of hours between snapshots.
    */
  var RecurrenceInHours: js.UndefOr[typings.awsSdk.storagegatewayMod.RecurrenceInHours] = js.undefined
  
  /**
    * The hour of the day at which the snapshot schedule begins represented as hh, where hh is the hour (0 to 23). The hour of the day is in the time zone of the gateway.
    */
  var StartAt: js.UndefOr[HourOfDay] = js.undefined
  
  /**
    * A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the ListTagsForResource API operation.
    */
  var Tags: js.UndefOr[typings.awsSdk.storagegatewayMod.Tags] = js.undefined
  
  /**
    * A value that indicates the time zone of the gateway.
    */
  var Timezone: js.UndefOr[GatewayTimezone] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the volume that was specified in the request.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.undefined
}
object DescribeSnapshotScheduleOutput {
  
  inline def apply(): DescribeSnapshotScheduleOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotScheduleOutput]
  }
  
  extension [Self <: DescribeSnapshotScheduleOutput](x: Self) {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setRecurrenceInHours(value: RecurrenceInHours): Self = StObject.set(x, "RecurrenceInHours", value.asInstanceOf[js.Any])
    
    inline def setRecurrenceInHoursUndefined: Self = StObject.set(x, "RecurrenceInHours", js.undefined)
    
    inline def setStartAt(value: HourOfDay): Self = StObject.set(x, "StartAt", value.asInstanceOf[js.Any])
    
    inline def setStartAtUndefined: Self = StObject.set(x, "StartAt", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTimezone(value: GatewayTimezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
  }
}
