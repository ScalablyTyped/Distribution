package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationEvent extends StObject {
  
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var arn: js.UndefOr[eventArn] = js.undefined
  
  /**
    * The date and time that the event ended.
    */
  var endTime: js.UndefOr[timestamp] = js.undefined
  
  /**
    * This parameter specifies if the AWS Health event is a public AWS service event or an account-specific event.   If the eventScopeCode value is PUBLIC, then the affectedAccounts value is always empty.   If the eventScopeCode value is ACCOUNT_SPECIFIC, then the affectedAccounts value lists the affected AWS accounts in your organization. For example, if an event affects a service such as Amazon Elastic Compute Cloud and you have AWS accounts that use that service, those account IDs appear in the response.   If the eventScopeCode value is NONE, then the eventArn that you specified in the request is invalid or doesn't exist.  
    */
  var eventScopeCode: js.UndefOr[typings.awsSdk.healthMod.eventScopeCode] = js.undefined
  
  /**
    * The category of the event type.
    */
  var eventTypeCategory: js.UndefOr[typings.awsSdk.healthMod.eventTypeCategory] = js.undefined
  
  /**
    * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION. For example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
    */
  var eventTypeCode: js.UndefOr[typings.awsSdk.healthMod.eventTypeCode] = js.undefined
  
  /**
    * The most recent date and time that the event was updated.
    */
  var lastUpdatedTime: js.UndefOr[timestamp] = js.undefined
  
  /**
    * The AWS Region name of the event.
    */
  var region: js.UndefOr[typings.awsSdk.healthMod.region] = js.undefined
  
  /**
    * The AWS service that is affected by the event. For example, EC2, RDS.
    */
  var service: js.UndefOr[typings.awsSdk.healthMod.service] = js.undefined
  
  /**
    * The date and time that the event began.
    */
  var startTime: js.UndefOr[timestamp] = js.undefined
  
  /**
    * The most recent status of the event. Possible values are open, closed, and upcoming.
    */
  var statusCode: js.UndefOr[eventStatusCode] = js.undefined
}
object OrganizationEvent {
  
  @scala.inline
  def apply(): OrganizationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEvent]
  }
  
  @scala.inline
  implicit class OrganizationEventMutableBuilder[Self <: OrganizationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: eventArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setEndTime(value: timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setEventScopeCode(value: eventScopeCode): Self = StObject.set(x, "eventScopeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventScopeCodeUndefined: Self = StObject.set(x, "eventScopeCode", js.undefined)
    
    @scala.inline
    def setEventTypeCategory(value: eventTypeCategory): Self = StObject.set(x, "eventTypeCategory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeCategoryUndefined: Self = StObject.set(x, "eventTypeCategory", js.undefined)
    
    @scala.inline
    def setEventTypeCode(value: eventTypeCode): Self = StObject.set(x, "eventTypeCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeCodeUndefined: Self = StObject.set(x, "eventTypeCode", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: timestamp): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setRegion(value: region): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setService(value: service): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
    
    @scala.inline
    def setStartTime(value: timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStatusCode(value: eventStatusCode): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
  }
}
