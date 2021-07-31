package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventAccountFilter extends StObject {
  
  /**
    * The 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountId: js.UndefOr[accountId] = js.undefined
  
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: typings.awsSdk.healthMod.eventArn
}
object EventAccountFilter {
  
  @scala.inline
  def apply(eventArn: eventArn): EventAccountFilter = {
    val __obj = js.Dynamic.literal(eventArn = eventArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventAccountFilter]
  }
  
  @scala.inline
  implicit class EventAccountFilterMutableBuilder[Self <: EventAccountFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: accountId): Self = StObject.set(x, "awsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountIdUndefined: Self = StObject.set(x, "awsAccountId", js.undefined)
    
    @scala.inline
    def setEventArn(value: eventArn): Self = StObject.set(x, "eventArn", value.asInstanceOf[js.Any])
  }
}
