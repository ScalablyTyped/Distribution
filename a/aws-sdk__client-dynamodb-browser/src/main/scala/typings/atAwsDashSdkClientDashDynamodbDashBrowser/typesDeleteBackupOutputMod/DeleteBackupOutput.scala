package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteBackupOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUnderscoreBackupDescriptionMod._UnmarshalledBackupDescription
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var BackupDescription: js.UndefOr[_UnmarshalledBackupDescription] = js.undefined
}

object DeleteBackupOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, BackupDescription: _UnmarshalledBackupDescription = null): DeleteBackupOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (BackupDescription != null) __obj.updateDynamic("BackupDescription")(BackupDescription)
    __obj.asInstanceOf[DeleteBackupOutput]
  }
}

