package typings
package atBlueprintjsCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_END extends js.Object {
  var END: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.end
  var START: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.start
}

object Anon_END {
  @scala.inline
  def apply(
    END: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.end,
    START: atBlueprintjsCoreLib.atBlueprintjsCoreLibStrings.start
  ): Anon_END = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("END")(END)
    __obj.updateDynamic("START")(START)
    __obj.asInstanceOf[Anon_END]
  }
}

