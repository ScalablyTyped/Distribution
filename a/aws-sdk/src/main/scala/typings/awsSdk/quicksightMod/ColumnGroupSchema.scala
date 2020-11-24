package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnGroupSchema extends js.Object {
  
  /**
    * A structure containing the list of schemas for column group columns.
    */
  var ColumnGroupColumnSchemaList: js.UndefOr[typings.awsSdk.quicksightMod.ColumnGroupColumnSchemaList] = js.native
  
  /**
    * The name of the column group schema.
    */
  var Name: js.UndefOr[String] = js.native
}
object ColumnGroupSchema {
  
  @scala.inline
  def apply(): ColumnGroupSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnGroupSchema]
  }
  
  @scala.inline
  implicit class ColumnGroupSchemaOps[Self <: ColumnGroupSchema] (val x: Self) extends AnyVal {
    
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
    def setColumnGroupColumnSchemaListVarargs(value: ColumnGroupColumnSchema*): Self = this.set("ColumnGroupColumnSchemaList", js.Array(value :_*))
    
    @scala.inline
    def setColumnGroupColumnSchemaList(value: ColumnGroupColumnSchemaList): Self = this.set("ColumnGroupColumnSchemaList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGroupColumnSchemaList: Self = this.set("ColumnGroupColumnSchemaList", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
