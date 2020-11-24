package typings.babylonjs.anon

import typings.babylonjs.mathColorMod.Color4
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colors extends js.Object {
  
  var colors: js.UndefOr[Nullable[js.Array[js.Array[Color4]]]] = js.native
  
  var lines: js.Array[js.Array[Vector3]] = js.native
}
object Colors {
  
  @scala.inline
  def apply(lines: js.Array[js.Array[Vector3]]): Colors = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    
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
    def setLinesVarargs(value: js.Array[Vector3]*): Self = this.set("lines", js.Array(value :_*))
    
    @scala.inline
    def setLines(value: js.Array[js.Array[Vector3]]): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsVarargs(value: js.Array[Color4]*): Self = this.set("colors", js.Array(value :_*))
    
    @scala.inline
    def setColors(value: Nullable[js.Array[js.Array[Color4]]]): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setColorsNull: Self = this.set("colors", null)
  }
}
