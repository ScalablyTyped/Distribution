package typings.awsSdkClientDynamodbBrowser.typesDeleteBackupOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBackupDescriptionMod.UnmarshalledBackupDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Contains the description of the backup created for the table.</p>
    */
  var BackupDescription: js.UndefOr[UnmarshalledBackupDescription] = js.undefined
}

object DeleteBackupOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, BackupDescription: UnmarshalledBackupDescription = null): DeleteBackupOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (BackupDescription != null) __obj.updateDynamic("BackupDescription")(BackupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupOutput]
  }
}

