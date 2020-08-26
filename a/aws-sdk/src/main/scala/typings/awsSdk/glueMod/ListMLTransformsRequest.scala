package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMLTransformsRequest extends js.Object {
  /**
    * A TransformFilterCriteria used to filter the machine learning transforms.
    */
  var Filter: js.UndefOr[TransformFilterCriteria] = js.native
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.native
  /**
    * A continuation token, if this is a continuation request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A TransformSortCriteria used to sort the machine learning transforms.
    */
  var Sort: js.UndefOr[TransformSortCriteria] = js.native
  /**
    * Specifies to return only these tagged resources.
    */
  var Tags: js.UndefOr[TagsMap] = js.native
}

object ListMLTransformsRequest {
  @scala.inline
  def apply(): ListMLTransformsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMLTransformsRequest]
  }
  @scala.inline
  implicit class ListMLTransformsRequestOps[Self <: ListMLTransformsRequest] (val x: Self) extends AnyVal {
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
    def setFilter(value: TransformFilterCriteria): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setMaxResults(value: PageSize): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setSort(value: TransformSortCriteria): Self = this.set("Sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("Sort", js.undefined)
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

