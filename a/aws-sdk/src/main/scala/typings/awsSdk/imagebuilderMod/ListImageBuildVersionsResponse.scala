package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImageBuildVersionsResponse extends js.Object {
  /**
    * The list of image build versions. 
    */
  var imageSummaryList: js.UndefOr[ImageSummaryList] = js.native
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object ListImageBuildVersionsResponse {
  @scala.inline
  def apply(): ListImageBuildVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImageBuildVersionsResponse]
  }
  @scala.inline
  implicit class ListImageBuildVersionsResponseOps[Self <: ListImageBuildVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setImageSummaryListVarargs(value: ImageSummary*): Self = this.set("imageSummaryList", js.Array(value :_*))
    @scala.inline
    def setImageSummaryList(value: ImageSummaryList): Self = this.set("imageSummaryList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageSummaryList: Self = this.set("imageSummaryList", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setRequestId(value: NonEmptyString): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

