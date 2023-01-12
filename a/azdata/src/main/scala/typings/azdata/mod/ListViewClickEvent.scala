package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListViewClickEvent extends StObject {
  
  var id: String
}
object ListViewClickEvent {
  
  inline def apply(id: String): ListViewClickEvent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListViewClickEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListViewClickEvent] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
