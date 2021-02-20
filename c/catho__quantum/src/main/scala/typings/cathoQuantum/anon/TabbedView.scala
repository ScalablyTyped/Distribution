package typings.cathoQuantum.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabbedView extends StObject {
  
  var tabbedView: js.UndefOr[js.Object] = js.native
}
object TabbedView {
  
  @scala.inline
  def apply(): TabbedView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabbedView]
  }
  
  @scala.inline
  implicit class TabbedViewMutableBuilder[Self <: TabbedView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTabbedView(value: js.Object): Self = StObject.set(x, "tabbedView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabbedViewUndefined: Self = StObject.set(x, "tabbedView", js.undefined)
  }
}
