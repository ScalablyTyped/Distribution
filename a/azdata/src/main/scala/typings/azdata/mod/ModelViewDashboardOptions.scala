package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelViewDashboardOptions extends StObject {
  
  /**
    * Whether to show the tab navigation pane even when there is only one tab, default is false
    */
  var alwaysShowTabs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to show the tab icon, default is true
    */
  var showIcon: js.UndefOr[Boolean] = js.undefined
}
object ModelViewDashboardOptions {
  
  inline def apply(): ModelViewDashboardOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelViewDashboardOptions]
  }
  
  extension [Self <: ModelViewDashboardOptions](x: Self) {
    
    inline def setAlwaysShowTabs(value: Boolean): Self = StObject.set(x, "alwaysShowTabs", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowTabsUndefined: Self = StObject.set(x, "alwaysShowTabs", js.undefined)
    
    inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
  }
}
