package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /**
    * Set click event handler to the legend item.
    */
  var onclick: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.undefined
  /**
    * Set mouseout event handler to the legend item.
    */
  var onmouseout: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.undefined
  /**
    * Set mouseover event handler to the legend item.
    */
  var onmouseover: js.UndefOr[js.Function1[/* id */ js.Any, Unit]] = js.undefined
  /**
    * Tile settings for legend color display.
    */
  var tile: js.UndefOr[Anon_Height] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    onclick: /* id */ js.Any => Unit = null,
    onmouseout: /* id */ js.Any => Unit = null,
    onmouseover: /* id */ js.Any => Unit = null,
    tile: Anon_Height = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (onclick != null) __obj.updateDynamic("onclick")(js.Any.fromFunction1(onclick))
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(js.Any.fromFunction1(onmouseout))
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(js.Any.fromFunction1(onmouseover))
    if (tile != null) __obj.updateDynamic("tile")(tile)
    __obj.asInstanceOf[Anon_Id]
  }
}

