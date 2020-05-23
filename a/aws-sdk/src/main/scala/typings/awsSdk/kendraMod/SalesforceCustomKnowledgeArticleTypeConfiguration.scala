package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceCustomKnowledgeArticleTypeConfiguration extends js.Object {
  /**
    * The name of the field in the custom knowledge article that contains the document data to index.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  /**
    * The name of the field in the custom knowledge article that contains the document title.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  /**
    * One or more objects that map fields in the custom knowledge article to fields in the Amazon Kendra index.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  /**
    * The name of the configuration.
    */
  var Name: SalesforceCustomKnowledgeArticleTypeName = js.native
}

object SalesforceCustomKnowledgeArticleTypeConfiguration {
  @scala.inline
  def apply(
    DocumentDataFieldName: DataSourceFieldName,
    Name: SalesforceCustomKnowledgeArticleTypeName,
    DocumentTitleFieldName: DataSourceFieldName = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null
  ): SalesforceCustomKnowledgeArticleTypeConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (DocumentTitleFieldName != null) __obj.updateDynamic("DocumentTitleFieldName")(DocumentTitleFieldName.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceCustomKnowledgeArticleTypeConfiguration]
  }
}

