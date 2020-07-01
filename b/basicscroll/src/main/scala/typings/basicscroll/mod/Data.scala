package typings.basicscroll.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * Direct mode.
    * @default false
    */
  var direct: js.UndefOr[Boolean | Element] = js.undefined
  /**
    * DOM element/node.
    * @default null
    */
  var elem: js.UndefOr[Element | Null] = js.undefined
  /**
    * Start position.
    * @default null
    */
  var from: AnimatedType
  /**
    * Executes when the user scrolls and the viewport is within the given start and stop position
    */
  var inside: js.UndefOr[CallbackFunction] = js.undefined
  /**
    * Executes when the user scrolls and the viewport is outside the given start and stop position
    */
  var outside: js.UndefOr[CallbackFunction] = js.undefined
  var props: js.UndefOr[Props] = js.undefined
  /**
    * Stop position.
    * @default null
    */
  var to: AnimatedType
  /**
    * Track window size changes.
    * @default true
    */
  var track: js.UndefOr[Boolean] = js.undefined
}

object Data {
  @scala.inline
  def apply(
    direct: Boolean | Element = null,
    elem: js.UndefOr[Null | Element] = js.undefined,
    from: AnimatedType = null,
    inside: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Unit = null,
    outside: (/* instance */ BasicScroll, /* percentage */ Double, /* props */ Props) => Unit = null,
    props: Props = null,
    to: AnimatedType = null,
    track: js.UndefOr[Boolean] = js.undefined
  ): Data = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (direct != null) __obj.updateDynamic("direct")(direct.asInstanceOf[js.Any])
    if (!js.isUndefined(elem)) __obj.updateDynamic("elem")(elem.asInstanceOf[js.Any])
    if (inside != null) __obj.updateDynamic("inside")(js.Any.fromFunction3(inside))
    if (outside != null) __obj.updateDynamic("outside")(js.Any.fromFunction3(outside))
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (!js.isUndefined(track)) __obj.updateDynamic("track")(track.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
}

