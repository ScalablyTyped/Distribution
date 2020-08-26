package typings.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCollectionsRequest extends js.Object {
  /**
    * Maximum number of collection IDs to return. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * Pagination token from the previous response.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListCollectionsRequest {
  @scala.inline
  def apply(): ListCollectionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsRequest]
  }
  @scala.inline
  implicit class ListCollectionsRequestOps[Self <: ListCollectionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

