package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnConfiguration extends StObject {
  
  /**
    * One to five columns that indicate when a document in the database has changed.
    */
  var ChangeDetectingColumns: typings.awsSdk.kendraMod.ChangeDetectingColumns
  
  /**
    * The column that contains the contents of the document.
    */
  var DocumentDataColumnName: ColumnName
  
  /**
    * The column that provides the document's unique identifier.
    */
  var DocumentIdColumnName: ColumnName
  
  /**
    * The column that contains the title of the document.
    */
  var DocumentTitleColumnName: js.UndefOr[ColumnName] = js.undefined
  
  /**
    * An array of objects that map database column names to the corresponding fields in an index. You must first create the fields in the index using the UpdateIndex operation.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
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
  implicit class ColumnConfigurationMutableBuilder[Self <: ColumnConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeDetectingColumns(value: ChangeDetectingColumns): Self = StObject.set(x, "ChangeDetectingColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeDetectingColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "ChangeDetectingColumns", js.Array(value :_*))
    
    @scala.inline
    def setDocumentDataColumnName(value: ColumnName): Self = StObject.set(x, "DocumentDataColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdColumnName(value: ColumnName): Self = StObject.set(x, "DocumentIdColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleColumnName(value: ColumnName): Self = StObject.set(x, "DocumentTitleColumnName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleColumnNameUndefined: Self = StObject.set(x, "DocumentTitleColumnName", js.undefined)
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value :_*))
  }
}
