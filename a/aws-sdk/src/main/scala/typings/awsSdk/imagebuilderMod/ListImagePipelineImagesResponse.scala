package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImagePipelineImagesResponse extends js.Object {
  /**
    *  The list of images built by this pipeline. 
    */
  var imageSummaryList: js.UndefOr[ImageSummaryList] = js.native
  /**
    *  The next token used for paginated responses. When this is not empty then there are additional elements that the service that not include in this request. Use this token with the next request to retrieve additional object. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    *  The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object ListImagePipelineImagesResponse {
  @scala.inline
  def apply(
    imageSummaryList: ImageSummaryList = null,
    nextToken: NonEmptyString = null,
    requestId: NonEmptyString = null
  ): ListImagePipelineImagesResponse = {
    val __obj = js.Dynamic.literal()
    if (imageSummaryList != null) __obj.updateDynamic("imageSummaryList")(imageSummaryList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (requestId != null) __obj.updateDynamic("requestId")(requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImagePipelineImagesResponse]
  }
}

