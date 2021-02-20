package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteWorkflowRequest extends StObject {
  
  /**
    * Name of the workflow to be deleted.
    */
  var Name: NameString = js.native
}
object DeleteWorkflowRequest {
  
  @scala.inline
  def apply(Name: NameString): DeleteWorkflowRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkflowRequest]
  }
  
  @scala.inline
  implicit class DeleteWorkflowRequestMutableBuilder[Self <: DeleteWorkflowRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
