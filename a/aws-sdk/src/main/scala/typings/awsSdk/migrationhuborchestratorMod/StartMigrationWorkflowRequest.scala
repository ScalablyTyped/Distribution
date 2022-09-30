package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartMigrationWorkflowRequest extends StObject {
  
  /**
    * The ID of the migration workflow.
    */
  var id: MigrationWorkflowId
}
object StartMigrationWorkflowRequest {
  
  inline def apply(id: MigrationWorkflowId): StartMigrationWorkflowRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartMigrationWorkflowRequest]
  }
  
  extension [Self <: StartMigrationWorkflowRequest](x: Self) {
    
    inline def setId(value: MigrationWorkflowId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
