package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeArchiveResponse extends StObject {
  
  /**
    * The ARN of the archive.
    */
  var ArchiveArn: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ArchiveArn] = js.native
  
  /**
    * The name of the archive.
    */
  var ArchiveName: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ArchiveName] = js.native
  
  /**
    * The time at which the archive was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description of the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.native
  
  /**
    * The number of events in the archive.
    */
  var EventCount: js.UndefOr[Long] = js.native
  
  /**
    * The event pattern used to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventPattern] = js.native
  
  /**
    * The ARN of the event source associated with the archive.
    */
  var EventSourceArn: js.UndefOr[Arn] = js.native
  
  /**
    * The number of days to retain events for in the archive.
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RetentionDays] = js.native
  
  /**
    * The size of the archive in bytes.
    */
  var SizeBytes: js.UndefOr[Long] = js.native
  
  /**
    * The state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.native
  
  /**
    * The reason that the archive is in the state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.native
}
object DescribeArchiveResponse {
  
  @scala.inline
  def apply(): DescribeArchiveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeArchiveResponse]
  }
  
  @scala.inline
  implicit class DescribeArchiveResponseMutableBuilder[Self <: DescribeArchiveResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveArn(value: ArchiveArn): Self = StObject.set(x, "ArchiveArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveArnUndefined: Self = StObject.set(x, "ArchiveArn", js.undefined)
    
    @scala.inline
    def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveNameUndefined: Self = StObject.set(x, "ArchiveName", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ArchiveDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEventCount(value: Long): Self = StObject.set(x, "EventCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventCountUndefined: Self = StObject.set(x, "EventCount", js.undefined)
    
    @scala.inline
    def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
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
