package typings.awsSdkClientPinpointBrowser.typesUpdateEndpointInputMod

import typings.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientPinpointBrowser.typesEndpointRequestMod.EndpointRequest
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateEndpointInput extends InputTypesUnion {
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
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: String
  /**
    * The unique ID of the endpoint.
    */
  var EndpointId: String
  /**
    * An endpoint update request.
    */
  var EndpointRequest: typings.awsSdkClientPinpointBrowser.typesEndpointRequestMod.EndpointRequest
}

object UpdateEndpointInput {
  @scala.inline
  def apply(
    ApplicationId: String,
    EndpointId: String,
    EndpointRequest: EndpointRequest,
    $abortSignal: AbortSignal = null,
    $httpOptions: BrowserHttpOptions = null,
    $maxRetries: Int | Double = null
  ): UpdateEndpointInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EndpointId = EndpointId.asInstanceOf[js.Any], EndpointRequest = EndpointRequest.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEndpointInput]
  }
}

