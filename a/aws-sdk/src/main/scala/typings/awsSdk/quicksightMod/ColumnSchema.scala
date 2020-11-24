package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnSchema extends js.Object {
  
  /**
    * The data type of the column schema.
    */
  var DataType: js.UndefOr[String] = js.native
  
  /**
    * The geographic role of the column schema.
    */
  var GeographicRole: js.UndefOr[String] = js.native
  
  /**
    * The name of the column schema.
    */
  var Name: js.UndefOr[String] = js.native
}
object ColumnSchema {
  
  @scala.inline
  def apply(): ColumnSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnSchema]
  }
  
  @scala.inline
  implicit class ColumnSchemaOps[Self <: ColumnSchema] (val x: Self) extends AnyVal {
    
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
    def setDataType(value: String): Self = this.set("DataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("DataType", js.undefined)
    
    @scala.inline
    def setGeographicRole(value: String): Self = this.set("GeographicRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeographicRole: Self = this.set("GeographicRole", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
