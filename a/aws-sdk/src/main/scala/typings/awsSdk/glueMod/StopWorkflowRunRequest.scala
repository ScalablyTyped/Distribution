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
  
  @scala.inline
  def apply(Name: NameString, RunId: IdString): StopWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopWorkflowRunRequest]
  }
  
  @scala.inline
  implicit class StopWorkflowRunRequestMutableBuilder[Self <: StopWorkflowRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
