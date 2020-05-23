package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceStandardKnowledgeArticleTypeConfiguration extends js.Object {
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
  def apply(
    DocumentDataFieldName: DataSourceFieldName,
    DocumentTitleFieldName: DataSourceFieldName = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null
  ): SalesforceStandardKnowledgeArticleTypeConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    if (DocumentTitleFieldName != null) __obj.updateDynamic("DocumentTitleFieldName")(DocumentTitleFieldName.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceStandardKnowledgeArticleTypeConfiguration]
  }
}

