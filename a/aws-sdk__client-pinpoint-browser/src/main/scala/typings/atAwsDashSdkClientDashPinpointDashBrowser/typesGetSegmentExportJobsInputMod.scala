package typings.atAwsDashSdkClientDashPinpointDashBrowser

import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/types/GetSegmentExportJobsInput", JSImport.Namespace)
@js.native
object typesGetSegmentExportJobsInputMod extends js.Object {
  @js.native
  trait GetSegmentExportJobsInput extends InputTypesUnion {
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
      * The unique ID of your Amazon Pinpoint application.
      */
    var ApplicationId: String = js.native
    /**
      * The number of entries you want on each page in the response.
      */
    var PageSize: js.UndefOr[String] = js.native
    /**
      * The unique ID of the segment.
      */
    var SegmentId: String = js.native
    /**
      * The NextToken string returned on a previous page that you use to get the next page of results in a paginated response.
      */
    var Token: js.UndefOr[String] = js.native
  }
  
}

