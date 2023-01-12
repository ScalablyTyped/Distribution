package typings.blueprintjsCore.anon

import typings.blueprintjsCore.libEsmComponentsTabsTabMod.TabId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedTabId extends StObject {
  
  var selectedTabId: TabId
}
object SelectedTabId {
  
  inline def apply(selectedTabId: TabId): SelectedTabId = {
    val __obj = js.Dynamic.literal(selectedTabId = selectedTabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedTabId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedTabId] (val x: Self) extends AnyVal {
    
    inline def setSelectedTabId(value: TabId): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
  }
}
