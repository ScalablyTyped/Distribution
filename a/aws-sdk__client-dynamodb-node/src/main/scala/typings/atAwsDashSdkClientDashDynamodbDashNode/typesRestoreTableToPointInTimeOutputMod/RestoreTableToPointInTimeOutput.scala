package typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableToPointInTimeOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreTableDescriptionMod._UnmarshalledTableDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableToPointInTimeOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Represents the properties of a table.</p>
    */
  var TableDescription: js.UndefOr[_UnmarshalledTableDescription] = js.undefined
}

object RestoreTableToPointInTimeOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TableDescription: _UnmarshalledTableDescription = null): RestoreTableToPointInTimeOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableToPointInTimeOutput]
  }
}

