package typings.axeDashCore.axeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunOnly extends js.Object {
  var `type`: RunOnlyType
  var values: js.Array[String | TagValue]
}

object RunOnly {
  @scala.inline
  def apply(`type`: RunOnlyType, values: js.Array[String | TagValue]): RunOnly = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOnly]
  }
}

