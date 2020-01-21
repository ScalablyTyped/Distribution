package typings.contextjs.mod

import typings.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuObject extends js.Object {
  var action: js.UndefOr[js.Function1[/* e */ Event_, Unit]] = js.undefined
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
    action: /* e */ Event_ => Unit = null,
    divider: js.UndefOr[Boolean] = js.undefined,
    header: String = null,
    href: String = null,
    subMenu: js.Array[MenuObject] = null,
    target: String = null,
    text: String = null
  ): MenuObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(js.Any.fromFunction1(action))
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (href != null) __obj.updateDynamic("href")(href.asInstanceOf[js.Any])
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuObject]
  }
}

