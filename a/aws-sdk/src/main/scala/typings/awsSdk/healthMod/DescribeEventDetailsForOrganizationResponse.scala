package typings.awsSdk.healthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventDetailsForOrganizationResponse extends js.Object {
  /**
    * Error messages for any events that could not be retrieved.
    */
  var failedSet: js.UndefOr[DescribeEventDetailsForOrganizationFailedSet] = js.native
  /**
    * Information about the events that could be retrieved.
    */
  var successfulSet: js.UndefOr[DescribeEventDetailsForOrganizationSuccessfulSet] = js.native
}

object DescribeEventDetailsForOrganizationResponse {
  @scala.inline
  def apply(
    failedSet: DescribeEventDetailsForOrganizationFailedSet = null,
    successfulSet: DescribeEventDetailsForOrganizationSuccessfulSet = null
  ): DescribeEventDetailsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (failedSet != null) __obj.updateDynamic("failedSet")(failedSet.asInstanceOf[js.Any])
    if (successfulSet != null) __obj.updateDynamic("successfulSet")(successfulSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventDetailsForOrganizationResponse]
  }
}

