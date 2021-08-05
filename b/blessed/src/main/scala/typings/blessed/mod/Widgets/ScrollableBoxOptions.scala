package typings.blessed.mod.Widgets

import typings.blessed.anon.Ch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollableBoxOptions
  extends StObject
     with ElementOptions {
  
  /**
    * A option which causes the ignoring of childOffset. This in turn causes the
    * childBase to change every time the element is scrolled.
    */
  var alwaysScroll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A limit to the childBase. Default is Infinity.
    */
  var baseLimit: js.UndefOr[Double] = js.undefined
  
  /**
    * Object enabling a scrollbar.
    * Style of the scrollbar track if present (takes regular style options).
    */
  var scrollbar: js.UndefOr[Ch] = js.undefined
}
object ScrollableBoxOptions {
  
  inline def apply(): ScrollableBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScrollableBoxOptions]
  }
  
  extension [Self <: ScrollableBoxOptions](x: Self) {
    
    inline def setAlwaysScroll(value: Boolean): Self = StObject.set(x, "alwaysScroll", value.asInstanceOf[js.Any])
    
    inline def setAlwaysScrollUndefined: Self = StObject.set(x, "alwaysScroll", js.undefined)
    
    inline def setBaseLimit(value: Double): Self = StObject.set(x, "baseLimit", value.asInstanceOf[js.Any])
    
    inline def setBaseLimitUndefined: Self = StObject.set(x, "baseLimit", js.undefined)
    
    inline def setScrollbar(value: Ch): Self = StObject.set(x, "scrollbar", value.asInstanceOf[js.Any])
    
    inline def setScrollbarUndefined: Self = StObject.set(x, "scrollbar", js.undefined)
  }
}
