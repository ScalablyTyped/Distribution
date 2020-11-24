package typings.babylonjs.ispritesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISpriteJSONSpriteFrameData extends js.Object {
  
  /**
    * number of the height of the Frame
    */
  var h: Double = js.native
  
  /**
    * number of the width of the Frame
    */
  var w: Double = js.native
  
  /**
    * number of the x offset of the Frame
    */
  var x: Double = js.native
  
  /**
    * number of the y offset of the Frame
    */
  var y: Double = js.native
}
object ISpriteJSONSpriteFrameData {
  
  @scala.inline
  def apply(h: Double, w: Double, x: Double, y: Double): ISpriteJSONSpriteFrameData = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpriteJSONSpriteFrameData]
  }
  
  @scala.inline
  implicit class ISpriteJSONSpriteFrameDataOps[Self <: ISpriteJSONSpriteFrameData] (val x: Self) extends AnyVal {
    
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
    def setH(value: Double): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
