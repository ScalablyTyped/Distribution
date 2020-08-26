package typings.c3.anon

import typings.c3.mod.ChartInternal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Onclick extends js.Object {
  /**
    * Set click event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onclick: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  /**
    * Set mouseout event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onmouseout: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  /**
    * Set mouseover event handler to the legend item.
    * @param id The ID of the legend item.
    */
  var onmouseover: js.UndefOr[js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]] = js.native
  /**
    * Tile settings for legend color display.
    */
  var tile: js.UndefOr[Height] = js.native
}

object Onclick {
  @scala.inline
  def apply(): Onclick = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Onclick]
  }
  @scala.inline
  implicit class OnclickOps[Self <: Onclick] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnclick(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = this.set("onclick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnclick: Self = this.set("onclick", js.undefined)
    @scala.inline
    def setOnmouseout(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = this.set("onmouseout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseout: Self = this.set("onmouseout", js.undefined)
    @scala.inline
    def setOnmouseover(value: js.ThisFunction1[/* this */ ChartInternal, /* id */ String, Unit]): Self = this.set("onmouseover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnmouseover: Self = this.set("onmouseover", js.undefined)
    @scala.inline
    def setTile(value: Height): Self = this.set("tile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTile: Self = this.set("tile", js.undefined)
  }
  
}

