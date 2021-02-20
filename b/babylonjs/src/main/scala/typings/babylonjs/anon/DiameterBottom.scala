package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiameterBottom extends StObject {
  
  var arc: js.UndefOr[Double] = js.native
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var diameter: js.UndefOr[Double] = js.native
  
  var diameterBottom: js.UndefOr[Double] = js.native
  
  var diameterTop: js.UndefOr[Double] = js.native
  
  var enclose: js.UndefOr[Boolean] = js.native
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var hasRings: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var subdivisions: js.UndefOr[Double] = js.native
  
  var tessellation: js.UndefOr[Double] = js.native
}
object DiameterBottom {
  
  @scala.inline
  def apply(): DiameterBottom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiameterBottom]
  }
  
  @scala.inline
  implicit class DiameterBottomMutableBuilder[Self <: DiameterBottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterBottom(value: Double): Self = StObject.set(x, "diameterBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterBottomUndefined: Self = StObject.set(x, "diameterBottom", js.undefined)
    
    @scala.inline
    def setDiameterTop(value: Double): Self = StObject.set(x, "diameterTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiameterTopUndefined: Self = StObject.set(x, "diameterTop", js.undefined)
    
    @scala.inline
    def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    @scala.inline
    def setEnclose(value: Boolean): Self = StObject.set(x, "enclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncloseUndefined: Self = StObject.set(x, "enclose", js.undefined)
    
    @scala.inline
    def setFaceColors(value: js.Array[Color4]): Self = StObject.set(x, "faceColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceColorsUndefined: Self = StObject.set(x, "faceColors", js.undefined)
    
    @scala.inline
    def setFaceColorsVarargs(value: Color4*): Self = StObject.set(x, "faceColors", js.Array(value :_*))
    
    @scala.inline
    def setFaceUV(value: js.Array[Vector4]): Self = StObject.set(x, "faceUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaceUVUndefined: Self = StObject.set(x, "faceUV", js.undefined)
    
    @scala.inline
    def setFaceUVVarargs(value: Vector4*): Self = StObject.set(x, "faceUV", js.Array(value :_*))
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setHasRings(value: Boolean): Self = StObject.set(x, "hasRings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRingsUndefined: Self = StObject.set(x, "hasRings", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    @scala.inline
    def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
  }
}
