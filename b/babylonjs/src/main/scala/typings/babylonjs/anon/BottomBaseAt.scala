package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BottomBaseAt extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var bottomBaseAt: js.UndefOr[Double] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var topBaseAt: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var wrap: js.UndefOr[Boolean] = js.native
}
object BottomBaseAt {
  
  @scala.inline
  def apply(): BottomBaseAt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BottomBaseAt]
  }
  
  @scala.inline
  implicit class BottomBaseAtMutableBuilder[Self <: BottomBaseAt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setBottomBaseAt(value: Double): Self = StObject.set(x, "bottomBaseAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomBaseAtUndefined: Self = StObject.set(x, "bottomBaseAt", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
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
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTopBaseAt(value: Double): Self = StObject.set(x, "topBaseAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopBaseAtUndefined: Self = StObject.set(x, "topBaseAt", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWrap(value: Boolean): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
  }
}
