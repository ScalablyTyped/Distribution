package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialTab extends js.Object {
  var initialTab: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var newColors: js.UndefOr[Anon_BackgroundColor] = js.undefined
  var parentElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var popup: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_InitialTab {
  @scala.inline
  def apply(
    initialTab: scala.Double | java.lang.String = null,
    newColors: Anon_BackgroundColor = null,
    parentElement: stdLib.HTMLElement = null,
    popup: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_InitialTab = {
    val __obj = js.Dynamic.literal()
    if (initialTab != null) __obj.updateDynamic("initialTab")(initialTab.asInstanceOf[js.Any])
    if (newColors != null) __obj.updateDynamic("newColors")(newColors)
    if (parentElement != null) __obj.updateDynamic("parentElement")(parentElement)
    if (!js.isUndefined(popup)) __obj.updateDynamic("popup")(popup)
    __obj.asInstanceOf[Anon_InitialTab]
  }
}

