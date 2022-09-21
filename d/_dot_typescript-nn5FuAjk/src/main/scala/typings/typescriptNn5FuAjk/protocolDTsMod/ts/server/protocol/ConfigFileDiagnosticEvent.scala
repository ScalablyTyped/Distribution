package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.configFileDiag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Event message for "configFileDiag" event type.
  * This event provides errors for a found config file.
  */
trait ConfigFileDiagnosticEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_ConfigFileDiagnosticEvent: js.UndefOr[ConfigFileDiagnosticEventBody] = js.undefined
  
  @JSName("event")
  var event_ConfigFileDiagnosticEvent: configFileDiag
}
object ConfigFileDiagnosticEvent {
  
  inline def apply(seq: Double): ConfigFileDiagnosticEvent = {
    val __obj = js.Dynamic.literal(event = "configFileDiag", seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[ConfigFileDiagnosticEvent]
  }
  
  extension [Self <: ConfigFileDiagnosticEvent](x: Self) {
    
    inline def setBody(value: ConfigFileDiagnosticEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setEvent(value: configFileDiag): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
