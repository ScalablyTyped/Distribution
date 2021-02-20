package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInputRequest extends StObject {
  
  /**
    * Unique ID of the input
    */
  var InputId: string = js.native
}
object DeleteInputRequest {
  
  @scala.inline
  def apply(InputId: string): DeleteInputRequest = {
    val __obj = js.Dynamic.literal(InputId = InputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInputRequest]
  }
  
  @scala.inline
  implicit class DeleteInputRequestMutableBuilder[Self <: DeleteInputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputId(value: string): Self = StObject.set(x, "InputId", value.asInstanceOf[js.Any])
  }
}
