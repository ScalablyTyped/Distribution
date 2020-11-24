package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluenceAttachmentToIndexFieldMapping extends js.Object {
  
  /**
    * The name of the field in the data source.  You must first create the index field using the operation. 
    */
  var DataSourceFieldName: js.UndefOr[ConfluenceAttachmentFieldName] = js.native
  
  /**
    * The format for date fields in the data source. If the field specified in DataSourceFieldName is a date field you must specify the date format. If the field is not a date field, an exception is thrown.
    */
  var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.native
  
  /**
    * The name of the index field to map to the Confluence data source field. The index field type must match the Confluence field type.
    */
  var IndexFieldName: js.UndefOr[typings.awsSdk.kendraMod.IndexFieldName] = js.native
}
object ConfluenceAttachmentToIndexFieldMapping {
  
  @scala.inline
  def apply(): ConfluenceAttachmentToIndexFieldMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluenceAttachmentToIndexFieldMapping]
  }
  
  @scala.inline
  implicit class ConfluenceAttachmentToIndexFieldMappingOps[Self <: ConfluenceAttachmentToIndexFieldMapping] (val x: Self) extends AnyVal {
    
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
    def setDataSourceFieldName(value: ConfluenceAttachmentFieldName): Self = this.set("DataSourceFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSourceFieldName: Self = this.set("DataSourceFieldName", js.undefined)
    
    @scala.inline
    def setDateFieldFormat(value: DataSourceDateFieldFormat): Self = this.set("DateFieldFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateFieldFormat: Self = this.set("DateFieldFormat", js.undefined)
    
    @scala.inline
    def setIndexFieldName(value: IndexFieldName): Self = this.set("IndexFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexFieldName: Self = this.set("IndexFieldName", js.undefined)
  }
}
