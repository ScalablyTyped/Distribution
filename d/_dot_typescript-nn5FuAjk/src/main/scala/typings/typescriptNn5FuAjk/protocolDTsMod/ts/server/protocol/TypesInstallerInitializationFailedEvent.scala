package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypesInstallerInitializationFailedEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_TypesInstallerInitializationFailedEvent: TypesInstallerInitializationFailedEventBody
  
  @JSName("event")
  var event_TypesInstallerInitializationFailedEvent: TypesInstallerInitializationFailedEventName
}
object TypesInstallerInitializationFailedEvent {
  
  inline def apply(
    body: TypesInstallerInitializationFailedEventBody,
    event: TypesInstallerInitializationFailedEventName,
    seq: Double
  ): TypesInstallerInitializationFailedEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[TypesInstallerInitializationFailedEvent]
  }
  
  extension [Self <: TypesInstallerInitializationFailedEvent](x: Self) {
    
    inline def setBody(value: TypesInstallerInitializationFailedEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: TypesInstallerInitializationFailedEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
