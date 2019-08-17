package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableToPointInTimeInputMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreTableToPointInTimeInput extends InputTypesUnion {
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
  var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.undefined
  /**
    * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.undefined
  /**
    * <p>Time in the past to restore the table to.</p>
    */
  var RestoreDateTime: js.UndefOr[Date | String | Double] = js.undefined
  /**
    * <p>Name of the source table that is being restored.</p>
    */
  var SourceTableName: String
  /**
    * <p>The name of the new table to which it must be restored to.</p>
    */
  var TargetTableName: String
  /**
    * <p>Restore the table to the latest possible time. <code>LatestRestorableDateTime</code> is typically 5 minutes before the current time. </p>
    */
  var UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
}

object RestoreTableToPointInTimeInput {
  @scala.inline
  def apply(
    SourceTableName: String,
    TargetTableName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    RestoreDateTime: Date | String | Double = null,
    UseLatestRestorableTime: js.UndefOr[Boolean] = js.undefined
  ): RestoreTableToPointInTimeInput = {
    val __obj = js.Dynamic.literal(SourceTableName = SourceTableName, TargetTableName = TargetTableName)
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (RestoreDateTime != null) __obj.updateDynamic("RestoreDateTime")(RestoreDateTime.asInstanceOf[js.Any])
    if (!js.isUndefined(UseLatestRestorableTime)) __obj.updateDynamic("UseLatestRestorableTime")(UseLatestRestorableTime)
    __obj.asInstanceOf[RestoreTableToPointInTimeInput]
  }
}

