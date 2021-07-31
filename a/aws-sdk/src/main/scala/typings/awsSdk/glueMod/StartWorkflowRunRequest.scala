package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartWorkflowRunRequest extends StObject {
  
  /**
    * The name of the workflow to start.
    */
  var Name: NameString
}
object StartWorkflowRunRequest {
  
  @scala.inline
  def apply(Name: NameString): StartWorkflowRunRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartWorkflowRunRequest]
  }
  
  @scala.inline
  implicit class StartWorkflowRunRequestMutableBuilder[Self <: StartWorkflowRunRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
