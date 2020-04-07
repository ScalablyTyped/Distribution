package typings.awsSdkClientDynamodbBrowser.typesTagResourceInputMod

import typings.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientDynamodbBrowser.typesTagMod.Tag
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends InputTypesUnion {
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
    * <p>Identifies the Amazon DynamoDB resource to which tags should be added. This value is an Amazon Resource Name (ARN).</p>
    */
  var ResourceArn: String
  /**
    * <p>The tags to be assigned to the Amazon DynamoDB resource.</p>
    */
  var Tags: js.Array[Tag] | Iterable[Tag]
}

object TagResourceInput {
  @scala.inline
  def apply(
    ResourceArn: String,
    Tags: js.Array[Tag] | Iterable[Tag],
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null
  ): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
}

