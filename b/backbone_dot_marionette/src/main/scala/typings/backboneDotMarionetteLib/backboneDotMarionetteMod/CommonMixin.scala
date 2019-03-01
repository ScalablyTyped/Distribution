package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonMixin extends js.Object {
  var bindEvents: js.Any
  var getOption: js.Any
  var mergeOptions: js.Any
  var normalizeMethods: js.Any
  var unbindEvents: js.Any
}

object CommonMixin {
  @scala.inline
  def apply(
    bindEvents: js.Any,
    getOption: js.Any,
    mergeOptions: js.Any,
    normalizeMethods: js.Any,
    unbindEvents: js.Any
  ): CommonMixin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bindEvents")(bindEvents)
    __obj.updateDynamic("getOption")(getOption)
    __obj.updateDynamic("mergeOptions")(mergeOptions)
    __obj.updateDynamic("normalizeMethods")(normalizeMethods)
    __obj.updateDynamic("unbindEvents")(unbindEvents)
    __obj.asInstanceOf[CommonMixin]
  }
}

