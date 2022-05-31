package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gamepad extends StObject {
  
  val displayId: Double
}
object Gamepad {
  
  inline def apply(displayId: Double): Gamepad = {
    val __obj = js.Dynamic.literal(displayId = displayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gamepad]
  }
  
  extension [Self <: Gamepad](x: Self) {
    
    inline def setDisplayId(value: Double): Self = StObject.set(x, "displayId", value.asInstanceOf[js.Any])
  }
}
