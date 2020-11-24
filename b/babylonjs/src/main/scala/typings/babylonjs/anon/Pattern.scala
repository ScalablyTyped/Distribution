package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pattern extends js.Object {
  
  var alignHorizontal: js.UndefOr[Double] = js.native
  
  var alignVertical: js.UndefOr[Double] = js.native
  
  var depth: js.UndefOr[Double] = js.native
  
  var faceColors: js.UndefOr[js.Array[Color4]] = js.native
  
  var faceUV: js.UndefOr[js.Array[Vector4]] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var pattern: js.UndefOr[Double] = js.native
  
  var sideOrientation: js.UndefOr[Double] = js.native
  
  var tileHeight: js.UndefOr[Double] = js.native
  
  var tileSize: js.UndefOr[Double] = js.native
  
  var tileWidth: js.UndefOr[Double] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Pattern {
  
  @scala.inline
  def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  @scala.inline
  implicit class PatternOps[Self <: Pattern] (val x: Self) extends AnyVal {
    
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
    def setAlignHorizontal(value: Double): Self = this.set("alignHorizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignHorizontal: Self = this.set("alignHorizontal", js.undefined)
    
    @scala.inline
    def setAlignVertical(value: Double): Self = this.set("alignVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignVertical: Self = this.set("alignVertical", js.undefined)
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setPattern(value: Double): Self = this.set("pattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    
    @scala.inline
    def setSideOrientation(value: Double): Self = this.set("sideOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideOrientation: Self = this.set("sideOrientation", js.undefined)
    
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileHeight: Self = this.set("tileHeight", js.undefined)
    
    @scala.inline
    def setTileSize(value: Double): Self = this.set("tileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileSize: Self = this.set("tileSize", js.undefined)
    
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTileWidth: Self = this.set("tileWidth", js.undefined)
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = this.set("updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdatable: Self = this.set("updatable", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
