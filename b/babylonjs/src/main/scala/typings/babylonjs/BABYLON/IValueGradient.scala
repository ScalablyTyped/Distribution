package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IValueGradient extends StObject {
  
  /**
    * Gets or sets the gradient value (between 0 and 1)
    */
  var gradient: Double
}
object IValueGradient {
  
  inline def apply(gradient: Double): IValueGradient = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[IValueGradient]
  }
  
  extension [Self <: IValueGradient](x: Self) {
    
    inline def setGradient(value: Double): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
  }
}
