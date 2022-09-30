package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMigrationWorkflowTemplateRequest extends StObject {
  
  /**
    * The ID of the template.
    */
  var id: TemplateId
}
object GetMigrationWorkflowTemplateRequest {
  
  inline def apply(id: TemplateId): GetMigrationWorkflowTemplateRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMigrationWorkflowTemplateRequest]
  }
  
  extension [Self <: GetMigrationWorkflowTemplateRequest](x: Self) {
    
    inline def setId(value: TemplateId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
