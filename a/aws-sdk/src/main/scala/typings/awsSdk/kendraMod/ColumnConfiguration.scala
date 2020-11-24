package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnConfiguration extends js.Object {
  
  /**
    * One to five columns that indicate when a document in the database has changed.
    */
  var ChangeDetectingColumns: typings.awsSdk.kendraMod.ChangeDetectingColumns = js.native
  
  /**
    * The column that contains the contents of the document.
    */
  var DocumentDataColumnName: ColumnName = js.native
  
  /**
    * The column that provides the document's unique identifier.
    */
  var DocumentIdColumnName: ColumnName = js.native
  
  /**
    * The column that contains the title of the document.
    */
  var DocumentTitleColumnName: js.UndefOr[ColumnName] = js.native
  
  /**
    * An array of objects that map database column names to the corresponding fields in an index. You must first create the fields in the index using the UpdateIndex operation.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
}
object ColumnConfiguration {
  
  @scala.inline
  def apply(
    ChangeDetectingColumns: ChangeDetectingColumns,
    DocumentDataColumnName: ColumnName,
    DocumentIdColumnName: ColumnName
  ): ColumnConfiguration = {
    val __obj = js.Dynamic.literal(ChangeDetectingColumns = ChangeDetectingColumns.asInstanceOf[js.Any], DocumentDataColumnName = DocumentDataColumnName.asInstanceOf[js.Any], DocumentIdColumnName = DocumentIdColumnName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnConfiguration]
  }
  
  @scala.inline
  implicit class ColumnConfigurationOps[Self <: ColumnConfiguration] (val x: Self) extends AnyVal {
    
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
    def setChangeDetectingColumnsVarargs(value: ColumnName*): Self = this.set("ChangeDetectingColumns", js.Array(value :_*))
    
    @scala.inline
    def setChangeDetectingColumns(value: ChangeDetectingColumns): Self = this.set("ChangeDetectingColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentDataColumnName(value: ColumnName): Self = this.set("DocumentDataColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdColumnName(value: ColumnName): Self = this.set("DocumentIdColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleColumnName(value: ColumnName): Self = this.set("DocumentTitleColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTitleColumnName: Self = this.set("DocumentTitleColumnName", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = this.set("FieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = this.set("FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMappings: Self = this.set("FieldMappings", js.undefined)
  }
}
