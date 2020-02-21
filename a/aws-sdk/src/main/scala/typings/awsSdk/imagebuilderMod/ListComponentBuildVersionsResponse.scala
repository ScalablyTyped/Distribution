package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentBuildVersionsResponse extends js.Object {
  /**
    *  The list of component summaries for the specified semantic version. 
    */
  var componentSummaryList: js.UndefOr[ComponentSummaryList] = js.native
  /**
    *  The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object ListComponentBuildVersionsResponse {
  @scala.inline
  def apply(
    componentSummaryList: ComponentSummaryList = null,
    nextToken: NonEmptyString = null,
    requestId: NonEmptyString = null
  ): ListComponentBuildVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (componentSummaryList != null) __obj.updateDynamic("componentSummaryList")(componentSummaryList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentBuildVersionsResponse]
  }
}

