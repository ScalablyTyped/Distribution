package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopWorkflowRunRequest extends StObject {
  
  /**
    * The name of the workflow to stop.
    */
  var Name: NameString
  
  /**
    * The ID of the workflow run to stop.
    */
  var RunId: IdString
}
object StopWorkflowRunRequest {
  
  inline def apply(Name: NameString, RunId: IdString): StopWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopWorkflowRunRequest]
  }
  
  extension [Self <: StopWorkflowRunRequest](x: Self) {
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
