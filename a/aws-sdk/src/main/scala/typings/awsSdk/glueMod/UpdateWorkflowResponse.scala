package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkflowResponse extends StObject {
  
  /**
    * The name of the workflow which was specified in input.
    */
  var Name: js.UndefOr[NameString] = js.native
}
object UpdateWorkflowResponse {
  
  @scala.inline
  def apply(): UpdateWorkflowResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWorkflowResponse]
  }
  
  @scala.inline
  implicit class UpdateWorkflowResponseMutableBuilder[Self <: UpdateWorkflowResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
