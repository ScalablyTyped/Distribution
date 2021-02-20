package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to stop.
    */
  var Name: NameString = js.native
}
object StopTriggerRequest {
  
  @scala.inline
  def apply(Name: NameString): StopTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTriggerRequest]
  }
  
  @scala.inline
  implicit class StopTriggerRequestMutableBuilder[Self <: StopTriggerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
