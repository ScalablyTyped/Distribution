package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CLICK extends js.Object {
  var CLICK: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.click
  var CLICK_TARGET_ONLY: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.`click-target`
  var HOVER: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.hover
  var HOVER_TARGET_ONLY: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.`hover-target`
}

object Anon_CLICK {
  @scala.inline
  def apply(
    CLICK: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.click,
    CLICK_TARGET_ONLY: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.`click-target`,
    HOVER: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.hover,
    HOVER_TARGET_ONLY: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.`hover-target`
  ): Anon_CLICK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CLICK")(CLICK)
    __obj.updateDynamic("CLICK_TARGET_ONLY")(CLICK_TARGET_ONLY)
    __obj.updateDynamic("HOVER")(HOVER)
    __obj.updateDynamic("HOVER_TARGET_ONLY")(HOVER_TARGET_ONLY)
    __obj.asInstanceOf[Anon_CLICK]
  }
}

