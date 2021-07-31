package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluencePageToIndexFieldMapping extends StObject {
  
  /**
    * The name of the field in the data source. 
    */
  var DataSourceFieldName: js.UndefOr[ConfluencePageFieldName] = js.undefined
  
  /**
    * The format for date fields in the data source. If the field specified in DataSourceFieldName is a date field you must specify the date format. If the field is not a date field, an exception is thrown.
    */
  var DateFieldFormat: js.UndefOr[DataSourceDateFieldFormat] = js.undefined
  
  /**
    * The name of the index field to map to the Confluence data source field. The index field type must match the Confluence field type.
    */
  var IndexFieldName: js.UndefOr[typings.awsSdk.kendraMod.IndexFieldName] = js.undefined
}
object ConfluencePageToIndexFieldMapping {
  
  @scala.inline
  def apply(): ConfluencePageToIndexFieldMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfluencePageToIndexFieldMapping]
  }
  
  @scala.inline
  implicit class ConfluencePageToIndexFieldMappingMutableBuilder[Self <: ConfluencePageToIndexFieldMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceFieldName(value: ConfluencePageFieldName): Self = StObject.set(x, "DataSourceFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceFieldNameUndefined: Self = StObject.set(x, "DataSourceFieldName", js.undefined)
    
    @scala.inline
    def setDateFieldFormat(value: DataSourceDateFieldFormat): Self = StObject.set(x, "DateFieldFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldFormatUndefined: Self = StObject.set(x, "DateFieldFormat", js.undefined)
    
    @scala.inline
    def setIndexFieldName(value: IndexFieldName): Self = StObject.set(x, "IndexFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexFieldNameUndefined: Self = StObject.set(x, "IndexFieldName", js.undefined)
  }
}
