package typings.atAwsDashSdkClientDashDynamodbDashNode.typesListBackupsOutputMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesOutputTypesUnionMod.OutputTypesUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUnderscoreBackupSummaryMod._UnmarshalledBackupSummary
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupsOutput extends OutputTypesUnion {
  /**
    * Metadata about the response received, including the HTTP status code, HTTP headers, and any request identifiers recognized by the SDK.
    */
  @JSName("$metadata")
  var $metadata: ResponseMetadata
  /**
    * <p>List of <code>BackupSummary</code> objects.</p>
    */
  var BackupSummaries: js.UndefOr[js.Array[_UnmarshalledBackupSummary]] = js.undefined
  /**
    * <p> The ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page of results. </p> <p> If <code>LastEvaluatedBackupArn</code> is empty, then the last page of results has been processed and there are no more results to be retrieved. </p> <p> If <code>LastEvaluatedBackupArn</code> is not empty, this may or may not indicate there is more data to be returned. All results are guaranteed to have been returned if and only if no value for <code>LastEvaluatedBackupArn</code> is returned. </p>
    */
  var LastEvaluatedBackupArn: js.UndefOr[String] = js.undefined
}

object ListBackupsOutput {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    BackupSummaries: js.Array[_UnmarshalledBackupSummary] = null,
    LastEvaluatedBackupArn: String = null
  ): ListBackupsOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
    if (BackupSummaries != null) __obj.updateDynamic("BackupSummaries")(BackupSummaries.asInstanceOf[js.Any])
    if (LastEvaluatedBackupArn != null) __obj.updateDynamic("LastEvaluatedBackupArn")(LastEvaluatedBackupArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupsOutput]
  }
}

