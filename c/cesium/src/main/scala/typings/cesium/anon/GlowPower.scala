package typings.cesium.anon

import typings.cesium.mod.Property
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GlowPower extends StObject {
  
  var color: js.UndefOr[Property] = js.native
  
  var glowPower: js.UndefOr[Property] = js.native
}
object GlowPower {
  
  @scala.inline
  def apply(): GlowPower = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlowPower]
  }
  
  @scala.inline
  implicit class GlowPowerMutableBuilder[Self <: GlowPower] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Property): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setGlowPower(value: Property): Self = StObject.set(x, "glowPower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlowPowerUndefined: Self = StObject.set(x, "glowPower", js.undefined)
  }
}
