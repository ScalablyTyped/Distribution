package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProfilerTableRow extends js.Object {
  
  /**
    * Name of the event; known issue this is not camel case, need to figure
    * out a better way to determine column id's from rendered column names
    */
  var EventClass: String = js.native
}
object IProfilerTableRow {
  
  @scala.inline
  def apply(EventClass: String): IProfilerTableRow = {
    val __obj = js.Dynamic.literal(EventClass = EventClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProfilerTableRow]
  }
  
  @scala.inline
  implicit class IProfilerTableRowOps[Self <: IProfilerTableRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventClass(value: String): Self = this.set("EventClass", value.asInstanceOf[js.Any])
  }
}
