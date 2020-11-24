package typings.blessed.mod.Widgets

import typings.blessed.anon.Ch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollableBoxOptions extends ElementOptions {
  
  /**
    * A option which causes the ignoring of childOffset. This in turn causes the
    * childBase to change every time the element is scrolled.
    */
  var alwaysScroll: js.UndefOr[Boolean] = js.native
  
  /**
    * A limit to the childBase. Default is Infinity.
    */
  var baseLimit: js.UndefOr[Double] = js.native
  
  /**
    * Object enabling a scrollbar.
    * Style of the scrollbar track if present (takes regular style options).
    */
  var scrollbar: js.UndefOr[Ch] = js.native
}
object ScrollableBoxOptions {
  
  @scala.inline
  def apply(): ScrollableBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableBoxOptions]
  }
  
  @scala.inline
  implicit class ScrollableBoxOptionsOps[Self <: ScrollableBoxOptions] (val x: Self) extends AnyVal {
    
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
    def setAlwaysScroll(value: Boolean): Self = this.set("alwaysScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysScroll: Self = this.set("alwaysScroll", js.undefined)
    
    @scala.inline
    def setBaseLimit(value: Double): Self = this.set("baseLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseLimit: Self = this.set("baseLimit", js.undefined)
    
    @scala.inline
    def setScrollbar(value: Ch): Self = this.set("scrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbar: Self = this.set("scrollbar", js.undefined)
  }
}
