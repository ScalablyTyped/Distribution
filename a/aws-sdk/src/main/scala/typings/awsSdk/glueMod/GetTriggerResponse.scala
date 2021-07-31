package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTriggerResponse extends StObject {
  
  /**
    * The requested trigger definition.
    */
  var Trigger: js.UndefOr[typings.awsSdk.glueMod.Trigger] = js.undefined
}
object GetTriggerResponse {
  
  @scala.inline
  def apply(): GetTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggerResponse]
  }
  
  @scala.inline
  implicit class GetTriggerResponseMutableBuilder[Self <: GetTriggerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrigger(value: Trigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerUndefined: Self = StObject.set(x, "Trigger", js.undefined)
  }
}
