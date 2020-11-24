package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetSchema extends js.Object {
  
  /**
    * A structure containing the list of column schemas.
    */
  var ColumnSchemaList: js.UndefOr[typings.awsSdk.quicksightMod.ColumnSchemaList] = js.native
}
object DataSetSchema {
  
  @scala.inline
  def apply(): DataSetSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetSchema]
  }
  
  @scala.inline
  implicit class DataSetSchemaOps[Self <: DataSetSchema] (val x: Self) extends AnyVal {
    
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
    def setColumnSchemaListVarargs(value: ColumnSchema*): Self = this.set("ColumnSchemaList", js.Array(value :_*))
    
    @scala.inline
    def setColumnSchemaList(value: ColumnSchemaList): Self = this.set("ColumnSchemaList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSchemaList: Self = this.set("ColumnSchemaList", js.undefined)
  }
}
