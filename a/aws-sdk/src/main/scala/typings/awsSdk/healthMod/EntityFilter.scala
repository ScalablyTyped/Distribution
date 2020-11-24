package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EntityFilter extends js.Object {
  
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  
  /**
    * A list of IDs for affected entities.
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: eventArnList = js.native
  
  /**
    * A list of the most recent dates and times that the entity was updated.
    */
  var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.native
  
  /**
    * A list of entity status codes (IMPAIRED, UNIMPAIRED, or UNKNOWN).
    */
  var statusCodes: js.UndefOr[entityStatusCodeList] = js.native
  
  /**
    * A map of entity tags attached to the affected entity.  Currently, the tags property isn't supported. 
    */
  var tags: js.UndefOr[tagFilter] = js.native
}
object EntityFilter {
  
  @scala.inline
  def apply(eventArns: eventArnList): EntityFilter = {
    val __obj = js.Dynamic.literal(eventArns = eventArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFilter]
  }
  
  @scala.inline
  implicit class EntityFilterOps[Self <: EntityFilter] (val x: Self) extends AnyVal {
    
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
    def setEventArnsVarargs(value: eventArn*): Self = this.set("eventArns", js.Array(value :_*))
    
    @scala.inline
    def setEventArns(value: eventArnList): Self = this.set("eventArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityArnsVarargs(value: entityArn*): Self = this.set("entityArns", js.Array(value :_*))
    
    @scala.inline
    def setEntityArns(value: entityArnList): Self = this.set("entityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityArns: Self = this.set("entityArns", js.undefined)
    
    @scala.inline
    def setEntityValuesVarargs(value: entityValue*): Self = this.set("entityValues", js.Array(value :_*))
    
    @scala.inline
    def setEntityValues(value: entityValueList): Self = this.set("entityValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityValues: Self = this.set("entityValues", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimesVarargs(value: DateTimeRange*): Self = this.set("lastUpdatedTimes", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedTimes(value: dateTimeRangeList): Self = this.set("lastUpdatedTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimes: Self = this.set("lastUpdatedTimes", js.undefined)
    
    @scala.inline
    def setStatusCodesVarargs(value: entityStatusCode*): Self = this.set("statusCodes", js.Array(value :_*))
    
    @scala.inline
    def setStatusCodes(value: entityStatusCodeList): Self = this.set("statusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCodes: Self = this.set("statusCodes", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: tagSet*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagFilter): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
