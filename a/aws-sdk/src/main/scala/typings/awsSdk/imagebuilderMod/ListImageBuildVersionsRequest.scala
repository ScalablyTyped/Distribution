package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListImageBuildVersionsRequest extends js.Object {
  /**
    * The filters. 
    */
  var filters: js.UndefOr[FilterList] = js.native
  /**
    * The Amazon Resource Name (ARN) of the image whose build versions you want to retrieve. 
    */
  var imageVersionArn: ImageVersionArn = js.native
  /**
    * The maximum items to return in a request. 
    */
  var maxResults: js.UndefOr[RestrictedInteger] = js.native
  /**
    * A token to specify where to start paginating. This is the NextToken from a previously truncated response. 
    */
  var nextToken: js.UndefOr[NonEmptyString] = js.native
}

object ListImageBuildVersionsRequest {
  @scala.inline
  def apply(imageVersionArn: ImageVersionArn): ListImageBuildVersionsRequest = {
    val __obj = js.Dynamic.literal(imageVersionArn = imageVersionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListImageBuildVersionsRequest]
  }
  @scala.inline
  implicit class ListImageBuildVersionsRequestOps[Self <: ListImageBuildVersionsRequest] (val x: Self) extends AnyVal {
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
    def setImageVersionArn(value: ImageVersionArn): Self = this.set("imageVersionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = this.set("filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: FilterList): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
    @scala.inline
    def setMaxResults(value: RestrictedInteger): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NonEmptyString): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

