package typings
package colorDashStringLib.colorDashStringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorDescriptor extends js.Object {
  var model: colorDashStringLib.colorDashStringLibStrings.rgb | colorDashStringLib.colorDashStringLibStrings.hsl | colorDashStringLib.colorDashStringLibStrings.hwb
  var value: Color
}

object ColorDescriptor {
  @scala.inline
  def apply(
    model: colorDashStringLib.colorDashStringLibStrings.rgb | colorDashStringLib.colorDashStringLibStrings.hsl | colorDashStringLib.colorDashStringLibStrings.hwb,
    value: Color
  ): ColorDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ColorDescriptor]
  }
}

