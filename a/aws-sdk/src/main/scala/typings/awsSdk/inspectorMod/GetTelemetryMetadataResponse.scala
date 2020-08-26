package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTelemetryMetadataResponse extends js.Object {
  /**
    * Telemetry details.
    */
  var telemetryMetadata: TelemetryMetadataList = js.native
}

object GetTelemetryMetadataResponse {
  @scala.inline
  def apply(telemetryMetadata: TelemetryMetadataList): GetTelemetryMetadataResponse = {
    val __obj = js.Dynamic.literal(telemetryMetadata = telemetryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTelemetryMetadataResponse]
  }
  @scala.inline
  implicit class GetTelemetryMetadataResponseOps[Self <: GetTelemetryMetadataResponse] (val x: Self) extends AnyVal {
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
    def setTelemetryMetadataVarargs(value: TelemetryMetadata*): Self = this.set("telemetryMetadata", js.Array(value :_*))
    @scala.inline
    def setTelemetryMetadata(value: TelemetryMetadataList): Self = this.set("telemetryMetadata", value.asInstanceOf[js.Any])
  }
  
}

