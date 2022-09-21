package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TelemetryEventBody extends StObject {
  
  var payload: Any
  
  var telemetryEventName: String
}
object TelemetryEventBody {
  
  inline def apply(payload: Any, telemetryEventName: String): TelemetryEventBody = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], telemetryEventName = telemetryEventName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TelemetryEventBody]
  }
  
  extension [Self <: TelemetryEventBody](x: Self) {
    
    inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setTelemetryEventName(value: String): Self = StObject.set(x, "telemetryEventName", value.asInstanceOf[js.Any])
  }
}
