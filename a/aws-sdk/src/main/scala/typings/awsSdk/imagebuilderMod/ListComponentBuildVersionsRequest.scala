package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListComponentBuildVersionsRequest extends js.Object {
  /**
    * The component version Amazon Resource Name (ARN) whose versions you want to list. 
    */
  var componentVersionArn: ComponentVersionArn = js.native
  /**
    * The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListComponentBuildVersionsRequest {
  @scala.inline
  def apply(
    componentVersionArn: ComponentVersionArn,
    maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
    nextToken: NonEmptyString = null
  ): ListComponentBuildVersionsRequest = {
    val __obj = js.Dynamic.literal(componentVersionArn = componentVersionArn.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListComponentBuildVersionsRequest]
  }
}

