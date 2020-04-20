package typings.backboneMarionette.mod

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
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], getOption = getOption.asInstanceOf[js.Any], mergeOptions = mergeOptions.asInstanceOf[js.Any], normalizeMethods = normalizeMethods.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonMixin]
  }
}

