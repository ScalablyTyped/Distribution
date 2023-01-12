package typings.bullBoard.anon

import typings.bullBoard.distUiHooksUseDetailsTabsMod.TabsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedTab extends StObject {
  
  var selectedTab: TabsType
  
  var tabs: js.Array[IsActive]
}
object SelectedTab {
  
  inline def apply(selectedTab: TabsType, tabs: js.Array[IsActive]): SelectedTab = {
    val __obj = js.Dynamic.literal(selectedTab = selectedTab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedTab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectedTab] (val x: Self) extends AnyVal {
    
    inline def setSelectedTab(value: TabsType): Self = StObject.set(x, "selectedTab", value.asInstanceOf[js.Any])
    
    inline def setTabs(value: js.Array[IsActive]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: IsActive*): Self = StObject.set(x, "tabs", js.Array(value*))
  }
}
