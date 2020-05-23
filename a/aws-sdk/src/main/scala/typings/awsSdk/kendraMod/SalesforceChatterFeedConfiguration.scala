package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceChatterFeedConfiguration extends js.Object {
  /**
    * The name of the column in the Salesforce FeedItem table that contains the content to index. Typically this is the Body column.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  /**
    * The name of the column in the Salesforce FeedItem table that contains the title of the document. This is typically the Title collumn.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  /**
    * Maps fields from a Salesforce chatter feed into Amazon Kendra index fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  /**
    * Filters the documents in the feed based on status of the user. When you specify ACTIVE_USERS only documents from users who have an active account are indexed. When you specify STANDARD_USER only documents for Salesforce standard users are documented. You can specify both.
    */
  var IncludeFilterTypes: js.UndefOr[SalesforceChatterFeedIncludeFilterTypes] = js.native
}

object SalesforceChatterFeedConfiguration {
  @scala.inline
  def apply(
    DocumentDataFieldName: DataSourceFieldName,
    DocumentTitleFieldName: DataSourceFieldName = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null,
    IncludeFilterTypes: SalesforceChatterFeedIncludeFilterTypes = null
  ): SalesforceChatterFeedConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    if (DocumentTitleFieldName != null) __obj.updateDynamic("DocumentTitleFieldName")(DocumentTitleFieldName.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    if (IncludeFilterTypes != null) __obj.updateDynamic("IncludeFilterTypes")(IncludeFilterTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceChatterFeedConfiguration]
  }
}

