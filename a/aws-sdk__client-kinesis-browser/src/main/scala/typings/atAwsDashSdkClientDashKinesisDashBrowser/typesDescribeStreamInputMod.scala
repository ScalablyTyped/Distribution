package typings.atAwsDashSdkClientDashKinesisDashBrowser

import typings.atAwsDashSdkClientDashKinesisDashBrowser.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.BrowserHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/types/DescribeStreamInput", JSImport.Namespace)
@js.native
object typesDescribeStreamInputMod extends js.Object {
  @js.native
  trait DescribeStreamInput extends InputTypesUnion {
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
      * <p>The shard ID of the shard to start with.</p>
      */
    var ExclusiveStartShardId: js.UndefOr[String] = js.native
    /**
      * <p>The maximum number of shards to return in a single call. The default value is 100. If you specify a value greater than 100, at most 100 shards are returned.</p>
      */
    var Limit: js.UndefOr[Double] = js.native
    /**
      * <p>The name of the stream to describe.</p>
      */
    var StreamName: String = js.native
  }
  
}

