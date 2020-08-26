package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListUniqueProblemsResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the unique problems. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var uniqueProblems: js.UndefOr[UniqueProblemsByExecutionResultMap] = js.native
}

object ListUniqueProblemsResult {
  @scala.inline
  def apply(): ListUniqueProblemsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUniqueProblemsResult]
  }
  @scala.inline
  implicit class ListUniqueProblemsResultOps[Self <: ListUniqueProblemsResult] (val x: Self) extends AnyVal {
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
    def setUniqueProblems(value: UniqueProblemsByExecutionResultMap): Self = this.set("uniqueProblems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniqueProblems: Self = this.set("uniqueProblems", js.undefined)
  }
  
}

