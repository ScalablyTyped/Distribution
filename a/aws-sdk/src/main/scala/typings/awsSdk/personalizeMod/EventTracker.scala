package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTracker extends StObject {
  
  /**
    * The Amazon AWS account that owns the event tracker.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The date and time (in Unix format) that the event tracker was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group that receives the event data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The date and time (in Unix time) that the event tracker was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the event tracker.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The status of the event tracker. An event tracker can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
  
  /**
    * The ID of the event tracker. Include this ID in requests to the PutEvents API.
    */
  var trackingId: js.UndefOr[TrackingId] = js.undefined
}
object EventTracker {
  
  @scala.inline
  def apply(): EventTracker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTracker]
  }
  
  @scala.inline
  implicit class EventTrackerMutableBuilder[Self <: EventTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    @scala.inline
    def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
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
    
    @scala.inline
    def setTrackingId(value: TrackingId): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
  }
}
