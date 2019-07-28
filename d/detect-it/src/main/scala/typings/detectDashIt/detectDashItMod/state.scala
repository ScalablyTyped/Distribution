package typings.detectDashIt.detectDashItMod

import typings.detectDashHover.detectDashHoverMod.detectHover
import typings.detectDashPassiveDashEvents.detectDashPassiveDashEventsMod.detectPassiveEvents
import typings.detectDashPointer.detectDashPointerMod.detectPointer
import typings.detectDashTouchDashEvents.detectDashTouchDashEventsMod.detectTouchEvents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait state extends js.Object {
  var detectHover: typings.detectDashHover.detectDashHoverMod.detectHover
  var detectPassiveEvents: typings.detectDashPassiveDashEvents.detectDashPassiveDashEventsMod.detectPassiveEvents
  var detectPointer: typings.detectDashPointer.detectDashPointerMod.detectPointer
  var detectTouchEvents: typings.detectDashTouchDashEvents.detectDashTouchDashEventsMod.detectTouchEvents
}

object state {
  @scala.inline
  def apply(
    detectHover: detectHover,
    detectPassiveEvents: detectPassiveEvents,
    detectPointer: detectPointer,
    detectTouchEvents: detectTouchEvents
  ): state = {
    val __obj = js.Dynamic.literal(detectHover = detectHover, detectPassiveEvents = detectPassiveEvents, detectPointer = detectPointer, detectTouchEvents = detectTouchEvents)
  
    __obj.asInstanceOf[state]
  }
}

