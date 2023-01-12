package typings.codemirrorView.anon

import typings.codemirrorState.mod.Transaction
import typings.codemirrorView.codemirrorViewStrings.touch
import typings.codemirrorView.mod.Tooltip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideOn extends StObject {
  
  /**
    Controls whether a transaction hides the tooltip. The default
    is to not hide.
    */
  var hideOn: js.UndefOr[js.Function2[/* tr */ Transaction, /* tooltip */ Tooltip, Boolean]] = js.undefined
  
  /**
    When enabled (this defaults to false), close the tooltip
    whenever the document changes or the selection is set.
    */
  var hideOnChange: js.UndefOr[Boolean | touch] = js.undefined
  
  /**
    Hover time after which the tooltip should appear, in
    milliseconds. Defaults to 300ms.
    */
  var hoverTime: js.UndefOr[Double] = js.undefined
}
object HideOn {
  
  inline def apply(): HideOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HideOn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HideOn] (val x: Self) extends AnyVal {
    
    inline def setHideOn(value: (/* tr */ Transaction, /* tooltip */ Tooltip) => Boolean): Self = StObject.set(x, "hideOn", js.Any.fromFunction2(value))
    
    inline def setHideOnChange(value: Boolean | touch): Self = StObject.set(x, "hideOnChange", value.asInstanceOf[js.Any])
    
    inline def setHideOnChangeUndefined: Self = StObject.set(x, "hideOnChange", js.undefined)
    
    inline def setHideOnUndefined: Self = StObject.set(x, "hideOn", js.undefined)
    
    inline def setHoverTime(value: Double): Self = StObject.set(x, "hoverTime", value.asInstanceOf[js.Any])
    
    inline def setHoverTimeUndefined: Self = StObject.set(x, "hoverTime", js.undefined)
  }
}
