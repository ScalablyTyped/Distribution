package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesPutRecordsInputMod

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscorePutRecordsRequestEntryMod._PutRecordsRequestEntry
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRecordsInput extends InputTypesUnion {
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
    * <p>The records associated with the request.</p>
    */
  var Records: js.Array[_PutRecordsRequestEntry] | Iterable[_PutRecordsRequestEntry]
  /**
    * <p>The stream name associated with the request.</p>
    */
  var StreamName: String
}

object PutRecordsInput {
  @scala.inline
  def apply(
    Records: js.Array[_PutRecordsRequestEntry] | Iterable[_PutRecordsRequestEntry],
    StreamName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null
  ): PutRecordsInput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any], StreamName = StreamName)
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal)
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions)
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsInput]
  }
}

