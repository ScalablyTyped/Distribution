package typings.dashjs.mod

import typings.dashjs.dashjsStrings.dynamicToStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicToStaticEvent
  extends StObject
     with Event {
  
  @JSName("type")
  var type_DynamicToStaticEvent: dynamicToStatic
}
object DynamicToStaticEvent {
  
  inline def apply(): DynamicToStaticEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("dynamicToStatic")
    __obj.asInstanceOf[DynamicToStaticEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicToStaticEvent] (val x: Self) extends AnyVal {
    
    inline def setType(value: dynamicToStatic): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
