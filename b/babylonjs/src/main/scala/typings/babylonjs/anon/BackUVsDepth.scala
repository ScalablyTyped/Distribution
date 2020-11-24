package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Color4
import typings.babylonjs.BABYLON.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackUVsDepth extends js.Object {
  
  var backUVs: js.UndefOr[Vector4] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  
  var frontUVs: js.UndefOr[Vector4] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object BackUVsDepth {
  
  @scala.inline
  def apply(): BackUVsDepth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BackUVsDepth]
  }
  
  @scala.inline
  implicit class BackUVsDepthOps[Self <: BackUVsDepth] (val x: Self) extends AnyVal {
    
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
    def setBackUVs(value: Vector4): Self = this.set("backUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackUVs: Self = this.set("backUVs", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setFaceColorsVarargs(value: Color4*): Self = this.set("faceColors", js.Array(value :_*))
    
    @scala.inline
    def setFaceColors(value: js.Array[Color4]): Self = this.set("faceColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceColors: Self = this.set("faceColors", js.undefined)
    
    @scala.inline
    def setFaceUVVarargs(value: Vector4*): Self = this.set("faceUV", js.Array(value :_*))
    
    @scala.inline
    def setFaceUV(value: js.Array[Vector4]): Self = this.set("faceUV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceUV: Self = this.set("faceUV", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = this.set("frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontUVs: Self = this.set("frontUVs", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
