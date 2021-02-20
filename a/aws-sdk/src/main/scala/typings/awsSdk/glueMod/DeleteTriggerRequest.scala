package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to delete.
    */
  var Name: NameString = js.native
}
object DeleteTriggerRequest {
  
  @scala.inline
  def apply(Name: NameString): DeleteTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTriggerRequest]
  }
  
  @scala.inline
  implicit class DeleteTriggerRequestMutableBuilder[Self <: DeleteTriggerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
