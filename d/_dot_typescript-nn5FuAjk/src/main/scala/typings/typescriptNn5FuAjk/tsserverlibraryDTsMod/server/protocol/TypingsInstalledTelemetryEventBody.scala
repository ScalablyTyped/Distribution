package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypingsInstalledTelemetryEventBody
  extends StObject
     with TelemetryEventBody {
  
  @JSName("payload")
  var payload_TypingsInstalledTelemetryEventBody: TypingsInstalledTelemetryEventPayload
  
  @JSName("telemetryEventName")
  var telemetryEventName_TypingsInstalledTelemetryEventBody: TypingsInstalledTelemetryEventName
}
object TypingsInstalledTelemetryEventBody {
  
  inline def apply(
    payload: TypingsInstalledTelemetryEventPayload,
    telemetryEventName: TypingsInstalledTelemetryEventName
  ): TypingsInstalledTelemetryEventBody = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], telemetryEventName = telemetryEventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypingsInstalledTelemetryEventBody]
  }
  
  extension [Self <: TypingsInstalledTelemetryEventBody](x: Self) {
    
    inline def setPayload(value: TypingsInstalledTelemetryEventPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTelemetryEventName(value: TypingsInstalledTelemetryEventName): Self = StObject.set(x, "telemetryEventName", value.asInstanceOf[js.Any])
  }
}
