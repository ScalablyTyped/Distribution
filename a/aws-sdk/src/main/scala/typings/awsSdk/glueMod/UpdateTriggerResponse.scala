package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateTriggerResponse extends StObject {
  
  /**
    * The resulting trigger definition.
    */
  var Trigger: js.UndefOr[typings.awsSdk.glueMod.Trigger] = js.native
}
object UpdateTriggerResponse {
  
  @scala.inline
  def apply(): UpdateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTriggerResponse]
  }
  
  @scala.inline
  implicit class UpdateTriggerResponseMutableBuilder[Self <: UpdateTriggerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrigger(value: Trigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "Trigger", js.undefined)
  }
}
