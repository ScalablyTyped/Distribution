package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableFromBackupOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreTableDescriptionMod._UnmarshalledTableDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableFromBackupOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>The description of the table created from an existing backup.</p>
    */
  var TableDescription: js.UndefOr[_UnmarshalledTableDescription] = js.undefined
}

object RestoreTableFromBackupOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TableDescription: _UnmarshalledTableDescription = null): RestoreTableFromBackupOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription)
    __obj.asInstanceOf[RestoreTableFromBackupOutput]
  }
}

