package typings.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod

import typings.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typings.awsSdkClientXrayNode.typesTelemetryRecordMod.TelemetryRecord
import typings.awsSdkTypes.abortMod.AbortSignal
import typings.awsSdkTypes.httpMod.NodeHttpOptions
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

object PutTelemetryRecordsInput {
  @scala.inline
  def apply(TelemetryRecords: js.Array[TelemetryRecord] | Iterable[TelemetryRecord]): PutTelemetryRecordsInput = {
    val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutTelemetryRecordsInput]
  }
  @scala.inline
  implicit class PutTelemetryRecordsInputOps[Self <: PutTelemetryRecordsInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTelemetryRecordsVarargs(value: TelemetryRecord*): Self = this.set("TelemetryRecords", js.Array(value :_*))
    @scala.inline
    def setTelemetryRecords(value: js.Array[TelemetryRecord] | Iterable[TelemetryRecord]): Self = this.set("TelemetryRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def set$abortSignal(value: AbortSignal): Self = this.set("$abortSignal", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$abortSignal: Self = this.set("$abortSignal", js.undefined)
    @scala.inline
    def set$httpOptions(value: NodeHttpOptions): Self = this.set("$httpOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$httpOptions: Self = this.set("$httpOptions", js.undefined)
    @scala.inline
    def set$maxRetries(value: Double): Self = this.set("$maxRetries", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$maxRetries: Self = this.set("$maxRetries", js.undefined)
    @scala.inline
    def setEC2InstanceId(value: String): Self = this.set("EC2InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEC2InstanceId: Self = this.set("EC2InstanceId", js.undefined)
    @scala.inline
    def setHostname(value: String): Self = this.set("Hostname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostname: Self = this.set("Hostname", js.undefined)
    @scala.inline
    def setResourceARN(value: String): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceARN: Self = this.set("ResourceARN", js.undefined)
  }
  
}

