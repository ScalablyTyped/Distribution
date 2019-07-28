package typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod

import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var element: HTMLElement
  var fitInViewport: js.UndefOr[Boolean] = js.undefined
  var limiter: js.UndefOr[
    HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
  ] = js.undefined
  var positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]]
  var target: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
}

object Options {
  @scala.inline
  def apply(
    element: HTMLElement,
    positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]],
    target: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect]),
    fitInViewport: js.UndefOr[Boolean] = js.undefined,
    limiter: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect]) = null
  ): Options = {
    val __obj = js.Dynamic.literal(element = element, positions = positions, target = target.asInstanceOf[js.Any])
    if (!js.isUndefined(fitInViewport)) __obj.updateDynamic("fitInViewport")(fitInViewport)
    if (limiter != null) __obj.updateDynamic("limiter")(limiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

