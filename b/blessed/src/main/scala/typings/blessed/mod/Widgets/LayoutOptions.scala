package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.`inline-block`
import typings.blessed.blessedStrings.`inline`
import typings.blessed.blessedStrings.grid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutOptions extends ElementOptions {
  /**
    * Using the default renderer, it provides two layouts: inline, and grid. inline is the default and will render
    * akin to inline-block. grid will create an automatic grid based on element dimensions. The grid cells'
    * width and height are always determined by the largest children in the layout.
    */
  var layout: `inline` | `inline-block` | grid = js.native
  /**
    * A callback which is called right before the children are iterated over to be rendered. Should return an
    * iterator callback which is called on each child element: iterator(el, i).
    */
  var renderer: js.UndefOr[js.Function0[Unit]] = js.native
}

object LayoutOptions {
  @scala.inline
  def apply(layout: `inline` | `inline-block` | grid): LayoutOptions = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutOptions]
  }
  @scala.inline
  implicit class LayoutOptionsOps[Self <: LayoutOptions] (val x: Self) extends AnyVal {
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
    def setLayout(value: `inline` | `inline-block` | grid): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setRenderer(value: () => Unit): Self = this.set("renderer", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
  }
  
}

