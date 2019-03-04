package typings
package atCkeditorCkeditor5DashUtilsLib.atCkeditorCkeditor5DashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var element: stdLib.HTMLElement
  var fitInViewport: js.UndefOr[scala.Boolean] = js.undefined
  var limiter: js.UndefOr[
    stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect | (js.Function0[stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect])
  ] = js.undefined
  var positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]]
  var target: stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect | (js.Function0[stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect])
}

object Options {
  @scala.inline
  def apply(
    element: stdLib.HTMLElement,
    positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]],
    target: stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect | (js.Function0[stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect]),
    fitInViewport: js.UndefOr[scala.Boolean] = js.undefined,
    limiter: stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect | (js.Function0[stdLib.HTMLElement | stdLib.Range | stdLib.ClientRect | Rect]) = null
  ): Options = {
    val __obj = js.Dynamic.literal(element = element, positions = positions, target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(fitInViewport)) __obj.updateDynamic("fitInViewport")(fitInViewport)
    if (limiter != null) __obj.updateDynamic("limiter")(limiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

