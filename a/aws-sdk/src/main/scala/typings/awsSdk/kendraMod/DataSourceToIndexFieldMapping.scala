package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceToIndexFieldMapping extends js.Object {
  
  /**
    * The name of the column or attribute in the data source.
    */
  var DataSourceFieldName: typings.awsSdk.kendraMod.DataSourceFieldName = js.native
  
  /**
    * The type of data stored in the column or attribute.
    */
  var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.native
  
  /**
    * The name of the field in the index.
    */
  var IndexFieldName: typings.awsSdk.kendraMod.IndexFieldName = js.native
}
object DataSourceToIndexFieldMapping {
  
  @scala.inline
  def apply(DataSourceFieldName: DataSourceFieldName, IndexFieldName: IndexFieldName): DataSourceToIndexFieldMapping = {
    val __obj = js.Dynamic.literal(DataSourceFieldName = DataSourceFieldName.asInstanceOf[js.Any], IndexFieldName = IndexFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSourceToIndexFieldMapping]
  }
  
  @scala.inline
  implicit class DataSourceToIndexFieldMappingOps[Self <: DataSourceToIndexFieldMapping] (val x: Self) extends AnyVal {
    
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
    def setDataSourceFieldName(value: DataSourceFieldName): Self = this.set("DataSourceFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFieldName(value: IndexFieldName): Self = this.set("IndexFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldFormat(value: DataSourceDateFieldFormat): Self = this.set("DateFieldFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFieldFormat: Self = this.set("DateFieldFormat", js.undefined)
  }
}
