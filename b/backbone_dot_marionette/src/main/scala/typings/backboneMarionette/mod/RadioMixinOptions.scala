package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioMixinOptions extends js.Object {
  /**
    * Defines the Radio channel that will be used for the requests and/or
    * events.
    */
  var channelName: js.UndefOr[String] = js.undefined
  /**
    * Defines an events hash with the events to be listened and its respective
    * handlers.
    */
  var radioEvents: js.UndefOr[js.Any] = js.undefined
  /**
    * Defines an events hash with the requests to be replied and its respective
    * handlers
    */
  var radioRequests: js.UndefOr[js.Any] = js.undefined
}

object RadioMixinOptions {
  @scala.inline
  def apply(channelName: String = null, radioEvents: js.Any = null, radioRequests: js.Any = null): RadioMixinOptions = {
    val __obj = js.Dynamic.literal()
    if (channelName != null) __obj.updateDynamic("channelName")(channelName.asInstanceOf[js.Any])
    if (radioEvents != null) __obj.updateDynamic("radioEvents")(radioEvents.asInstanceOf[js.Any])
    if (radioRequests != null) __obj.updateDynamic("radioRequests")(radioRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadioMixinOptions]
  }
}

