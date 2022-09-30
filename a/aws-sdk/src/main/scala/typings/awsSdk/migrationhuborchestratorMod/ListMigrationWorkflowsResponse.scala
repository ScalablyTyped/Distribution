package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMigrationWorkflowsResponse extends StObject {
  
  /**
    * The summary of the migration workflow.
    */
  var migrationWorkflowSummary: MigrationWorkflowSummaryList
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListMigrationWorkflowsResponse {
  
  inline def apply(migrationWorkflowSummary: MigrationWorkflowSummaryList): ListMigrationWorkflowsResponse = {
    val __obj = js.Dynamic.literal(migrationWorkflowSummary = migrationWorkflowSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMigrationWorkflowsResponse]
  }
  
  extension [Self <: ListMigrationWorkflowsResponse](x: Self) {
    
    inline def setMigrationWorkflowSummary(value: MigrationWorkflowSummaryList): Self = StObject.set(x, "migrationWorkflowSummary", value.asInstanceOf[js.Any])
    
    inline def setMigrationWorkflowSummaryVarargs(value: MigrationWorkflowSummary*): Self = StObject.set(x, "migrationWorkflowSummary", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
