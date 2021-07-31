package typings.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInputRequest extends StObject {
  
  /**
    * The name of the input to delete.
    */
  var inputName: InputName
}
object DeleteInputRequest {
  
  @scala.inline
  def apply(inputName: InputName): DeleteInputRequest = {
    val __obj = js.Dynamic.literal(inputName = inputName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputRequest]
  }
  
  @scala.inline
  implicit class DeleteInputRequestMutableBuilder[Self <: DeleteInputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputName(value: InputName): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
  }
}
