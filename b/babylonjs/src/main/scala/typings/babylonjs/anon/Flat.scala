package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotvectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Flat extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var flat: js.UndefOr[Boolean] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var radiusX: js.UndefOr[Double] = js.undefined
  
  var radiusY: js.UndefOr[Double] = js.undefined
  
  var radiusZ: js.UndefOr[Double] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var subdivisions: js.UndefOr[Double] = js.undefined
}
object Flat {
  
  inline def apply(): Flat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Flat] (val x: Self) extends AnyVal {
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
    
    inline def setRadiusXUndefined: Self = StObject.set(x, "radiusX", js.undefined)
    
    inline def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    
    inline def setRadiusYUndefined: Self = StObject.set(x, "radiusY", js.undefined)
    
    inline def setRadiusZ(value: Double): Self = StObject.set(x, "radiusZ", value.asInstanceOf[js.Any])
    
    inline def setRadiusZUndefined: Self = StObject.set(x, "radiusZ", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
  }
}
