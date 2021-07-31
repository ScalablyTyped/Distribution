package typings.awsSdk.cloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHapgResponse extends StObject {
  
  /**
    * The status of the action.
    */
  var Status: String
}
object DeleteHapgResponse {
  
  @scala.inline
  def apply(Status: String): DeleteHapgResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHapgResponse]
  }
  
  @scala.inline
  implicit class DeleteHapgResponseMutableBuilder[Self <: DeleteHapgResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
