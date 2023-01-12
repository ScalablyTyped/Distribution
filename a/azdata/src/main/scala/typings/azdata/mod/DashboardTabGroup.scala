package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardTabGroup extends StObject {
  
  /**
    * Child tabs of the tab group
    */
  var tabs: js.Array[DashboardTab]
  
  /**
    * Title of the tab group
    */
  var title: String
}
object DashboardTabGroup {
  
  inline def apply(tabs: js.Array[DashboardTab], title: String): DashboardTabGroup = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardTabGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardTabGroup] (val x: Self) extends AnyVal {
    
    inline def setTabs(value: js.Array[DashboardTab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: DashboardTab*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
