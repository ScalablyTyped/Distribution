package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventTrackerSummary extends StObject {
  
  /**
    * The date and time (in Unix time) that the event tracker was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.native
  
  /**
    * The date and time (in Unix time) that the event tracker was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The name of the event tracker.
    */
  var name: js.UndefOr[Name] = js.native
  
  /**
    * The status of the event tracker. An event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.native
}
object EventTrackerSummary {
  
  @scala.inline
  def apply(): EventTrackerSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTrackerSummary]
  }
  
  @scala.inline
  implicit class EventTrackerSummaryMutableBuilder[Self <: EventTrackerSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setEventTrackerArn(value: Arn): Self = StObject.set(x, "eventTrackerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTrackerArnUndefined: Self = StObject.set(x, "eventTrackerArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    @scala.inline
    def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
