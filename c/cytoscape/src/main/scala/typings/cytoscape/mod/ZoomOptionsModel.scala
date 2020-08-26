package typings.cytoscape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoomOptionsModel extends js.Object {
  /** The position about which to zoom. */
  var position: Position = js.native
}

object ZoomOptionsModel {
  @scala.inline
  def apply(position: Position): ZoomOptionsModel = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomOptionsModel]
  }
  @scala.inline
  implicit class ZoomOptionsModelOps[Self <: ZoomOptionsModel] (val x: Self) extends AnyVal {
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
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

