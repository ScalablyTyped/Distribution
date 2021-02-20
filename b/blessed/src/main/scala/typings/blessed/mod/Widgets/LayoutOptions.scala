package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.`inline-block`
import typings.blessed.blessedStrings.`inline`
import typings.blessed.blessedStrings.grid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class LayoutOptionsMutableBuilder[Self <: LayoutOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayout(value: `inline` | `inline-block` | grid): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderer(value: () => Unit): Self = StObject.set(x, "renderer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
