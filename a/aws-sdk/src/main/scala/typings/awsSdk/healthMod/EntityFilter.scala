package typings.awsSdk.healthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityFilter extends StObject {
  
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.undefined
  
  /**
    * A list of IDs for affected entities.
    */
  var entityValues: js.UndefOr[entityValueList] = js.undefined
  
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: eventArnList
  
  /**
    * A list of the most recent dates and times that the entity was updated.
    */
  var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.undefined
  
  /**
    * A list of entity status codes (IMPAIRED, UNIMPAIRED, or UNKNOWN).
    */
  var statusCodes: js.UndefOr[entityStatusCodeList] = js.undefined
  
  /**
    * A map of entity tags attached to the affected entity.  Currently, the tags property isn't supported. 
    */
  var tags: js.UndefOr[tagFilter] = js.undefined
}
object EntityFilter {
  
  @scala.inline
  def apply(eventArns: eventArnList): EntityFilter = {
    val __obj = js.Dynamic.literal(eventArns = eventArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityFilter]
  }
  
  @scala.inline
  implicit class EntityFilterMutableBuilder[Self <: EntityFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntityArns(value: entityArnList): Self = StObject.set(x, "entityArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityArnsUndefined: Self = StObject.set(x, "entityArns", js.undefined)
    
    @scala.inline
    def setEntityArnsVarargs(value: entityArn*): Self = StObject.set(x, "entityArns", js.Array(value :_*))
    
    @scala.inline
    def setEntityValues(value: entityValueList): Self = StObject.set(x, "entityValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityValuesUndefined: Self = StObject.set(x, "entityValues", js.undefined)
    
    @scala.inline
    def setEntityValuesVarargs(value: entityValue*): Self = StObject.set(x, "entityValues", js.Array(value :_*))
    
    @scala.inline
    def setEventArns(value: eventArnList): Self = StObject.set(x, "eventArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventArnsVarargs(value: eventArn*): Self = StObject.set(x, "eventArns", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedTimes(value: dateTimeRangeList): Self = StObject.set(x, "lastUpdatedTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimesUndefined: Self = StObject.set(x, "lastUpdatedTimes", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimesVarargs(value: DateTimeRange*): Self = StObject.set(x, "lastUpdatedTimes", js.Array(value :_*))
    
    @scala.inline
    def setStatusCodes(value: entityStatusCodeList): Self = StObject.set(x, "statusCodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodesUndefined: Self = StObject.set(x, "statusCodes", js.undefined)
    
    @scala.inline
    def setStatusCodesVarargs(value: entityStatusCode*): Self = StObject.set(x, "statusCodes", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: tagFilter): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: tagSet*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
