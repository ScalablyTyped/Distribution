package typings.babylonjs

import typings.babylonjs.babylonjsStrings.Horizontal
import typings.babylonjs.babylonjsStrings.Vertical
import typings.std.DOMPointReadOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRPlane extends js.Object {
  
  var lastChangedTime: Double = js.native
  
  var orientation: Horizontal | Vertical = js.native
  
  var planeSpace: XRSpace = js.native
  
  var polygon: js.Array[DOMPointReadOnly] = js.native
}
object XRPlane {
  
  @scala.inline
  def apply(
    lastChangedTime: Double,
    orientation: Horizontal | Vertical,
    planeSpace: XRSpace,
    polygon: js.Array[DOMPointReadOnly]
  ): XRPlane = {
    val __obj = js.Dynamic.literal(lastChangedTime = lastChangedTime.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], planeSpace = planeSpace.asInstanceOf[js.Any], polygon = polygon.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRPlane]
  }
  
  @scala.inline
  implicit class XRPlaneOps[Self <: XRPlane] (val x: Self) extends AnyVal {
    
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
    def setLastChangedTime(value: Double): Self = this.set("lastChangedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientation(value: Horizontal | Vertical): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaneSpace(value: XRSpace): Self = this.set("planeSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonVarargs(value: DOMPointReadOnly*): Self = this.set("polygon", js.Array(value :_*))
    
    @scala.inline
    def setPolygon(value: js.Array[DOMPointReadOnly]): Self = this.set("polygon", value.asInstanceOf[js.Any])
  }
}
