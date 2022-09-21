package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enclose extends StObject {
  
  var arc: js.UndefOr[Double] = js.undefined
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var cap: js.UndefOr[Double] = js.undefined
  
  var diameter: js.UndefOr[Double] = js.undefined
  
  var diameterBottom: js.UndefOr[Double] = js.undefined
  
  var diameterTop: js.UndefOr[Double] = js.undefined
  
  var enclose: js.UndefOr[Boolean] = js.undefined
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var hasRings: js.UndefOr[Boolean] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var subdivisions: js.UndefOr[Double] = js.undefined
  
  var tessellation: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object Enclose {
  
  inline def apply(): Enclose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enclose]
  }
  
  extension [Self <: Enclose](x: Self) {
    
    inline def setArc(value: Double): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    inline def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setCap(value: Double): Self = StObject.set(x, "cap", value.asInstanceOf[js.Any])
    
    inline def setCapUndefined: Self = StObject.set(x, "cap", js.undefined)
    
    inline def setDiameter(value: Double): Self = StObject.set(x, "diameter", value.asInstanceOf[js.Any])
    
    inline def setDiameterBottom(value: Double): Self = StObject.set(x, "diameterBottom", value.asInstanceOf[js.Any])
    
    inline def setDiameterBottomUndefined: Self = StObject.set(x, "diameterBottom", js.undefined)
    
    inline def setDiameterTop(value: Double): Self = StObject.set(x, "diameterTop", value.asInstanceOf[js.Any])
    
    inline def setDiameterTopUndefined: Self = StObject.set(x, "diameterTop", js.undefined)
    
    inline def setDiameterUndefined: Self = StObject.set(x, "diameter", js.undefined)
    
    inline def setEnclose(value: Boolean): Self = StObject.set(x, "enclose", value.asInstanceOf[js.Any])
    
    inline def setEncloseUndefined: Self = StObject.set(x, "enclose", js.undefined)
    
    inline def setFaceColors(value: js.Array[Color4]): Self = StObject.set(x, "faceColors", value.asInstanceOf[js.Any])
    
    inline def setFaceColorsUndefined: Self = StObject.set(x, "faceColors", js.undefined)
    
    inline def setFaceColorsVarargs(value: Color4*): Self = StObject.set(x, "faceColors", js.Array(value*))
    
    inline def setFaceUV(value: js.Array[Vector4]): Self = StObject.set(x, "faceUV", value.asInstanceOf[js.Any])
    
    inline def setFaceUVUndefined: Self = StObject.set(x, "faceUV", js.undefined)
    
    inline def setFaceUVVarargs(value: Vector4*): Self = StObject.set(x, "faceUV", js.Array(value*))
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setHasRings(value: Boolean): Self = StObject.set(x, "hasRings", value.asInstanceOf[js.Any])
    
    inline def setHasRingsUndefined: Self = StObject.set(x, "hasRings", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    inline def setTessellation(value: Double): Self = StObject.set(x, "tessellation", value.asInstanceOf[js.Any])
    
    inline def setTessellationUndefined: Self = StObject.set(x, "tessellation", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
