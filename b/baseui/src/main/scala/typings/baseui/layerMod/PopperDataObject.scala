package typings.baseui.layerMod

import typings.baseui.AnonArrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperDataObject extends js.Object {
  var offsets: AnonArrow
  var placement: String
}

object PopperDataObject {
  @scala.inline
  def apply(offsets: AnonArrow, placement: String): PopperDataObject = {
    val __obj = js.Dynamic.literal(offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopperDataObject]
  }
}

