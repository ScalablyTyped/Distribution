package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowAttributes extends StObject {
  
  /**
    * Workflow attributes specific to APPFLOW_INTEGRATION workflow.
    */
  var AppflowIntegration: js.UndefOr[AppflowIntegrationWorkflowAttributes] = js.undefined
}
object WorkflowAttributes {
  
  inline def apply(): WorkflowAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowAttributes]
  }
  
  extension [Self <: WorkflowAttributes](x: Self) {
    
    inline def setAppflowIntegration(value: AppflowIntegrationWorkflowAttributes): Self = StObject.set(x, "AppflowIntegration", value.asInstanceOf[js.Any])
    
    inline def setAppflowIntegrationUndefined: Self = StObject.set(x, "AppflowIntegration", js.undefined)
  }
}
