package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventDetailsForOrganizationRequest extends js.Object {
  /**
    * The locale (language) to return information in. English (en) is the default and the only supported value at this time.
    */
  var locale: js.UndefOr[typings.awsSdk.healthMod.locale] = js.native
  /**
    * A set of JSON elements that includes the awsAccountId and the eventArn.
    */
  var organizationEventDetailFilters: OrganizationEventDetailFiltersList = js.native
}

object DescribeEventDetailsForOrganizationRequest {
  @scala.inline
  def apply(organizationEventDetailFilters: OrganizationEventDetailFiltersList): DescribeEventDetailsForOrganizationRequest = {
    val __obj = js.Dynamic.literal(organizationEventDetailFilters = organizationEventDetailFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationRequest]
  }
  @scala.inline
  implicit class DescribeEventDetailsForOrganizationRequestOps[Self <: DescribeEventDetailsForOrganizationRequest] (val x: Self) extends AnyVal {
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
    def setOrganizationEventDetailFiltersVarargs(value: EventAccountFilter*): Self = this.set("organizationEventDetailFilters", js.Array(value :_*))
    @scala.inline
    def setOrganizationEventDetailFilters(value: OrganizationEventDetailFiltersList): Self = this.set("organizationEventDetailFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
  }
  
}

