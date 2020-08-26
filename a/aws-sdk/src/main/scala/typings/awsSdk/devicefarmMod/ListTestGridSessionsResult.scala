package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionsResult extends js.Object {
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The sessions that match the criteria in a ListTestGridSessionsRequest. 
    */
  var testGridSessions: js.UndefOr[TestGridSessions] = js.native
}

object ListTestGridSessionsResult {
  @scala.inline
  def apply(): ListTestGridSessionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridSessionsResult]
  }
  @scala.inline
  implicit class ListTestGridSessionsResultOps[Self <: ListTestGridSessionsResult] (val x: Self) extends AnyVal {
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
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setTestGridSessionsVarargs(value: TestGridSession*): Self = this.set("testGridSessions", js.Array(value :_*))
    @scala.inline
    def setTestGridSessions(value: TestGridSessions): Self = this.set("testGridSessions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestGridSessions: Self = this.set("testGridSessions", js.undefined)
  }
  
}

