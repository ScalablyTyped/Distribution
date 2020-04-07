package typings.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod

import typings.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromStreamInput extends InputTypesUnion {
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
    * <p>The name of the stream.</p>
    */
  var StreamName: String
  /**
    * <p>A list of tag keys. Each corresponding tag is removed from the stream.</p>
    */
  var TagKeys: js.Array[String] | Iterable[String]
}

object RemoveTagsFromStreamInput {
  @scala.inline
  def apply(
    StreamName: String,
    TagKeys: js.Array[String] | Iterable[String],
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null
  ): RemoveTagsFromStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromStreamInput]
  }
}

