package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardTab
  extends StObject
     with Tab {
  
  /**
    * Toolbar of the tab, optional.
    */
  var toolbar: js.UndefOr[ToolbarContainer] = js.undefined
}
object DashboardTab {
  
  inline def apply(content: Component, id: String, title: String): DashboardTab = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashboardTab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DashboardTab] (val x: Self) extends AnyVal {
    
    inline def setToolbar(value: ToolbarContainer): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
