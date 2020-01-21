package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFlowTemplateRevisionsResponse extends js.Object {
  /**
    * The string to specify as nextToken when you request the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * An array of objects that provide summary data about each revision.
    */
  var summaries: js.UndefOr[FlowTemplateSummaries] = js.native
}

object GetFlowTemplateRevisionsResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, summaries: FlowTemplateSummaries = null): GetFlowTemplateRevisionsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (summaries != null) __obj.updateDynamic("summaries")(summaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFlowTemplateRevisionsResponse]
  }
}

