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
  
  inline def apply(): GetTriggerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTriggerResponse]
  }
  
  extension [Self <: GetTriggerResponse](x: Self) {
    
    inline def setTrigger(value: Trigger): Self = StObject.set(x, "Trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "Trigger", js.undefined)
  }
}
