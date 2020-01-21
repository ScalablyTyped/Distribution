package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventFilter extends js.Object {
  /**
    * A list of AWS availability zones.
    */
  var availabilityZones: js.UndefOr[typings.awsSdk.healthMod.availabilityZones] = js.native
  /**
    * A list of dates and times that the event ended.
    */
  var endTimes: js.UndefOr[dateTimeRangeList] = js.native
  /**
    * A list of entity ARNs (unique identifiers).
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  /**
    * A list of event ARNs (unique identifiers). For example: "arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-CDE456", "arn:aws:health:us-west-1::event/EBS/AWS_EBS_LOST_VOLUME/AWS_EBS_LOST_VOLUME_CHI789_JKL101" 
    */
  var eventArns: js.UndefOr[eventArnList] = js.native
  /**
    * A list of event status codes.
    */
  var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.native
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.native
  /**
    * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED". 
    */
  var eventTypeCodes: js.UndefOr[eventTypeList] = js.native
  /**
    * A list of dates and times that the event was last updated.
    */
  var lastUpdatedTimes: js.UndefOr[dateTimeRangeList] = js.native
  /**
    * A list of AWS regions.
    */
  var regions: js.UndefOr[regionList] = js.native
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
  /**
    * A list of dates and times that the event began.
    */
  var startTimes: js.UndefOr[dateTimeRangeList] = js.native
  /**
    * A map of entity tags attached to the affected entity.
    */
  var tags: js.UndefOr[tagFilter] = js.native
}

object EventFilter {
  @scala.inline
  def apply(
    availabilityZones: availabilityZones = null,
    endTimes: dateTimeRangeList = null,
    entityArns: entityArnList = null,
    entityValues: entityValueList = null,
    eventArns: eventArnList = null,
    eventStatusCodes: eventStatusCodeList = null,
    eventTypeCategories: eventTypeCategoryList = null,
    eventTypeCodes: eventTypeList = null,
    lastUpdatedTimes: dateTimeRangeList = null,
    regions: regionList = null,
    services: serviceList = null,
    startTimes: dateTimeRangeList = null,
    tags: tagFilter = null
  ): EventFilter = {
    val __obj = js.Dynamic.literal()
    if (availabilityZones != null) __obj.updateDynamic("availabilityZones")(availabilityZones.asInstanceOf[js.Any])
    if (endTimes != null) __obj.updateDynamic("endTimes")(endTimes.asInstanceOf[js.Any])
    if (entityArns != null) __obj.updateDynamic("entityArns")(entityArns.asInstanceOf[js.Any])
    if (entityValues != null) __obj.updateDynamic("entityValues")(entityValues.asInstanceOf[js.Any])
    if (eventArns != null) __obj.updateDynamic("eventArns")(eventArns.asInstanceOf[js.Any])
    if (eventStatusCodes != null) __obj.updateDynamic("eventStatusCodes")(eventStatusCodes.asInstanceOf[js.Any])
    if (eventTypeCategories != null) __obj.updateDynamic("eventTypeCategories")(eventTypeCategories.asInstanceOf[js.Any])
    if (eventTypeCodes != null) __obj.updateDynamic("eventTypeCodes")(eventTypeCodes.asInstanceOf[js.Any])
    if (lastUpdatedTimes != null) __obj.updateDynamic("lastUpdatedTimes")(lastUpdatedTimes.asInstanceOf[js.Any])
    if (regions != null) __obj.updateDynamic("regions")(regions.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services.asInstanceOf[js.Any])
    if (startTimes != null) __obj.updateDynamic("startTimes")(startTimes.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventFilter]
  }
}

