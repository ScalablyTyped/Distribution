package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTemplatesResponse extends js.Object {
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
  /**
    * A structure containing information about the templates in the list.
    */
  var TemplateSummaryList: js.UndefOr[typings.awsSdk.quicksightMod.TemplateSummaryList] = js.native
}

object ListTemplatesResponse {
  @scala.inline
  def apply(
    NextToken: String = null,
    RequestId: String = null,
    Status: Int | scala.Double = null,
    TemplateSummaryList: TemplateSummaryList = null
  ): ListTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TemplateSummaryList != null) __obj.updateDynamic("TemplateSummaryList")(TemplateSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTemplatesResponse]
  }
}

