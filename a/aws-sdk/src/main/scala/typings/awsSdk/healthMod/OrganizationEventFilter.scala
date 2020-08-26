package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationEventFilter extends js.Object {
  /**
    * A list of 12-digit AWS account numbers that contains the affected entities.
    */
  var awsAccountIds: js.UndefOr[awsAccountIdsList] = js.native
  var endTime: js.UndefOr[DateTimeRange] = js.native
  /**
    * REPLACEME
    */
  var entityArns: js.UndefOr[entityArnList] = js.native
  /**
    * A list of entity identifiers, such as EC2 instance IDs (i-34ab692e) or EBS volumes (vol-426ab23e).
    */
  var entityValues: js.UndefOr[entityValueList] = js.native
  /**
    * A list of event status codes.
    */
  var eventStatusCodes: js.UndefOr[eventStatusCodeList] = js.native
  /**
    * REPLACEME
    */
  var eventTypeCategories: js.UndefOr[eventTypeCategoryList] = js.native
  /**
    * A list of unique identifiers for event types. For example, "AWS_EC2_SYSTEM_MAINTENANCE_EVENT","AWS_RDS_MAINTENANCE_SCHEDULED". 
    */
  var eventTypeCodes: js.UndefOr[eventTypeList] = js.native
  var lastUpdatedTime: js.UndefOr[DateTimeRange] = js.native
  /**
    * A list of AWS Regions.
    */
  var regions: js.UndefOr[regionList] = js.native
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.native
  var startTime: js.UndefOr[DateTimeRange] = js.native
}

object OrganizationEventFilter {
  @scala.inline
  def apply(): OrganizationEventFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationEventFilter]
  }
  @scala.inline
  implicit class OrganizationEventFilterOps[Self <: OrganizationEventFilter] (val x: Self) extends AnyVal {
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
    def setAwsAccountIdsVarargs(value: accountId*): Self = this.set("awsAccountIds", js.Array(value :_*))
    @scala.inline
    def setAwsAccountIds(value: awsAccountIdsList): Self = this.set("awsAccountIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccountIds: Self = this.set("awsAccountIds", js.undefined)
    @scala.inline
    def setEndTime(value: DateTimeRange): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
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
    def setEventStatusCodesVarargs(value: eventStatusCode*): Self = this.set("eventStatusCodes", js.Array(value :_*))
    @scala.inline
    def setEventStatusCodes(value: eventStatusCodeList): Self = this.set("eventStatusCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventStatusCodes: Self = this.set("eventStatusCodes", js.undefined)
    @scala.inline
    def setEventTypeCategoriesVarargs(value: eventTypeCategory*): Self = this.set("eventTypeCategories", js.Array(value :_*))
    @scala.inline
    def setEventTypeCategories(value: eventTypeCategoryList): Self = this.set("eventTypeCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypeCategories: Self = this.set("eventTypeCategories", js.undefined)
    @scala.inline
    def setEventTypeCodesVarargs(value: eventType*): Self = this.set("eventTypeCodes", js.Array(value :_*))
    @scala.inline
    def setEventTypeCodes(value: eventTypeList): Self = this.set("eventTypeCodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypeCodes: Self = this.set("eventTypeCodes", js.undefined)
    @scala.inline
    def setLastUpdatedTime(value: DateTimeRange): Self = this.set("lastUpdatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedTime: Self = this.set("lastUpdatedTime", js.undefined)
    @scala.inline
    def setRegionsVarargs(value: region*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: regionList): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
    @scala.inline
    def setServicesVarargs(value: service*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: serviceList): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    @scala.inline
    def setStartTime(value: DateTimeRange): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

