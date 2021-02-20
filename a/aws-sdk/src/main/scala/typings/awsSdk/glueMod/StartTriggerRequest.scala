package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to start.
    */
  var Name: NameString = js.native
}
object StartTriggerRequest {
  
  @scala.inline
  def apply(Name: NameString): StartTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTriggerRequest]
  }
  
  @scala.inline
  implicit class StartTriggerRequestMutableBuilder[Self <: StartTriggerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
