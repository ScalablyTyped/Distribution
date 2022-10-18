package typings.babylonjs.anon

import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FaceColors extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.undefined
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.undefined
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.undefined
  
  var flat: js.UndefOr[Boolean] = js.undefined
  
  var frontUVs: js.UndefOr[Vector4] = js.undefined
  
  var m: js.UndefOr[Double] = js.undefined
  
  var n: js.UndefOr[Double] = js.undefined
  
  var sideOrientation: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var sizeX: js.UndefOr[Double] = js.undefined
  
  var sizeY: js.UndefOr[Double] = js.undefined
  
  var sizeZ: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object FaceColors {
  
  inline def apply(): FaceColors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceColors]
  }
  
  extension [Self <: FaceColors](x: Self) {
    
    inline def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    inline def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    inline def setFaceColors(value: js.Array[Color4]): Self = StObject.set(x, "faceColors", value.asInstanceOf[js.Any])
    
    inline def setFaceColorsUndefined: Self = StObject.set(x, "faceColors", js.undefined)
    
    inline def setFaceColorsVarargs(value: Color4*): Self = StObject.set(x, "faceColors", js.Array(value*))
    
    inline def setFaceUV(value: js.Array[Vector4]): Self = StObject.set(x, "faceUV", value.asInstanceOf[js.Any])
    
    inline def setFaceUVUndefined: Self = StObject.set(x, "faceUV", js.undefined)
    
    inline def setFaceUVVarargs(value: Vector4*): Self = StObject.set(x, "faceUV", js.Array(value*))
    
    inline def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    inline def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    inline def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    inline def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    inline def setM(value: Double): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
    
    inline def setN(value: Double): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setNUndefined: Self = StObject.set(x, "n", js.undefined)
    
    inline def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    inline def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
    
    inline def setSizeXUndefined: Self = StObject.set(x, "sizeX", js.undefined)
    
    inline def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
    
    inline def setSizeYUndefined: Self = StObject.set(x, "sizeY", js.undefined)
    
    inline def setSizeZ(value: Double): Self = StObject.set(x, "sizeZ", value.asInstanceOf[js.Any])
    
    inline def setSizeZUndefined: Self = StObject.set(x, "sizeZ", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
