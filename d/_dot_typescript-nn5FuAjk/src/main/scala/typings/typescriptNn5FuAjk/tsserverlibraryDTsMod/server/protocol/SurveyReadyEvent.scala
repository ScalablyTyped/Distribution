package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SurveyReadyEvent
  extends StObject
     with Event {
  
  @JSName("body")
  var body_SurveyReadyEvent: SurveyReadyEventBody
  
  @JSName("event")
  var event_SurveyReadyEvent: SurveyReadyEventName
}
object SurveyReadyEvent {
  
  inline def apply(body: SurveyReadyEventBody, event: SurveyReadyEventName, seq: Double): SurveyReadyEvent = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("event")
    __obj.asInstanceOf[SurveyReadyEvent]
  }
  
  extension [Self <: SurveyReadyEvent](x: Self) {
    
    inline def setBody(value: SurveyReadyEventBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: SurveyReadyEventName): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
