package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceNowServiceCatalogConfiguration extends js.Object {
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
  def apply(
    DocumentDataFieldName: DataSourceFieldName,
    CrawlAttachments: js.UndefOr[Boolean] = js.undefined,
    DocumentTitleFieldName: DataSourceFieldName = null,
    ExcludeAttachmentFilePatterns: DataSourceInclusionsExclusionsStrings = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null,
    IncludeAttachmentFilePatterns: DataSourceInclusionsExclusionsStrings = null
  ): ServiceNowServiceCatalogConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    if (!js.isUndefined(CrawlAttachments)) __obj.updateDynamic("CrawlAttachments")(CrawlAttachments.get.asInstanceOf[js.Any])
    if (DocumentTitleFieldName != null) __obj.updateDynamic("DocumentTitleFieldName")(DocumentTitleFieldName.asInstanceOf[js.Any])
    if (ExcludeAttachmentFilePatterns != null) __obj.updateDynamic("ExcludeAttachmentFilePatterns")(ExcludeAttachmentFilePatterns.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    if (IncludeAttachmentFilePatterns != null) __obj.updateDynamic("IncludeAttachmentFilePatterns")(IncludeAttachmentFilePatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceNowServiceCatalogConfiguration]
  }
}

