package typings
package contextjsLib.contextjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuObject extends js.Object {
  var action: js.UndefOr[js.Function1[/* e */ stdLib.Event, scala.Unit]] = js.undefined
  var divider: js.UndefOr[scala.Boolean] = js.undefined
  var header: js.UndefOr[java.lang.String] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var subMenu: js.UndefOr[js.Array[MenuObject]] = js.undefined
  var target: js.UndefOr[java.lang.String] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object MenuObject {
  @scala.inline
  def apply(
    action: js.Function1[/* e */ stdLib.Event, scala.Unit] = null,
    divider: js.UndefOr[scala.Boolean] = js.undefined,
    header: java.lang.String = null,
    href: java.lang.String = null,
    subMenu: js.Array[MenuObject] = null,
    target: java.lang.String = null,
    text: java.lang.String = null
  ): MenuObject = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action)
    if (!js.isUndefined(divider)) __obj.updateDynamic("divider")(divider)
    if (header != null) __obj.updateDynamic("header")(header)
    if (href != null) __obj.updateDynamic("href")(href)
    if (subMenu != null) __obj.updateDynamic("subMenu")(subMenu)
    if (target != null) __obj.updateDynamic("target")(target)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[MenuObject]
  }
}

