package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceStandardObjectConfiguration extends StObject {
  
  /**
    * The name of the field in the standard object table that contains the document contents.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  
  /**
    * The name of the field in the standard object table that contains the document titleB.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  
  /**
    * One or more objects that map fields in the standard object to Amazon Kendra index fields. The index field must exist before you can map a Salesforce field to it.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  
  /**
    * The name of the standard object.
    */
  var Name: SalesforceStandardObjectName = js.native
}
object SalesforceStandardObjectConfiguration {
  
  @scala.inline
  def apply(DocumentDataFieldName: DataSourceFieldName, Name: SalesforceStandardObjectName): SalesforceStandardObjectConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceStandardObjectConfiguration]
  }
  
  @scala.inline
  implicit class SalesforceStandardObjectConfigurationMutableBuilder[Self <: SalesforceStandardObjectConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentDataFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentDataFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setName(value: SalesforceStandardObjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
