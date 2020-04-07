package typings.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod

import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTimeToLiveInput extends InputTypesUnion {
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
    * <p>The name of the table to be configured.</p>
    */
  var TableName: String
  /**
    * <p>Represents the settings used to enable or disable Time to Live for the specified table.</p>
    */
  var TimeToLiveSpecification: typings.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
}

object UpdateTimeToLiveInput {
  @scala.inline
  def apply(
    TableName: String,
    TimeToLiveSpecification: TimeToLiveSpecification,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null
  ): UpdateTimeToLiveInput = {
    val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTimeToLiveInput]
  }
}

