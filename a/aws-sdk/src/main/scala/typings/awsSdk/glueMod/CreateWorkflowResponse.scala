package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkflowResponse extends StObject {
  
  /**
    * The name of the workflow which was provided as part of the request.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object CreateWorkflowResponse {
  
  @scala.inline
  def apply(): CreateWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkflowResponse]
  }
  
  @scala.inline
  implicit class CreateWorkflowResponseMutableBuilder[Self <: CreateWorkflowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
