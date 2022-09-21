package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabbedPanelLayout extends StObject {
  
  /**
    * Whether to show the tab navigation pane even when there is only one tab. Default false.
    */
  var alwaysShowTabs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tab orientation. Default horizontal.
    */
  var orientation: js.UndefOr[TabOrientation] = js.undefined
  
  /**
    * Whether to show the tab icon. Default false.
    */
  var showIcon: js.UndefOr[Boolean] = js.undefined
}
object TabbedPanelLayout {
  
  inline def apply(): TabbedPanelLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabbedPanelLayout]
  }
  
  extension [Self <: TabbedPanelLayout](x: Self) {
    
    inline def setAlwaysShowTabs(value: Boolean): Self = StObject.set(x, "alwaysShowTabs", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowTabsUndefined: Self = StObject.set(x, "alwaysShowTabs", js.undefined)
    
    inline def setOrientation(value: TabOrientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
    
    inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
  }
}
