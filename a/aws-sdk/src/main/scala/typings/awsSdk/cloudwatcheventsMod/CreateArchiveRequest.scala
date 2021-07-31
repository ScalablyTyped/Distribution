package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateArchiveRequest extends StObject {
  
  /**
    * The name for the archive to create.
    */
  var ArchiveName: typings.awsSdk.cloudwatcheventsMod.ArchiveName
  
  /**
    * A description for the archive.
    */
  var Description: js.UndefOr[ArchiveDescription] = js.undefined
  
  /**
    * An event pattern to use to filter events sent to the archive.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.EventPattern] = js.undefined
  
  /**
    * The ARN of the event source associated with the archive.
    */
  var EventSourceArn: Arn
  
  /**
    * The number of days to retain events for. Default value is 0. If set to 0, events are retained indefinitely
    */
  var RetentionDays: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.RetentionDays] = js.undefined
}
object CreateArchiveRequest {
  
  @scala.inline
  def apply(ArchiveName: ArchiveName, EventSourceArn: Arn): CreateArchiveRequest = {
    val __obj = js.Dynamic.literal(ArchiveName = ArchiveName.asInstanceOf[js.Any], EventSourceArn = EventSourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateArchiveRequest]
  }
  
  @scala.inline
  implicit class CreateArchiveRequestMutableBuilder[Self <: CreateArchiveRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveName(value: ArchiveName): Self = StObject.set(x, "ArchiveName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ArchiveDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    @scala.inline
    def setEventSourceArn(value: Arn): Self = StObject.set(x, "EventSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionDays(value: RetentionDays): Self = StObject.set(x, "RetentionDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionDaysUndefined: Self = StObject.set(x, "RetentionDays", js.undefined)
  }
}
