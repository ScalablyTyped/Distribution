package typings.cassandraDriver.mappingMod.mapping

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableMappings extends js.Object {
  
  def getColumnName(propName: String): String = js.native
  
  def getPropertyName(columnName: String): String = js.native
  
  def newObjectInstance(): js.Any = js.native
}
object TableMappings {
  
  @scala.inline
  def apply(
    getColumnName: String => String,
    getPropertyName: String => String,
    newObjectInstance: () => js.Any
  ): TableMappings = {
    val __obj = js.Dynamic.literal(getColumnName = js.Any.fromFunction1(getColumnName), getPropertyName = js.Any.fromFunction1(getPropertyName), newObjectInstance = js.Any.fromFunction0(newObjectInstance))
    __obj.asInstanceOf[TableMappings]
  }
  
  @scala.inline
  implicit class TableMappingsOps[Self <: TableMappings] (val x: Self) extends AnyVal {
    
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
    def setGetColumnName(value: String => String): Self = this.set("getColumnName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPropertyName(value: String => String): Self = this.set("getPropertyName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNewObjectInstance(value: () => js.Any): Self = this.set("newObjectInstance", js.Any.fromFunction0(value))
  }
}
