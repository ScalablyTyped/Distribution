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
  
  extension [Self <: SelectedTabId](x: Self) {
    
    inline def setSelectedTabId(value: TabId): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
  }
}
