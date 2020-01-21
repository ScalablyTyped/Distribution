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
  def apply(organizationEventDetailFilters: OrganizationEventDetailFiltersList, locale: locale = null): DescribeEventDetailsForOrganizationRequest = {
    val __obj = js.Dynamic.literal(organizationEventDetailFilters = organizationEventDetailFilters.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationRequest]
  }
}

