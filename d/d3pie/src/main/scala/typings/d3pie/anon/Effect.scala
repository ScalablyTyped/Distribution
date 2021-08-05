package typings.d3pie.anon

import typings.d3pie.d3pieStrings.default
import typings.d3pie.d3pieStrings.none
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Effect extends StObject {
  
  var effect: js.UndefOr[none | default] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
}
object Effect {
  
  inline def apply(): Effect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Effect]
  }
  
  extension [Self <: Effect](x: Self) {
    
    inline def setEffect(value: none | default): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
