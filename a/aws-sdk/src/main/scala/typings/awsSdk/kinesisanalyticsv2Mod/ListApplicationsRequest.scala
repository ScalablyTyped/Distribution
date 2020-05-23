package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListApplicationsRequest extends js.Object {
  /**
    * The maximum number of applications to list.
    */
  var Limit: js.UndefOr[ListApplicationsInputLimit] = js.native
  /**
    * If a previous command returned a pagination token, pass it into this value to retrieve the next set of results. For more information about pagination, see Using the AWS Command Line Interface's Pagination Options.
    */
  var NextToken: js.UndefOr[ApplicationName] = js.native
}

object ListApplicationsRequest {
  @scala.inline
  def apply(Limit: js.UndefOr[ListApplicationsInputLimit] = js.undefined, NextToken: ApplicationName = null): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListApplicationsRequest]
  }
}

