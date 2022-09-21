package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPerfCustomEvent extends StObject {
  
  /**
    * The name of the event.
    */
  var name: String
  
  /**
    * The value for the event, if set we will use it as the value, otherwise we will count the number of occurrences.
    */
  var value: js.UndefOr[Double] = js.undefined
}
object IPerfCustomEvent {
  
  inline def apply(name: String): IPerfCustomEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPerfCustomEvent]
  }
  
  extension [Self <: IPerfCustomEvent](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
