package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSetConfiguration extends js.Object {
  
  /**
    * A structure containing the list of column group schemas.
    */
  var ColumnGroupSchemaList: js.UndefOr[typings.awsSdk.quicksightMod.ColumnGroupSchemaList] = js.native
  
  /**
    * Dataset schema.
    */
  var DataSetSchema: js.UndefOr[typings.awsSdk.quicksightMod.DataSetSchema] = js.native
  
  /**
    * Placeholder.
    */
  var Placeholder: js.UndefOr[String] = js.native
}
object DataSetConfiguration {
  
  @scala.inline
  def apply(): DataSetConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSetConfiguration]
  }
  
  @scala.inline
  implicit class DataSetConfigurationOps[Self <: DataSetConfiguration] (val x: Self) extends AnyVal {
    
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
    def setColumnGroupSchemaListVarargs(value: ColumnGroupSchema*): Self = this.set("ColumnGroupSchemaList", js.Array(value :_*))
    
    @scala.inline
    def setColumnGroupSchemaList(value: ColumnGroupSchemaList): Self = this.set("ColumnGroupSchemaList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnGroupSchemaList: Self = this.set("ColumnGroupSchemaList", js.undefined)
    
    @scala.inline
    def setDataSetSchema(value: DataSetSchema): Self = this.set("DataSetSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSetSchema: Self = this.set("DataSetSchema", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("Placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("Placeholder", js.undefined)
  }
}
