package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListHITsResponse extends js.Object {
  /**
    *  The list of HIT elements returned by the query.
    */
  var HITs: js.UndefOr[HITList] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The number of HITs on this page in the filtered results list, equivalent to the number of HITs being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.native
}

object ListHITsResponse {
  @scala.inline
  def apply(): ListHITsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListHITsResponse]
  }
  @scala.inline
  implicit class ListHITsResponseOps[Self <: ListHITsResponse] (val x: Self) extends AnyVal {
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
    def setHITsVarargs(value: HIT*): Self = this.set("HITs", js.Array(value :_*))
    @scala.inline
    def setHITs(value: HITList): Self = this.set("HITs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHITs: Self = this.set("HITs", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setNumResults(value: Integer): Self = this.set("NumResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumResults: Self = this.set("NumResults", js.undefined)
  }
  
}

