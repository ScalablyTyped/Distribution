package typings.baseui.timezonepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timezone extends js.Object {
  var id: String
  var label: String
  var offset: Double
}

object Timezone {
  @scala.inline
  def apply(id: String, label: String, offset: Double): Timezone = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Timezone]
  }
}

