package typings.atAwsDashSdkClientDashDynamodbDashNode

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesInputTypesUnionMod.InputTypesUnion
import typings.atAwsDashSdkTypes.buildAbortMod.AbortSignal
import typings.atAwsDashSdkTypes.buildHttpMod.NodeHttpOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/types/DescribeGlobalTableSettingsInput", JSImport.Namespace)
@js.native
object typesDescribeGlobalTableSettingsInputMod extends js.Object {
  @js.native
  trait DescribeGlobalTableSettingsInput extends InputTypesUnion {
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
    var $httpOptions: js.UndefOr[NodeHttpOptions] = js.native
    /**
      * The maximum number of times this operation should be retried. If set, this value will override the `maxRetries` configuration set on the client for this command.
      */
    @JSName("$maxRetries")
    var $maxRetries: js.UndefOr[Double] = js.native
    /**
      * <p>The name of the global table to describe.</p>
      */
    var GlobalTableName: String = js.native
  }
  
}

