package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonMixin extends js.Object {
  var bindEvents: js.Any = js.native
  var getOption: js.Any = js.native
  var mergeOptions: js.Any = js.native
  var normalizeMethods: js.Any = js.native
  var unbindEvents: js.Any = js.native
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
  @scala.inline
  implicit class CommonMixinOps[Self <: CommonMixin] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBindEvents(value: js.Any): Self = this.set("bindEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetOption(value: js.Any): Self = this.set("getOption", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeOptions(value: js.Any): Self = this.set("mergeOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNormalizeMethods(value: js.Any): Self = this.set("normalizeMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnbindEvents(value: js.Any): Self = this.set("unbindEvents", value.asInstanceOf[js.Any])
  }
  
}

