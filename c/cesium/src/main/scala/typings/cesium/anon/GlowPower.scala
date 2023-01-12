package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlowPower extends StObject {
  
  var color: js.UndefOr[Property | typings.cesium.mod.Color] = js.undefined
  
  var glowPower: js.UndefOr[Property | Double] = js.undefined
  
  var taperPower: js.UndefOr[Property | Double] = js.undefined
}
object GlowPower {
  
  inline def apply(): GlowPower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlowPower]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GlowPower] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Property | typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setGlowPower(value: Property | Double): Self = StObject.set(x, "glowPower", value.asInstanceOf[js.Any])
    
    inline def setGlowPowerUndefined: Self = StObject.set(x, "glowPower", js.undefined)
    
    inline def setTaperPower(value: Property | Double): Self = StObject.set(x, "taperPower", value.asInstanceOf[js.Any])
    
    inline def setTaperPowerUndefined: Self = StObject.set(x, "taperPower", js.undefined)
  }
}
