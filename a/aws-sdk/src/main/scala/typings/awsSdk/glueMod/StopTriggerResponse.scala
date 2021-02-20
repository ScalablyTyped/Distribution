package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopTriggerResponse extends StObject {
  
  /**
    * The name of the trigger that was stopped.
    */
  var Name: js.UndefOr[NameString] = js.native
}
object StopTriggerResponse {
  
  @scala.inline
  def apply(): StopTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTriggerResponse]
  }
  
  @scala.inline
  implicit class StopTriggerResponseMutableBuilder[Self <: StopTriggerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
