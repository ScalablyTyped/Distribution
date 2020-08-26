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
  def apply(DocumentDataFieldName: DataSourceFieldName): SalesforceChatterFeedConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceChatterFeedConfiguration]
  }
  @scala.inline
  implicit class SalesforceChatterFeedConfigurationOps[Self <: SalesforceChatterFeedConfiguration] (val x: Self) extends AnyVal {
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
    def setDocumentTitleFieldName(value: DataSourceFieldName): Self = this.set("DocumentTitleFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentTitleFieldName: Self = this.set("DocumentTitleFieldName", js.undefined)
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = this.set("FieldMappings", js.Array(value :_*))
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = this.set("FieldMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldMappings: Self = this.set("FieldMappings", js.undefined)
    @scala.inline
    def setIncludeFilterTypesVarargs(value: SalesforceChatterFeedIncludeFilterType*): Self = this.set("IncludeFilterTypes", js.Array(value :_*))
    @scala.inline
    def setIncludeFilterTypes(value: SalesforceChatterFeedIncludeFilterTypes): Self = this.set("IncludeFilterTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeFilterTypes: Self = this.set("IncludeFilterTypes", js.undefined)
  }
  
}

