package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataSourceToIndexFieldMapping extends StObject {
  
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
  implicit class DataSourceToIndexFieldMappingMutableBuilder[Self <: DataSourceToIndexFieldMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSourceFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DataSourceFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldFormat(value: DataSourceDateFieldFormat): Self = StObject.set(x, "DateFieldFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateFieldFormatUndefined: Self = StObject.set(x, "DateFieldFormat", js.undefined)
    
    @scala.inline
    def setIndexFieldName(value: IndexFieldName): Self = StObject.set(x, "IndexFieldName", value.asInstanceOf[js.Any])
  }
}
