package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationOptions extends ObjectOptions {
  /**
    * Root entry point for the View tree of your Application.
    */
  var region: java.lang.String
}

object ApplicationOptions {
  @scala.inline
  def apply(
    region: java.lang.String,
    channelName: java.lang.String = null,
    initialize: /* options */ js.UndefOr[ApplicationOptions] => scala.Unit = null,
    radioEvents: js.Any = null,
    radioRequests: js.Any = null
  ): ApplicationOptions = {
    val __obj = js.Dynamic.literal(region = region)
    if (channelName != null) __obj.updateDynamic("channelName")(channelName)
    if (initialize != null) __obj.updateDynamic("initialize")(js.Any.fromFunction1(initialize))
    if (radioEvents != null) __obj.updateDynamic("radioEvents")(radioEvents)
    if (radioRequests != null) __obj.updateDynamic("radioRequests")(radioRequests)
    __obj.asInstanceOf[ApplicationOptions]
  }
}

