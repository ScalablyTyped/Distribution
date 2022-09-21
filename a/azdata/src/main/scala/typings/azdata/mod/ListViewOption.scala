package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewOption extends StObject {
  
  /**
    * Id of the item.
    */
  var id: String
  
  /**
    * Display text of the item.
    */
  var label: String
}
object ListViewOption {
  
  inline def apply(id: String, label: String): ListViewOption = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewOption]
  }
  
  extension [Self <: ListViewOption](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
