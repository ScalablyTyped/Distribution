package typings.awsSdkClientCodecommitNode.typesGetBlobInputMod

import typings.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlobInput extends InputTypesUnion {
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
    * <p>The ID of the blob, which is its SHA-1 pointer.</p>
    */
  var blobId: String
  /**
    * <p>The name of the repository that contains the blob.</p>
    */
  var repositoryName: String
}

object GetBlobInput {
  @scala.inline
  def apply(
    blobId: String,
    repositoryName: String,
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null
  ): GetBlobInput = {
    val __obj = js.Dynamic.literal(blobId = blobId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlobInput]
  }
}

