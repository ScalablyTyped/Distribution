package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceUV extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var custom: js.UndefOr[js.Any] = js.native
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  
  var flat: js.UndefOr[Boolean] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var sizeX: js.UndefOr[Double] = js.native
  
  var sizeY: js.UndefOr[Double] = js.native
  
  var sizeZ: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object FaceUV {
  
  @scala.inline
  def apply(): FaceUV = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FaceUV]
  }
  
  @scala.inline
  implicit class FaceUVMutableBuilder[Self <: FaceUV] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setCustom(value: js.Any): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
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
    def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeXUndefined: Self = StObject.set(x, "sizeX", js.undefined)
    
    @scala.inline
    def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeYUndefined: Self = StObject.set(x, "sizeY", js.undefined)
    
    @scala.inline
    def setSizeZ(value: Double): Self = StObject.set(x, "sizeZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeZUndefined: Self = StObject.set(x, "sizeZ", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
