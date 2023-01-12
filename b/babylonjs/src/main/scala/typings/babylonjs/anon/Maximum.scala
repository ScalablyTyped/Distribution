package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Maximum extends StObject {
  
  var maximum: Vector3
  
  var minimum: Vector3
}
object Maximum {
  
  inline def apply(maximum: Vector3, minimum: Vector3): Maximum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maximum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Maximum] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: Vector3): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Vector3): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
