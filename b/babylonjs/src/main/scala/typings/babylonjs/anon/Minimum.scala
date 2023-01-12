package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Minimum extends StObject {
  
  var maximum: Vector3
  
  var minimum: Vector3
}
object Minimum {
  
  inline def apply(maximum: Vector3, minimum: Vector3): Minimum = {
    val __obj = js.Dynamic.literal(maximum = maximum.asInstanceOf[js.Any], minimum = minimum.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minimum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Minimum] (val x: Self) extends AnyVal {
    
    inline def setMaximum(value: Vector3): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMinimum(value: Vector3): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
  }
}
