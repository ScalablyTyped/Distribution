package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceNowKnowledgeArticleConfiguration extends js.Object {
  
  /**
    * Indicates whether Amazon Kendra should index attachments to knowledge articles.
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
    * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not indexed. The regex is applied to the field specified in the PatternTargetField 
    */
  var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * Mapping between ServiceNow fields and Amazon Kendra index fields. You must create the index field before you map the field.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  
  /**
    * List of regular expressions applied to knowledge articles. Items that don't match the inclusion pattern are not indexed. The regex is applied to the field specified in the PatternTargetField.
    */
  var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
}
object ServiceNowKnowledgeArticleConfiguration {
  
  @scala.inline
  def apply(DocumentDataFieldName: DataSourceFieldName): ServiceNowKnowledgeArticleConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowKnowledgeArticleConfiguration]
  }
  
  @scala.inline
  implicit class ServiceNowKnowledgeArticleConfigurationOps[Self <: ServiceNowKnowledgeArticleConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDocumentDataFieldName(value: DataSourceFieldName): Self = this.set("DocumentDataFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlAttachments(value: Boolean): Self = this.set("CrawlAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlAttachments: Self = this.set("CrawlAttachments", js.undefined)
    
    @scala.inline
    def setDocumentTitleFieldName(value: DataSourceFieldName): Self = this.set("DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTitleFieldName: Self = this.set("DocumentTitleFieldName", js.undefined)
    
    @scala.inline
    def setExcludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("ExcludeAttachmentFilePatterns", js.Array(value :_*))
    
    @scala.inline
    def setExcludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("ExcludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeAttachmentFilePatterns: Self = this.set("ExcludeAttachmentFilePatterns", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = this.set("FieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = this.set("FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMappings: Self = this.set("FieldMappings", js.undefined)
    
    @scala.inline
    def setIncludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("IncludeAttachmentFilePatterns", js.Array(value :_*))
    
    @scala.inline
    def setIncludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("IncludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAttachmentFilePatterns: Self = this.set("IncludeAttachmentFilePatterns", js.undefined)
  }
}
