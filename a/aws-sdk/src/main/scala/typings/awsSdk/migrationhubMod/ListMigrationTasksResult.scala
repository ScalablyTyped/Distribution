package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMigrationTasksResult extends StObject {
  
  /**
    * Lists the migration task's summary which includes: MigrationTaskName, ProgressPercent, ProgressUpdateStream, Status, and the UpdateDateTime for each task.
    */
  var MigrationTaskSummaryList: js.UndefOr[typings.awsSdk.migrationhubMod.MigrationTaskSummaryList] = js.native
  
  /**
    * If there are more migration tasks than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
}
object ListMigrationTasksResult {
  
  @scala.inline
  def apply(): ListMigrationTasksResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMigrationTasksResult]
  }
  
  @scala.inline
  implicit class ListMigrationTasksResultMutableBuilder[Self <: ListMigrationTasksResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMigrationTaskSummaryList(value: MigrationTaskSummaryList): Self = StObject.set(x, "MigrationTaskSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrationTaskSummaryListUndefined: Self = StObject.set(x, "MigrationTaskSummaryList", js.undefined)
    
    @scala.inline
    def setMigrationTaskSummaryListVarargs(value: MigrationTaskSummary*): Self = StObject.set(x, "MigrationTaskSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
