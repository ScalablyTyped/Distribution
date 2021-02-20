package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Archive extends StObject {
  
  /**
    * The name of the archive.
    */
  var ArchiveName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ArchiveName] = js.native
  
  /**
    * The time stamp for the time that the archive was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The number of events in the archive.
    */
  var EventCount: js.UndefOr[Long] = js.native
  
  /**
    * The ARN of the event bus associated with the archive. Only events from this event bus are sent to the archive.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The number of days to retain events in the archive before they are deleted.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RetentionDays] = js.native
  
  /**
    * The size of the archive, in bytes.
    */
  var SizeBytes: js.UndefOr[Long] = js.native
  
  /**
    * The current state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.native
  
  /**
    * A description for the reason that the archive is in the current state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.native
}
object Archive {
  
  @scala.inline
  def apply(): Archive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Archive]
  }
  
  @scala.inline
  implicit class ArchiveMutableBuilder[Self <: Archive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveNameUndefined: Self = StObject.set(x, "ArchiveName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setEventCount(value: Long): Self = StObject.set(x, "EventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCountUndefined: Self = StObject.set(x, "EventCount", js.undefined)
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventSourceArnUndefined: Self = StObject.set(x, "EventSourceArn", js.undefined)
    
    @scala.inline
    def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: Long): Self = StObject.set(x, "SizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeBytesUndefined: Self = StObject.set(x, "SizeBytes", js.undefined)
    
    @scala.inline
    def setState(value: ArchiveState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: ArchiveStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
