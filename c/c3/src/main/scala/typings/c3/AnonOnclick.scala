package typings.c3

import typings.c3.mod.ChartInternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnclick extends js.Object {
  /**
    * Set click event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.undefined
  /**
    * Set mouseout event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.undefined
  /**
    * Set mouseover event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.undefined
  /**
    * Tile settings for legend color display.
    */
  var tile: js.UndefOr[AnonHeight] = js.undefined
}

object AnonOnclick {
  @scala.inline
  def apply(
    onclick: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit] = null,
    onmouseout: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit] = null,
    onmouseover: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit] = null,
    tile: AnonHeight = null
  ): AnonOnclick = {
    val __obj = js.Dynamic.literal()
    if (onclick != null) __obj.updateDynamic("onclick")(onclick.asInstanceOf[js.Any])
    if (onmouseout != null) __obj.updateDynamic("onmouseout")(onmouseout.asInstanceOf[js.Any])
    if (onmouseover != null) __obj.updateDynamic("onmouseover")(onmouseover.asInstanceOf[js.Any])
    if (tile != null) __obj.updateDynamic("tile")(tile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnclick]
  }
}

