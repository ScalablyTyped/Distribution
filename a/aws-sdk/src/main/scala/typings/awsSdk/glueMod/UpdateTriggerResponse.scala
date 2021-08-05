package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTriggerResponse extends StObject {
  
  /**
    * The resulting trigger definition.
    */
  var Trigger: js.UndefOr[typings.awsSdk.glueMod.Trigger] = js.undefined
}
object UpdateTriggerResponse {
  
  inline def apply(): UpdateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateTriggerResponse]
  }
  
  extension [Self <: UpdateTriggerResponse](x: Self) {
    
    inline def setTrigger(value: Trigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "Trigger", js.undefined)
  }
}
