package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SalesforceStandardKnowledgeArticleTypeConfiguration extends StObject {
  
  /**
    * The name of the field that contains the document data to index.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  
  /**
    * The name of the field that contains the document title.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  
  /**
    * One or more objects that map fields in the knowledge article to Amazon Kendra index fields. The index field must exist before you can map a Salesforce field to it.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
}
object SalesforceStandardKnowledgeArticleTypeConfiguration {
  
  @scala.inline
  def apply(DocumentDataFieldName: DataSourceFieldName): SalesforceStandardKnowledgeArticleTypeConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceStandardKnowledgeArticleTypeConfiguration]
  }
  
  @scala.inline
  implicit class SalesforceStandardKnowledgeArticleTypeConfigurationMutableBuilder[Self <: SalesforceStandardKnowledgeArticleTypeConfiguration] (val x: Self) extends AnyVal {
    
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
  }
}
