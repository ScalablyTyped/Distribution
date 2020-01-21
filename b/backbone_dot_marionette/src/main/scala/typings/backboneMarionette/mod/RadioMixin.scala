package typings.backboneMarionette.mod

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
    val __obj = js.Dynamic.literal(bindEvents = bindEvents.asInstanceOf[js.Any], bindRequests = bindRequests.asInstanceOf[js.Any], getChannel = getChannel.asInstanceOf[js.Any], unbindEvents = unbindEvents.asInstanceOf[js.Any], unbindRequests = unbindRequests.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RadioMixin]
  }
}

