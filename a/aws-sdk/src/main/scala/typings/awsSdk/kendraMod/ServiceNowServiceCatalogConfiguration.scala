package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNowServiceCatalogConfiguration extends StObject {
  
  /**
    * Indicates whether Amazon Kendra should crawl attachments to the service catalog items. 
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the ServiceNow field that is mapped to the index document contents field in the Amazon Kendra index.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  
  /**
    * The name of the ServiceNow field that is mapped to the index document title field.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  
  /**
    * Determines the types of file attachments that are excluded from the index.
    */
  var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before you map the field.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  
  /**
    * Determines the types of file attachments that are included in the index. 
    */
  var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
}
object ServiceNowServiceCatalogConfiguration {
  
  @scala.inline
  def apply(DocumentDataFieldName: DataSourceFieldName): ServiceNowServiceCatalogConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowServiceCatalogConfiguration]
  }
  
  @scala.inline
  implicit class ServiceNowServiceCatalogConfigurationMutableBuilder[Self <: ServiceNowServiceCatalogConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
    
    @scala.inline
    def setDocumentDataFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentDataFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    @scala.inline
    def setExcludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExcludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeAttachmentFilePatternsUndefined: Self = StObject.set(x, "ExcludeAttachmentFilePatterns", js.undefined)
    
    @scala.inline
    def setExcludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExcludeAttachmentFilePatterns", js.Array(value :_*))
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setIncludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "IncludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeAttachmentFilePatternsUndefined: Self = StObject.set(x, "IncludeAttachmentFilePatterns", js.undefined)
    
    @scala.inline
    def setIncludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "IncludeAttachmentFilePatterns", js.Array(value :_*))
  }
}
