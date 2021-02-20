package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTriggerRequest extends StObject {
  
  /**
    * The name of the trigger to update.
    */
  var Name: NameString = js.native
  
  /**
    * The new values with which to update the trigger.
    */
  var TriggerUpdate: typings.awsSdk.glueMod.TriggerUpdate = js.native
}
object UpdateTriggerRequest {
  
  @scala.inline
  def apply(Name: NameString, TriggerUpdate: TriggerUpdate): UpdateTriggerRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], TriggerUpdate = TriggerUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTriggerRequest]
  }
  
  @scala.inline
  implicit class UpdateTriggerRequestMutableBuilder[Self <: UpdateTriggerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUpdate(value: TriggerUpdate): Self = StObject.set(x, "TriggerUpdate", value.asInstanceOf[js.Any])
  }
}
