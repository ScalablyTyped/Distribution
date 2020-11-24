package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AngleAndHeight extends js.Object {
  
  var angleAndHeight: EndPosition = js.native
  
  var distance: EndPosition = js.native
}
object AngleAndHeight {
  
  @scala.inline
  def apply(angleAndHeight: EndPosition, distance: EndPosition): AngleAndHeight = {
    val __obj = js.Dynamic.literal(angleAndHeight = angleAndHeight.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AngleAndHeight]
  }
  
  @scala.inline
  implicit class AngleAndHeightOps[Self <: AngleAndHeight] (val x: Self) extends AnyVal {
    
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
    def setAngleAndHeight(value: EndPosition): Self = this.set("angleAndHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistance(value: EndPosition): Self = this.set("distance", value.asInstanceOf[js.Any])
  }
}
