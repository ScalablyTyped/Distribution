package typings.awsSdkClientPinpointBrowser.typesCreateAppInputMod

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesCreateApplicationRequestMod.CreateApplicationRequest
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppInput extends InputTypesUnion {
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
    * Application Request.
    */
  var CreateApplicationRequest: typings.awsSdkClientPinpointBrowser.typesCreateApplicationRequestMod.CreateApplicationRequest
}

object CreateAppInput {
  @scala.inline
  def apply(
    CreateApplicationRequest: CreateApplicationRequest,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: js.UndefOr[Double] = js.undefined
  ): CreateAppInput = {
    val __obj = js.Dynamic.literal(CreateApplicationRequest = CreateApplicationRequest.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined($maxRetries)) __obj.updateDynamic("$maxRetries")($maxRetries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAppInput]
  }
}

