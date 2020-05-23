package typings.awsSdkClientDynamodbNode.typesListBackupsInputMod

import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.ALL
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.SYSTEM
import typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.USER
import typings.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupsInput extends InputTypesUnion {
  /**
    * An object that may be queried to determine if the underlying operation has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.undefined
  /**
    * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[NodeHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>The backups from the table specified by <code>BackupType</code> are listed.</p> <p>Where <code>BackupType</code> can be:</p> <ul> <li> <p> <code>USER</code> - On-demand backup created by you.</p> </li> <li> <p> <code>SYSTEM</code> - On-demand backup automatically created by DynamoDB.</p> </li> <li> <p> <code>ALL</code> - All types of on-demand backups (USER and SYSTEM).</p> </li> </ul>
    */
  var BackupType: js.UndefOr[USER | SYSTEM | ALL | String] = js.undefined
  /**
    * <p> <code>LastEvaluatedBackupArn</code> is the ARN of the backup last evaluated when the current page of results was returned, inclusive of the current page of results. This value may be specified as the <code>ExclusiveStartBackupArn</code> of a new <code>ListBackups</code> operation in order to fetch the next page of results. </p>
    */
  var ExclusiveStartBackupArn: js.UndefOr[String] = js.undefined
  /**
    * <p>Maximum number of backups to return at once.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  /**
    * <p>The backups from the table specified by <code>TableName</code> are listed. </p>
    */
  var TableName: js.UndefOr[String] = js.undefined
  /**
    * <p>Only backups created after this time are listed. <code>TimeRangeLowerBound</code> is inclusive.</p>
    */
  var TimeRangeLowerBound: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Only backups created before this time are listed. <code>TimeRangeUpperBound</code> is exclusive. </p>
    */
  var TimeRangeUpperBound: js.UndefOr[Date | String | Double] = js.undefined
}

object ListBackupsInput {
  @scala.inline
  def apply(
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined,
    BackupType: USER | SYSTEM | ALL | String = null,
    ExclusiveStartBackupArn: String = null,
    Limit: js.UndefOr[Double] = js.undefined,
    TableName: String = null,
    TimeRangeLowerBound: Date | String | Double = null,
    TimeRangeUpperBound: Date | String | Double = null
  ): ListBackupsInput = {
    val __obj = js.Dynamic.literal()
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    if (BackupType != null) __obj.updateDynamic("BackupType")(BackupType.asInstanceOf[js.Any])
    if (ExclusiveStartBackupArn != null) __obj.updateDynamic("ExclusiveStartBackupArn")(ExclusiveStartBackupArn.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (TableName != null) __obj.updateDynamic("TableName")(TableName.asInstanceOf[js.Any])
    if (TimeRangeLowerBound != null) __obj.updateDynamic("TimeRangeLowerBound")(TimeRangeLowerBound.asInstanceOf[js.Any])
    if (TimeRangeUpperBound != null) __obj.updateDynamic("TimeRangeUpperBound")(TimeRangeUpperBound.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupsInput]
  }
}

