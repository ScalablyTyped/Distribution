package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadiusX extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var flat: js.UndefOr[Boolean] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var radiusX: js.UndefOr[Double] = js.native
  
  var radiusY: js.UndefOr[Double] = js.native
  
  var radiusZ: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
}
object RadiusX {
  
  @scala.inline
  def apply(): RadiusX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadiusX]
  }
  
  @scala.inline
  implicit class RadiusXMutableBuilder[Self <: RadiusX] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRadiusX(value: Double): Self = StObject.set(x, "radiusX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusXUndefined: Self = StObject.set(x, "radiusX", js.undefined)
    
    @scala.inline
    def setRadiusY(value: Double): Self = StObject.set(x, "radiusY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusYUndefined: Self = StObject.set(x, "radiusY", js.undefined)
    
    @scala.inline
    def setRadiusZ(value: Double): Self = StObject.set(x, "radiusZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusZUndefined: Self = StObject.set(x, "radiusZ", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
  }
}
