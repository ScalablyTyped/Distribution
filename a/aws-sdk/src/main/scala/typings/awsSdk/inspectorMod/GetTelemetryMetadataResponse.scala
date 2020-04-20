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
}

