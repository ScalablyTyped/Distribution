package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LOCK extends js.Object {
  var LOCK: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.lock
  var NONE: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.none
  var PUSH: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.push
}

object Anon_LOCK {
  @scala.inline
  def apply(
    LOCK: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.lock,
    NONE: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.none,
    PUSH: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.push
  ): Anon_LOCK = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LOCK")(LOCK)
    __obj.updateDynamic("NONE")(NONE)
    __obj.updateDynamic("PUSH")(PUSH)
    __obj.asInstanceOf[Anon_LOCK]
  }
}

