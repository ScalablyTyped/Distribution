package typings.awsSdkClientDynamodbNode.typesDescribeBackupOutputMod

import typings.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typings.awsSdkClientDynamodbNode.typesBackupDescriptionMod.UnmarshalledBackupDescription
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBackupOutput extends OutputTypesUnion {
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

object DescribeBackupOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata, BackupDescription: UnmarshalledBackupDescription = null): DescribeBackupOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (BackupDescription != null) __obj.updateDynamic("BackupDescription")(BackupDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBackupOutput]
  }
}

