package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabbedView extends StObject {
  
  var tabbedView: js.UndefOr[js.Object] = js.undefined
}
object TabbedView {
  
  inline def apply(): TabbedView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabbedView]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabbedView] (val x: Self) extends AnyVal {
    
    inline def setTabbedView(value: js.Object): Self = StObject.set(x, "tabbedView", value.asInstanceOf[js.Any])
    
    inline def setTabbedViewUndefined: Self = StObject.set(x, "tabbedView", js.undefined)
  }
}
