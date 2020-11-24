package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputColumn extends js.Object {
  
  /**
    * The name of this column in the underlying data source.
    */
  var Name: ColumnName = js.native
  
  /**
    * The data type of the column.
    */
  var Type: InputColumnDataType = js.native
}
object InputColumn {
  
  @scala.inline
  def apply(Name: ColumnName, Type: InputColumnDataType): InputColumn = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputColumn]
  }
  
  @scala.inline
  implicit class InputColumnOps[Self <: InputColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: ColumnName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: InputColumnDataType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
