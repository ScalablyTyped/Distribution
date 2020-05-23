package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJourneyExecutionActivityMetricsRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the journey activity.
    */
  var JourneyActivityId: string = js.native
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string = js.native
  /**
    * The  string that specifies which page of results to return in a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * The maximum number of items to include in each page of a paginated response. This parameter is not supported for application, campaign, and journey metrics.
    */
  var PageSize: js.UndefOr[string] = js.native
}

object GetJourneyExecutionActivityMetricsRequest {
  @scala.inline
  def apply(
    ApplicationId: string,
    JourneyActivityId: string,
    JourneyId: string,
    NextToken: string = null,
    PageSize: string = null
  ): GetJourneyExecutionActivityMetricsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyActivityId = JourneyActivityId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJourneyExecutionActivityMetricsRequest]
  }
}

