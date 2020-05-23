package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    DocumentDataFieldName: DataSourceFieldName,
    CrawlAttachments: js.UndefOr[Boolean] = js.undefined,
    DocumentTitleFieldName: DataSourceFieldName = null,
    ExcludeAttachmentFilePatterns: DataSourceInclusionsExclusionsStrings = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null,
    IncludeAttachmentFilePatterns: DataSourceInclusionsExclusionsStrings = null
  ): ServiceNowKnowledgeArticleConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(CrawlAttachments)) __obj.updateDynamic("CrawlAttachments")(CrawlAttachments.get.asInstanceOf[js.Any])
    if (DocumentTitleFieldName != null) __obj.updateDynamic("DocumentTitleFieldName")(DocumentTitleFieldName.asInstanceOf[js.Any])
    if (ExcludeAttachmentFilePatterns != null) __obj.updateDynamic("ExcludeAttachmentFilePatterns")(ExcludeAttachmentFilePatterns.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    if (IncludeAttachmentFilePatterns != null) __obj.updateDynamic("IncludeAttachmentFilePatterns")(IncludeAttachmentFilePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowKnowledgeArticleConfiguration]
  }
}

