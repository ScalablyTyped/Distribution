package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackUVs extends StObject {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var closeArray: js.UndefOr[Boolean] = js.native
  
  var closePath: js.UndefOr[Boolean] = js.native
  
  var colors: js.UndefOr[js.Array[Color4]] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var invertUV: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var uvs: js.UndefOr[js.Array[Vector2]] = js.native
}
object BackUVs {
  
  @scala.inline
  def apply(pathArray: js.Array[js.Array[Vector3]]): BackUVs = {
    val __obj = js.Dynamic.literal(pathArray = pathArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackUVs]
  }
  
  @scala.inline
  implicit class BackUVsMutableBuilder[Self <: BackUVs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = StObject.set(x, "backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVsUndefined: Self = StObject.set(x, "backUVs", js.undefined)
    
    @scala.inline
    def setCloseArray(value: Boolean): Self = StObject.set(x, "closeArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseArrayUndefined: Self = StObject.set(x, "closeArray", js.undefined)
    
    @scala.inline
    def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    @scala.inline
    def setColors(value: js.Array[Color4]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: Color4*): Self = StObject.set(x, "colors", js.Array(value :_*))
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = StObject.set(x, "frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrontUVsUndefined: Self = StObject.set(x, "frontUVs", js.undefined)
    
    @scala.inline
    def setInvertUV(value: Boolean): Self = StObject.set(x, "invertUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertUVUndefined: Self = StObject.set(x, "invertUV", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setPathArray(value: js.Array[js.Array[Vector3]]): Self = StObject.set(x, "pathArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathArrayVarargs(value: js.Array[Vector3]*): Self = StObject.set(x, "pathArray", js.Array(value :_*))
    
    @scala.inline
    def setSideOrientation(value: Double): Self = StObject.set(x, "sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideOrientationUndefined: Self = StObject.set(x, "sideOrientation", js.undefined)
    
    @scala.inline
    def setUvs(value: js.Array[Vector2]): Self = StObject.set(x, "uvs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUvsUndefined: Self = StObject.set(x, "uvs", js.undefined)
    
    @scala.inline
    def setUvsVarargs(value: Vector2*): Self = StObject.set(x, "uvs", js.Array(value :_*))
  }
}
