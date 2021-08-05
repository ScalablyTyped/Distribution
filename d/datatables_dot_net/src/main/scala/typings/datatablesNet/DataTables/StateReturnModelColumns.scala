package typings.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StateReturnModelColumns extends StObject {
  
  var search: SearchSettings
  
  var visible: Boolean
}
object StateReturnModelColumns {
  
  inline def apply(search: SearchSettings, visible: Boolean): StateReturnModelColumns = {
    val __obj = js.Dynamic.literal(search = search.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateReturnModelColumns]
  }
  
  extension [Self <: StateReturnModelColumns](x: Self) {
    
    inline def setSearch(value: SearchSettings): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
