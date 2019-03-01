package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  /**
    * Set click event handler to the legend item.
    */
  var onclick: js.UndefOr[js.Function1[/* id */ js.Any, scala.Unit]] = js.undefined
  /**
    * Set mouseout event handler to the legend item.
    */
  var onmouseout: js.UndefOr[js.Function1[/* id */ js.Any, scala.Unit]] = js.undefined
  /**
    * Set mouseover event handler to the legend item.
    */
  var onmouseover: js.UndefOr[js.Function1[/* id */ js.Any, scala.Unit]] = js.undefined
  /**
    * Tile settings for legend color display.
    */
  var tile: js.UndefOr[Anon_Height] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    onclick: js.Function1[/* id */ js.Any, scala.Unit] = null,
    onmouseout: js.Function1[/* id */ js.Any, scala.Unit] = null,
    onmouseover: js.Function1[/* id */ js.Any, scala.Unit] = null,
    tile: Anon_Height = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (onclick != null) __obj.updateDynamic("onclick")(onclick)
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout)
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover)
    if (tile != null) __obj.updateDynamic("tile")(tile)
    __obj.asInstanceOf[Anon_Id]
  }
}

