package typings
package detectDashItLib.detectDashItMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait state extends js.Object {
  var detectHover: detectDashHoverLib.detectDashHoverMod.detectHover
  var detectPassiveEvents: detectDashPassiveDashEventsLib.detectDashPassiveDashEventsMod.detectPassiveEvents
  var detectPointer: detectDashPointerLib.detectDashPointerMod.detectPointer
  var detectTouchEvents: detectDashTouchDashEventsLib.detectDashTouchDashEventsMod.detectTouchEvents
}

object state {
  @scala.inline
  def apply(
    detectHover: detectDashHoverLib.detectDashHoverMod.detectHover,
    detectPassiveEvents: detectDashPassiveDashEventsLib.detectDashPassiveDashEventsMod.detectPassiveEvents,
    detectPointer: detectDashPointerLib.detectDashPointerMod.detectPointer,
    detectTouchEvents: detectDashTouchDashEventsLib.detectDashTouchDashEventsMod.detectTouchEvents
  ): state = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("detectHover")(detectHover)
    __obj.updateDynamic("detectPassiveEvents")(detectPassiveEvents)
    __obj.updateDynamic("detectPointer")(detectPointer)
    __obj.updateDynamic("detectTouchEvents")(detectTouchEvents)
    __obj.asInstanceOf[state]
  }
}

