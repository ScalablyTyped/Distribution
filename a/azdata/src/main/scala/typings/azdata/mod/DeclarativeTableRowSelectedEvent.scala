package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclarativeTableRowSelectedEvent extends StObject {
  
  var row: Double
}
object DeclarativeTableRowSelectedEvent {
  
  inline def apply(row: Double): DeclarativeTableRowSelectedEvent = {
    val __obj = js.Dynamic.literal(row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarativeTableRowSelectedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeclarativeTableRowSelectedEvent] (val x: Self) extends AnyVal {
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
