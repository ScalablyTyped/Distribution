package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImagesResponse extends js.Object {
  /**
    * The list of image IDs for the requested repository.
    */
  var imageIds: js.UndefOr[ImageIdentifierList] = js.native
  /**
    * The nextToken value to include in a future ListImages request. When the results of a ListImages request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
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
    def setImageIdsVarargs(value: ImageIdentifier*): Self = this.set("imageIds", js.Array(value :_*))
    @scala.inline
    def setImageIds(value: ImageIdentifierList): Self = this.set("imageIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageIds: Self = this.set("imageIds", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

