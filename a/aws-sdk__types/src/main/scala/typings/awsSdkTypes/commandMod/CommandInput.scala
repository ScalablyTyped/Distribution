package typings.awsSdkTypes.commandMod

import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.HttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandInput extends js.Object {
  /**
    * An object that may be queried to determine if the underlying operation
    * has been aborted.
    *
    * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
    */
  @JSName("$abortSignal")
  var $abortSignal: js.UndefOr[AbortSignal] = js.native
  /**
    * Per-request HTTP configuration options. If set, any options specified will
    * override the corresponding HTTP option set on the client for this command.
    */
  @JSName("$httpOptions")
  var $httpOptions: js.UndefOr[HttpOptions] = js.native
  /**
    * The maximum number of times this operation should be retried. If set, this
    * value will override the `maxRetries` configuration set on the client for
    * this command.
    */
  @JSName("$maxRetries")
  var $maxRetries: js.UndefOr[Double] = js.native
}

