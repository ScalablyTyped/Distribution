package typings.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesTelemetryRecordMod.TelemetryRecord
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTelemetryRecordsInput extends InputTypesUnion {
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
    * <p/>
    */
  var EC2InstanceId: js.UndefOr[String] = js.undefined
  /**
    * <p/>
    */
  var Hostname: js.UndefOr[String] = js.undefined
  /**
    * <p/>
    */
  var ResourceARN: js.UndefOr[String] = js.undefined
  /**
    * <p/>
    */
  var TelemetryRecords: js.Array[TelemetryRecord] | Iterable[TelemetryRecord]
}

object PutTelemetryRecordsInput {
  @scala.inline
  def apply(
    TelemetryRecords: js.Array[TelemetryRecord] | Iterable[TelemetryRecord],
    $abortSignal: AbortSignal = null,
    $httpOptions: NodeHttpOptions = null,
    $maxRetries: Int | Double = null,
    EC2InstanceId: String = null,
    Hostname: String = null,
    ResourceARN: String = null
  ): PutTelemetryRecordsInput = {
    val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
    if ($abortSignal != null) __obj.updateDynamic("$abortSignal")($abortSignal.asInstanceOf[js.Any])
    if ($httpOptions != null) __obj.updateDynamic("$httpOptions")($httpOptions.asInstanceOf[js.Any])
    if ($maxRetries != null) __obj.updateDynamic("$maxRetries")($maxRetries.asInstanceOf[js.Any])
    if (EC2InstanceId != null) __obj.updateDynamic("EC2InstanceId")(EC2InstanceId.asInstanceOf[js.Any])
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname.asInstanceOf[js.Any])
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTelemetryRecordsInput]
  }
}

