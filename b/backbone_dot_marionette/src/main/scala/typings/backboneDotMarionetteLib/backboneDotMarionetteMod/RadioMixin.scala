package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioMixin extends js.Object {
  var bindEvents: js.Any
  var bindRequests: js.Any
  var getChannel: js.Any
  var unbindEvents: js.Any
  var unbindRequests: js.Any
}

object RadioMixin {
  @scala.inline
  def apply(
    bindEvents: js.Any,
    bindRequests: js.Any,
    getChannel: js.Any,
    unbindEvents: js.Any,
    unbindRequests: js.Any
  ): RadioMixin = {
    val __obj = js.Dynamic.literal(bindEvents = bindEvents, bindRequests = bindRequests, getChannel = getChannel, unbindEvents = unbindEvents, unbindRequests = unbindRequests)
  
    __obj.asInstanceOf[RadioMixin]
  }
}

