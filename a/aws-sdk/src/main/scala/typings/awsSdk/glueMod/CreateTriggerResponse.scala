package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTriggerResponse extends StObject {
  
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}
object CreateTriggerResponse {
  
  @scala.inline
  def apply(): CreateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTriggerResponse]
  }
  
  @scala.inline
  implicit class CreateTriggerResponseMutableBuilder[Self <: CreateTriggerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
