package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesListGlobalTablesInputMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGlobalTablesInput extends InputTypesUnion {
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
    * <p>The first global table name that this operation will evaluate.</p>
    */
  var ExclusiveStartGlobalTableName: js.UndefOr[String] = js.undefined
  /**
    * <p>The maximum number of table names to return.</p>
    */
  var Limit: js.UndefOr[Double] = js.undefined
  /**
    * <p>Lists the global tables in a specific region.</p>
    */
  var RegionName: js.UndefOr[String] = js.undefined
}

object ListGlobalTablesInput {
  @scala.inline
  def apply(
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null,
    ExclusiveStartGlobalTableName: String = null,
    Limit: Int | Double = null,
    RegionName: String = null
  ): ListGlobalTablesInput = {
    val __obj = js.Dynamic.literal()
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (ExclusiveStartGlobalTableName != null) __obj.updateDynamic("ExclusiveStartGlobalTableName")(ExclusiveStartGlobalTableName.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (RegionName != null) __obj.updateDynamic("RegionName")(RegionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGlobalTablesInput]
  }
}

