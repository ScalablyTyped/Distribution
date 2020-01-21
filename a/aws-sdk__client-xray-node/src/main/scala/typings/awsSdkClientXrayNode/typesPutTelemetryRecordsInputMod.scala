package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesTelemetryRecordMod.TelemetryRecord
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/types/PutTelemetryRecordsInput", JSImport.Namespace)
@js.native
object typesPutTelemetryRecordsInputMod extends js.Object {
  @js.native
  trait PutTelemetryRecordsInput extends InputTypesUnion {
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
      * <p/>
      */
    var EC2InstanceId: js.UndefOr[String] = js.native
    /**
      * <p/>
      */
    var Hostname: js.UndefOr[String] = js.native
    /**
      * <p/>
      */
    var ResourceARN: js.UndefOr[String] = js.native
    /**
      * <p/>
      */
    var TelemetryRecords: js.Array[TelemetryRecord] | Iterable[TelemetryRecord] = js.native
  }
  
}

