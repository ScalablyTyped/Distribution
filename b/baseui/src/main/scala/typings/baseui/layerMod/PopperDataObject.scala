package typings.baseui.layerMod

import typings.baseui.Anon_Arrow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopperDataObject extends js.Object {
  var offsets: Anon_Arrow
  var placement: String
}

object PopperDataObject {
  @scala.inline
  def apply(offsets: Anon_Arrow, placement: String): PopperDataObject = {
    val __obj = js.Dynamic.literal(offsets = offsets.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopperDataObject]
  }
}

