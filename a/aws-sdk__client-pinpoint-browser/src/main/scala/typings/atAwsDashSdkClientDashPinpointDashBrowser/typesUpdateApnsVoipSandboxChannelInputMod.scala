package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreAPNSVoipSandboxChannelRequestMod._APNSVoipSandboxChannelRequest
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/UpdateApnsVoipSandboxChannelInput", JSImport.Namespace)
@js.native
object typesUpdateApnsVoipSandboxChannelInputMod extends js.Object {
  @js.native
  trait UpdateApnsVoipSandboxChannelInput extends InputTypesUnion {
    /**
      * An object that may be queried to determine if the underlying operation has been aborted.
      *
      * @see https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal
      */
    @JSName("$abortSignal")
    var $abortSignal: js.UndefOr[AbortSignal] = js.native
    /**
      * Per-request HTTP configuration options. If set, any options specified will override the corresponding HTTP option set on the client for this command.
      */
    @JSName("$httpOptions")
    var $httpOptions: js.UndefOr[BrowserHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * Apple VoIP Developer Push Notification Service channel definition.
      */
    var APNSVoipSandboxChannelRequest: _APNSVoipSandboxChannelRequest = js.native
    /**
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: String = js.native
  }
  
}

