package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DANGER extends js.Object {
  var DANGER: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.danger
  var NONE: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.none
  var PRIMARY: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.primary
  var SUCCESS: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.success
  var WARNING: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.warning
}

object Anon_DANGER {
  @scala.inline
  def apply(
    DANGER: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.danger,
    NONE: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.none,
    PRIMARY: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.primary,
    SUCCESS: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.success,
    WARNING: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.warning
  ): Anon_DANGER = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DANGER")(DANGER)
    __obj.updateDynamic("NONE")(NONE)
    __obj.updateDynamic("PRIMARY")(PRIMARY)
    __obj.updateDynamic("SUCCESS")(SUCCESS)
    __obj.updateDynamic("WARNING")(WARNING)
    __obj.asInstanceOf[Anon_DANGER]
  }
}

