package typings.blueprintjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedTabId extends StObject {
  
  var selectedTabId: String | Double
}
object SelectedTabId {
  
  inline def apply(selectedTabId: String | Double): SelectedTabId = {
    val __obj = js.Dynamic.literal(selectedTabId = selectedTabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedTabId]
  }
  
  extension [Self <: SelectedTabId](x: Self) {
    
    inline def setSelectedTabId(value: String | Double): Self = StObject.set(x, "selectedTabId", value.asInstanceOf[js.Any])
  }
}
