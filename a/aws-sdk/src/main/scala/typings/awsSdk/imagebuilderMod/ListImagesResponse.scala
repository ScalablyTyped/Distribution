package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImagesResponse extends js.Object {
  /**
    * The list of image semantic versions. 
    */
  var imageVersionList: js.UndefOr[ImageVersionList] = js.native
  /**
    * The next token used for paginated responses. When this is not empty, there are additional elements that the service has not included in this request. Use this token with the next request to retrieve additional objects. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
  /**
    * The request ID that uniquely identifies this request. 
    */
  var requestId: js.UndefOr[NonEmptyString] = js.native
}

object ListImagesResponse {
  @scala.inline
  def apply(): ListImagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImagesResponse]
  }
  @scala.inline
  implicit class ListImagesResponseOps[Self <: ListImagesResponse] (val x: Self) extends AnyVal {
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
    def setImageVersionListVarargs(value: ImageVersion*): Self = this.set("imageVersionList", js.Array(value :_*))
    @scala.inline
    def setImageVersionList(value: ImageVersionList): Self = this.set("imageVersionList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageVersionList: Self = this.set("imageVersionList", js.undefined)
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

