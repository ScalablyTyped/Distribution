package typings.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTableDescriptionMod.UnmarshalledTableDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
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
  var TableDescription: js.UndefOr[UnmarshalledTableDescription] = js.undefined
}

object RestoreTableFromBackupOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, TableDescription: UnmarshalledTableDescription = null): RestoreTableFromBackupOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (TableDescription != null) __obj.updateDynamic("TableDescription")(TableDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreTableFromBackupOutput]
  }
}

