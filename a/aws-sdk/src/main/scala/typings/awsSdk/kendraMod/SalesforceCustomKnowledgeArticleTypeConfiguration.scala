package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceCustomKnowledgeArticleTypeConfiguration extends StObject {
  
  /**
    * The name of the field in the custom knowledge article that contains the document data to index.
    */
  var DocumentDataFieldName: DataSourceFieldName
  
  /**
    * The name of the field in the custom knowledge article that contains the document title.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined
  
  /**
    * One or more objects that map fields in the custom knowledge article to fields in the Amazon Kendra index.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * The name of the configuration.
    */
  var Name: SalesforceCustomKnowledgeArticleTypeName
}
object SalesforceCustomKnowledgeArticleTypeConfiguration {
  
  @scala.inline
  def apply(DocumentDataFieldName: DataSourceFieldName, Name: SalesforceCustomKnowledgeArticleTypeName): SalesforceCustomKnowledgeArticleTypeConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceCustomKnowledgeArticleTypeConfiguration]
  }
  
  @scala.inline
  implicit class SalesforceCustomKnowledgeArticleTypeConfigurationMutableBuilder[Self <: SalesforceCustomKnowledgeArticleTypeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setName(value: SalesforceCustomKnowledgeArticleTypeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
