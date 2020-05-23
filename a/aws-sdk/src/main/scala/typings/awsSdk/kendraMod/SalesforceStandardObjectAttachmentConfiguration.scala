package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceStandardObjectAttachmentConfiguration extends js.Object {
  /**
    * The name of the field used for the document title.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  /**
    * One or more objects that map fields in attachments to Amazon Kendra index fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
}

object SalesforceStandardObjectAttachmentConfiguration {
  @scala.inline
  def apply(
    DocumentTitleFieldName: DataSourceFieldName = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null
  ): SalesforceStandardObjectAttachmentConfiguration = {
    val __obj = js.Dynamic.literal()
    if (DocumentTitleFieldName != null) __obj.updateDynamic("DocumentTitleFieldName")(DocumentTitleFieldName.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceStandardObjectAttachmentConfiguration]
  }
}

