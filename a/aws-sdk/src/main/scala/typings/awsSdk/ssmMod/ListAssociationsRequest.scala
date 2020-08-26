package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAssociationsRequest extends js.Object {
  /**
    * One or more filters. Use a filter to return a more specific list of results.
    */
  var AssociationFilterList: js.UndefOr[typings.awsSdk.ssmMod.AssociationFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
}

object ListAssociationsRequest {
  @scala.inline
  def apply(): ListAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAssociationsRequest]
  }
  @scala.inline
  implicit class ListAssociationsRequestOps[Self <: ListAssociationsRequest] (val x: Self) extends AnyVal {
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
    def setAssociationFilterListVarargs(value: AssociationFilter*): Self = this.set("AssociationFilterList", js.Array(value :_*))
    @scala.inline
    def setAssociationFilterList(value: AssociationFilterList): Self = this.set("AssociationFilterList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationFilterList: Self = this.set("AssociationFilterList", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

