package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImagePipelineImagesRequest extends js.Object {
  /**
    * The filters. 
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image pipeline whose images you want to view. 
    */
  var imagePipelineArn: ImagePipelineArn = js.native
  /**
    * The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListImagePipelineImagesRequest {
  @scala.inline
  def apply(
    imagePipelineArn: ImagePipelineArn,
    filters: FilterList = null,
    maxResults: js.UndefOr[RestrictedInteger] = js.undefined,
    nextToken: NonEmptyString = null
  ): ListImagePipelineImagesRequest = {
    val __obj = js.Dynamic.literal(imagePipelineArn = imagePipelineArn.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImagePipelineImagesRequest]
  }
}

