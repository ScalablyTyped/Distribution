package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMigrationTasksResult extends js.Object {
  
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
  implicit class ListMigrationTasksResultOps[Self <: ListMigrationTasksResult] (val x: Self) extends AnyVal {
    
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
    def setMigrationTaskSummaryListVarargs(value: MigrationTaskSummary*): Self = this.set("MigrationTaskSummaryList", js.Array(value :_*))
    
    @scala.inline
    def setMigrationTaskSummaryList(value: MigrationTaskSummaryList): Self = this.set("MigrationTaskSummaryList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMigrationTaskSummaryList: Self = this.set("MigrationTaskSummaryList", js.undefined)
    
    @scala.inline
    def setNextToken(value: Token): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
