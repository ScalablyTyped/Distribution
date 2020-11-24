package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FaceUV extends js.Object {
  
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
  implicit class FaceUVOps[Self <: FaceUV] (val x: Self) extends AnyVal {
    
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
    def setCustom(value: js.Any): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
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
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    
    @scala.inline
    def setFrontUVs(value: Vector4): Self = this.set("frontUVs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrontUVs: Self = this.set("frontUVs", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSizeX(value: Double): Self = this.set("sizeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeX: Self = this.set("sizeX", js.undefined)
    
    @scala.inline
    def setSizeY(value: Double): Self = this.set("sizeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeY: Self = this.set("sizeY", js.undefined)
    
    @scala.inline
    def setSizeZ(value: Double): Self = this.set("sizeZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeZ: Self = this.set("sizeZ", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
  }
}
