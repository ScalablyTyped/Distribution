package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorIntensity extends StObject {
  
  var color: js.UndefOr[typings.cesium.mod.Color] = js.native
  
  var intensity: js.UndefOr[Double] = js.native
}
object ColorIntensity {
  
  @scala.inline
  def apply(): ColorIntensity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorIntensity]
  }
  
  @scala.inline
  implicit class ColorIntensityMutableBuilder[Self <: ColorIntensity] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setIntensity(value: Double): Self = StObject.set(x, "intensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntensityUndefined: Self = StObject.set(x, "intensity", js.undefined)
  }
}
