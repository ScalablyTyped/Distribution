package typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateBackupOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreBackupDetailsMod._UnmarshalledBackupDetails
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
  var BackupDetails: js.UndefOr[_UnmarshalledBackupDetails] = js.undefined
}

object CreateBackupOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, BackupDetails: _UnmarshalledBackupDetails = null): CreateBackupOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata)
    if (BackupDetails != null) __obj.updateDynamic("BackupDetails")(BackupDetails)
    __obj.asInstanceOf[CreateBackupOutput]
  }
}

