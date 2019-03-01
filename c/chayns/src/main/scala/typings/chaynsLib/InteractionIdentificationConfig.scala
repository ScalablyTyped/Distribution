package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.startInteractionIdentification()
trait InteractionIdentificationConfig extends js.Object {
  var backgroundColor: js.UndefOr[java.lang.String] = js.undefined
  var callback: js.Any
  var delay: js.UndefOr[scala.Double] = js.undefined
  var duration: scala.Double
  var foregroundColor: java.lang.String
  var resetOnInteraction: js.UndefOr[scala.Boolean] = js.undefined
}

object InteractionIdentificationConfig {
  @scala.inline
  def apply(
    callback: js.Any,
    duration: scala.Double,
    foregroundColor: java.lang.String,
    backgroundColor: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    resetOnInteraction: js.UndefOr[scala.Boolean] = js.undefined
  ): InteractionIdentificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("foregroundColor")(foregroundColor)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(resetOnInteraction)) __obj.updateDynamic("resetOnInteraction")(resetOnInteraction)
    __obj.asInstanceOf[InteractionIdentificationConfig]
  }
}

