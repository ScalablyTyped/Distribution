package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabGroup extends StObject {
  
  /**
    * children of the tab group
    */
  var tabs: js.Array[Tab]
  
  /**
    * Title of the tab group
    */
  var title: String
}
object TabGroup {
  
  inline def apply(tabs: js.Array[Tab], title: String): TabGroup = {
    val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabGroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TabGroup] (val x: Self) extends AnyVal {
    
    inline def setTabs(value: js.Array[Tab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    inline def setTabsVarargs(value: Tab*): Self = StObject.set(x, "tabs", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
