package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceStandardObjectConfiguration extends StObject {
  
  /**
    * The name of the field in the standard object table that contains the document contents.
    */
  var DocumentDataFieldName: DataSourceFieldName
  
  /**
    * The name of the field in the standard object table that contains the document titleB.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined
  
  /**
    * One or more objects that map fields in the standard object to Amazon Kendra index fields. The index field must exist before you can map a Salesforce field to it.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * The name of the standard object.
    */
  var Name: SalesforceStandardObjectName
}
object SalesforceStandardObjectConfiguration {
  
  inline def apply(DocumentDataFieldName: DataSourceFieldName, Name: SalesforceStandardObjectName): SalesforceStandardObjectConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceStandardObjectConfiguration]
  }
  
  extension [Self <: SalesforceStandardObjectConfiguration](x: Self) {
    
    inline def setDocumentDataFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentDataFieldName", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value :_*))
    
    inline def setName(value: SalesforceStandardObjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
