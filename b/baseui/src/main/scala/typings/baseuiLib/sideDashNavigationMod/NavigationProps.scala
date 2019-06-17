package typings
package baseuiLib.sideDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProps extends js.Object {
  var activeItemId: java.lang.String
  var activePredicate: js.UndefOr[
    js.Function2[/* item */ js.Any, /* activeItemId */ java.lang.String, scala.Boolean]
  ] = js.undefined
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  var mapItem: js.UndefOr[js.Function1[/* item */ Item, Item]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* args */ baseuiLib.Anon_EventItem, _]] = js.undefined
  var overrides: js.UndefOr[NavigationOverrides] = js.undefined
}

object NavigationProps {
  @scala.inline
  def apply(
    activeItemId: java.lang.String,
    activePredicate: (/* item */ js.Any, /* activeItemId */ java.lang.String) => scala.Boolean = null,
    items: js.Array[Item] = null,
    mapItem: /* item */ Item => Item = null,
    onChange: /* args */ baseuiLib.Anon_EventItem => _ = null,
    overrides: NavigationOverrides = null
  ): NavigationProps = {
    val __obj = js.Dynamic.literal(activeItemId = activeItemId)
    if (activePredicate != null) __obj.updateDynamic("activePredicate")(js.Any.fromFunction2(activePredicate))
    if (items != null) __obj.updateDynamic("items")(items)
    if (mapItem != null) __obj.updateDynamic("mapItem")(js.Any.fromFunction1(mapItem))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[NavigationProps]
  }
}

