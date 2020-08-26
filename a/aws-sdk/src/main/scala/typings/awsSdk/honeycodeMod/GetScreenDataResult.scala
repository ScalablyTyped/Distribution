package typings.awsSdk.honeycodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetScreenDataResult extends js.Object {
  /**
    *  Provides the pagination token to load the next page if there are more results matching the request. If a pagination token is not present in the response, it means that all data matching the query has been loaded. 
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * A map of all the rows on the screen keyed by block name.
    */
  var results: ResultSetMap = js.native
  /**
    *  Indicates the cursor of the workbook at which the data returned by this workbook is read. Workbook cursor keeps increasing with every update and the increments are not sequential. 
    */
  var workbookCursor: WorkbookCursor = js.native
}

object GetScreenDataResult {
  @scala.inline
  def apply(results: ResultSetMap, workbookCursor: WorkbookCursor): GetScreenDataResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], workbookCursor = workbookCursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenDataResult]
  }
  @scala.inline
  implicit class GetScreenDataResultOps[Self <: GetScreenDataResult] (val x: Self) extends AnyVal {
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
    def setResults(value: ResultSetMap): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkbookCursor(value: WorkbookCursor): Self = this.set("workbookCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

