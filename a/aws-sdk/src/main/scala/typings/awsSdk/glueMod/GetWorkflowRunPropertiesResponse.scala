package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRunPropertiesResponse extends StObject {
  
  /**
    * The workflow run properties which were set during the specified run.
    */
  var RunProperties: js.UndefOr[WorkflowRunProperties] = js.undefined
}
object GetWorkflowRunPropertiesResponse {
  
  inline def apply(): GetWorkflowRunPropertiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetWorkflowRunPropertiesResponse]
  }
  
  extension [Self <: GetWorkflowRunPropertiesResponse](x: Self) {
    
    inline def setRunProperties(value: WorkflowRunProperties): Self = StObject.set(x, "RunProperties", value.asInstanceOf[js.Any])
    
    inline def setRunPropertiesUndefined: Self = StObject.set(x, "RunProperties", js.undefined)
  }
}
