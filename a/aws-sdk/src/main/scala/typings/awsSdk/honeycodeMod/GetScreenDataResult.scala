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
  def apply(results: ResultSetMap, workbookCursor: WorkbookCursor, nextToken: PaginationToken = null): GetScreenDataResult = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], workbookCursor = workbookCursor.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetScreenDataResult]
  }
}

