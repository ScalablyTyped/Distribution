package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridProjectsRequest extends js.Object {
  /**
    * Return no more than this number of results.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  /**
    * From a response, used to continue a paginated listing. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListTestGridProjectsRequest {
  @scala.inline
  def apply(): ListTestGridProjectsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridProjectsRequest]
  }
  @scala.inline
  implicit class ListTestGridProjectsRequestOps[Self <: ListTestGridProjectsRequest] (val x: Self) extends AnyVal {
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
    def setMaxResult(value: MaxPageSize): Self = this.set("maxResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResult: Self = this.set("maxResult", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

