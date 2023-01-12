package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Cartesian3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndColor extends StObject {
  
  var endColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var endScale: js.UndefOr[Double] = js.undefined
  
  var image: js.UndefOr[Any] = js.undefined
  
  var imageSize: js.UndefOr[Cartesian2] = js.undefined
  
  var life: js.UndefOr[Double] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[Cartesian3] = js.undefined
  
  var startColor: js.UndefOr[typings.cesium.mod.Color] = js.undefined
  
  var startScale: js.UndefOr[Double] = js.undefined
  
  var velocity: js.UndefOr[Cartesian3] = js.undefined
}
object EndColor {
  
  inline def apply(): EndColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EndColor] (val x: Self) extends AnyVal {
    
    inline def setEndColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    inline def setEndScale(value: Double): Self = StObject.set(x, "endScale", value.asInstanceOf[js.Any])
    
    inline def setEndScaleUndefined: Self = StObject.set(x, "endScale", js.undefined)
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageSize(value: Cartesian2): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLife(value: Double): Self = StObject.set(x, "life", value.asInstanceOf[js.Any])
    
    inline def setLifeUndefined: Self = StObject.set(x, "life", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setPosition(value: Cartesian3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStartColor(value: typings.cesium.mod.Color): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    
    inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    
    inline def setStartScale(value: Double): Self = StObject.set(x, "startScale", value.asInstanceOf[js.Any])
    
    inline def setStartScaleUndefined: Self = StObject.set(x, "startScale", js.undefined)
    
    inline def setVelocity(value: Cartesian3): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
    
    inline def setVelocityUndefined: Self = StObject.set(x, "velocity", js.undefined)
  }
}
