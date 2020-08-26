package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndPosition extends js.Object {
  var endPosition: Cartesian2 = js.native
  var startPosition: Cartesian2 = js.native
}

object EndPosition {
  @scala.inline
  def apply(endPosition: Cartesian2, startPosition: Cartesian2): EndPosition = {
    val __obj = js.Dynamic.literal(endPosition = endPosition.asInstanceOf[js.Any], startPosition = startPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPosition]
  }
  @scala.inline
  implicit class EndPositionOps[Self <: EndPosition] (val x: Self) extends AnyVal {
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
    def setEndPosition(value: Cartesian2): Self = this.set("endPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartPosition(value: Cartesian2): Self = this.set("startPosition", value.asInstanceOf[js.Any])
  }
  
}

