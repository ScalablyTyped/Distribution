package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AffectedEntity extends js.Object {
  
  /**
    * The 12-digit AWS account number that contains the affected entity.
    */
  var awsAccountId: js.UndefOr[accountId] = js.native
  
  /**
    * The unique identifier for the entity. Format: arn:aws:health:entity-region:aws-account:entity/entity-id . Example: arn:aws:health:us-east-1:111222333444:entity/AVh5GGT7ul1arKr1sE1K 
    */
  var entityArn: js.UndefOr[typings.awsSdk.healthMod.entityArn] = js.native
  
  /**
    * The URL of the affected entity.
    */
  var entityUrl: js.UndefOr[typings.awsSdk.healthMod.entityUrl] = js.native
  
  /**
    * The ID of the affected entity.
    */
  var entityValue: js.UndefOr[typings.awsSdk.healthMod.entityValue] = js.native
  
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var eventArn: js.UndefOr[typings.awsSdk.healthMod.eventArn] = js.native
  
  /**
    * The most recent time that the entity was updated.
    */
  var lastUpdatedTime: js.UndefOr[timestamp] = js.native
  
  /**
    * The most recent status of the entity affected by the event. The possible values are IMPAIRED, UNIMPAIRED, and UNKNOWN.
    */
  var statusCode: js.UndefOr[entityStatusCode] = js.native
  
  /**
    * A map of entity tags attached to the affected entity.  Currently, the tags property isn't supported. 
    */
  var tags: js.UndefOr[tagSet] = js.native
}
object AffectedEntity {
  
  @scala.inline
  def apply(): AffectedEntity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AffectedEntity]
  }
  
  @scala.inline
  implicit class AffectedEntityOps[Self <: AffectedEntity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAwsAccountId(value: accountId): Self = this.set("awsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountId: Self = this.set("awsAccountId", js.undefined)
    
    @scala.inline
    def setEntityArn(value: entityArn): Self = this.set("entityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityArn: Self = this.set("entityArn", js.undefined)
    
    @scala.inline
    def setEntityUrl(value: entityUrl): Self = this.set("entityUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityUrl: Self = this.set("entityUrl", js.undefined)
    
    @scala.inline
    def setEntityValue(value: entityValue): Self = this.set("entityValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityValue: Self = this.set("entityValue", js.undefined)
    
    @scala.inline
    def setEventArn(value: eventArn): Self = this.set("eventArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventArn: Self = this.set("eventArn", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: timestamp): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setStatusCode(value: entityStatusCode): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setTags(value: tagSet): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
