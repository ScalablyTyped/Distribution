package typings.awsSdkClientDynamodbBrowser.typesCreateBackupOutputMod

import typings.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesBackupDetailsMod.UnmarshalledBackupDetails
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>Contains the details of the backup created for the table.</p>
    */
  var BackupDetails: js.UndefOr[UnmarshalledBackupDetails] = js.undefined
}

object CreateBackupOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, BackupDetails: UnmarshalledBackupDetails = null): CreateBackupOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupOutput]
  }
}

