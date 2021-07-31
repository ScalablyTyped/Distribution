package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProfilerTableRow extends StObject {
  
  /**
    * Name of the event; known issue this is not camel case, need to figure
    * out a better way to determine column id's from rendered column names
    */
  var EventClass: String
}
object IProfilerTableRow {
  
  @scala.inline
  def apply(EventClass: String): IProfilerTableRow = {
    val __obj = js.Dynamic.literal(EventClass = EventClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProfilerTableRow]
  }
  
  @scala.inline
  implicit class IProfilerTableRowMutableBuilder[Self <: IProfilerTableRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventClass(value: String): Self = StObject.set(x, "EventClass", value.asInstanceOf[js.Any])
  }
}
