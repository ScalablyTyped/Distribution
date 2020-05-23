package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceStandardObjectConfiguration extends js.Object {
  /**
    * The name of the field in the standard object table that contains the document contents.
    */
  var DocumentDataFieldName: DataSourceFieldName = js.native
  /**
    * The name of the field in the standard object table that contains the document titleB.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  /**
    * One or more objects that map fields in the standard object to Amazon Kendra index fields. The index field must exist before you can map a Salesforce field to it.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  /**
    * The name of the standard object.
    */
  var Name: SalesforceStandardObjectName = js.native
}

object SalesforceStandardObjectConfiguration {
  @scala.inline
  def apply(
    DocumentDataFieldName: DataSourceFieldName,
    Name: SalesforceStandardObjectName,
    DocumentTitleFieldName: DataSourceFieldName = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null
  ): SalesforceStandardObjectConfiguration = {
    val __obj = js.Dynamic.literal(DocumentDataFieldName = DocumentDataFieldName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (DocumentTitleFieldName != null) __obj.updateDynamic("DocumentTitleFieldName")(DocumentTitleFieldName.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceStandardObjectConfiguration]
  }
}

