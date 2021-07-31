package typings.awsSdk.inspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTelemetryMetadataResponse extends StObject {
  
  /**
    * Telemetry details.
    */
  var telemetryMetadata: TelemetryMetadataList
}
object GetTelemetryMetadataResponse {
  
  @scala.inline
  def apply(telemetryMetadata: TelemetryMetadataList): GetTelemetryMetadataResponse = {
    val __obj = js.Dynamic.literal(telemetryMetadata = telemetryMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTelemetryMetadataResponse]
  }
  
  @scala.inline
  implicit class GetTelemetryMetadataResponseMutableBuilder[Self <: GetTelemetryMetadataResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTelemetryMetadata(value: TelemetryMetadataList): Self = StObject.set(x, "telemetryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelemetryMetadataVarargs(value: TelemetryMetadata*): Self = StObject.set(x, "telemetryMetadata", js.Array(value :_*))
  }
}
