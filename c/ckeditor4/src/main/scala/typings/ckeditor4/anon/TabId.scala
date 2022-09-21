package typings.ckeditor4.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabId extends StObject {
  
  var tabId: js.UndefOr[String] = js.undefined
}
object TabId {
  
  inline def apply(): TabId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabId]
  }
  
  extension [Self <: TabId](x: Self) {
    
    inline def setTabId(value: String): Self = StObject.set(x, "tabId", value.asInstanceOf[js.Any])
    
    inline def setTabIdUndefined: Self = StObject.set(x, "tabId", js.undefined)
  }
}
