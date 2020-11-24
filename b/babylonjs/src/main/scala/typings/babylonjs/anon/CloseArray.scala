package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector2
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloseArray extends js.Object {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var closeArray: js.UndefOr[Boolean] = js.native
  
  var closePath: js.UndefOr[Boolean] = js.native
  
  var colors: js.UndefOr[js.Array[Color4]] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var instance: js.UndefOr[typings.babylonjs.meshMod.Mesh] = js.native
  
  var invertUV: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var uvs: js.UndefOr[js.Array[Vector2]] = js.native
}
object CloseArray {
  
  @scala.inline
  def apply(pathArray: js.Array[js.Array[Vector3]]): CloseArray = {
    val __obj = js.Dynamic.literal(pathArray = pathArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloseArray]
  }
  
  @scala.inline
  implicit class CloseArrayOps[Self <: CloseArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPathArrayVarargs(value: js.Array[Vector3]*): Self = this.set("pathArray", js.Array(value :_*))
    
    @scala.inline
    def setPathArray(value: js.Array[js.Array[Vector3]]): Self = this.set("pathArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackUVs(value: Vector4): Self = this.set("backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackUVs: Self = this.set("backUVs", js.undefined)
    
    @scala.inline
    def setCloseArray(value: Boolean): Self = this.set("closeArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseArray: Self = this.set("closeArray", js.undefined)
    
    @scala.inline
    def setClosePath(value: Boolean): Self = this.set("closePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosePath: Self = this.set("closePath", js.undefined)
    
    @scala.inline
    def setColorsVarargs(value: Color4*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: js.Array[Color4]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = this.set("frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontUVs: Self = this.set("frontUVs", js.undefined)
    
    @scala.inline
    def setInstance(value: typings.babylonjs.meshMod.Mesh): Self = this.set("instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstance: Self = this.set("instance", js.undefined)
    
    @scala.inline
    def setInvertUV(value: Boolean): Self = this.set("invertUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvertUV: Self = this.set("invertUV", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
    
    @scala.inline
    def setUvsVarargs(value: Vector2*): Self = this.set("uvs", js.Array(value :_*))
    
    @scala.inline
    def setUvs(value: js.Array[Vector2]): Self = this.set("uvs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUvs: Self = this.set("uvs", js.undefined)
  }
}
