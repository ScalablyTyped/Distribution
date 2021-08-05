package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlowPower extends StObject {
  
  var color: js.UndefOr[Property] = js.undefined
  
  var glowPower: js.UndefOr[Property] = js.undefined
}
object GlowPower {
  
  inline def apply(): GlowPower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlowPower]
  }
  
  extension [Self <: GlowPower](x: Self) {
    
    inline def setColor(value: Property): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setGlowPower(value: Property): Self = StObject.set(x, "glowPower", value.asInstanceOf[js.Any])
    
    inline def setGlowPowerUndefined: Self = StObject.set(x, "glowPower", js.undefined)
  }
}
