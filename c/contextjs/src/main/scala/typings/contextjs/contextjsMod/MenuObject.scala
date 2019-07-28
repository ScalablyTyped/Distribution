package typings.contextjs.contextjsMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuObject extends js.Object {
  var action: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
  var divider: js.UndefOr[Boolean] = js.undefined
  var header: js.UndefOr[String] = js.undefined
  var href: js.UndefOr[String] = js.undefined
  var subMenu: js.UndefOr[js.Array[MenuObject]] = js.undefined
  var target: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object MenuObject {
  @scala.inline
  def apply(
    action: /* e */ Event => Unit = null,
    divider: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    href: String = null,
    subMenu: js.Array[MenuObject] = null,
    target: String = null,
    text: String = null
  ): MenuObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (header != null) __obj.updateDynamic("header")(header)
    if (href != null) __obj.updateDynamic("href")(href)
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MenuObject]
  }
}

