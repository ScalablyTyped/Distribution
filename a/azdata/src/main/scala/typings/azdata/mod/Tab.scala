package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tab extends StObject {
  
  /**
    * Content component of the tab
    */
  var content: Component
  
  /**
    * Icon of the tab
    */
  var icon: js.UndefOr[IconPath] = js.undefined
  
  /**
    * Id of the tab
    */
  var id: String
  
  /**
    * Title of the tab
    */
  var title: String
}
object Tab {
  
  inline def apply(content: Component, id: String, title: String): Tab = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
  
  extension [Self <: Tab](x: Self) {
    
    inline def setContent(value: Component): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: IconPath): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
