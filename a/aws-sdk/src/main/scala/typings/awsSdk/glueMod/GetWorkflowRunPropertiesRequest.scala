package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetWorkflowRunPropertiesRequest extends StObject {
  
  /**
    * Name of the workflow which was run.
    */
  var Name: NameString
  
  /**
    * The ID of the workflow run whose run properties should be returned.
    */
  var RunId: IdString
}
object GetWorkflowRunPropertiesRequest {
  
  @scala.inline
  def apply(Name: NameString, RunId: IdString): GetWorkflowRunPropertiesRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RunId = RunId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkflowRunPropertiesRequest]
  }
  
  @scala.inline
  implicit class GetWorkflowRunPropertiesRequestMutableBuilder[Self <: GetWorkflowRunPropertiesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunId(value: IdString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
  }
}
