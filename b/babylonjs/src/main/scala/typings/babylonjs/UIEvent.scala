package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Babylon Extension to enable UIEvents to work with our IUIEvents
trait UIEvent extends StObject {
  
  var inputIndex: Double
}
object UIEvent {
  
  inline def apply(inputIndex: Double): UIEvent = {
    val __obj = js.Dynamic.literal(inputIndex = inputIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIEvent]
  }
  
  extension [Self <: UIEvent](x: Self) {
    
    inline def setInputIndex(value: Double): Self = StObject.set(x, "inputIndex", value.asInstanceOf[js.Any])
  }
}
