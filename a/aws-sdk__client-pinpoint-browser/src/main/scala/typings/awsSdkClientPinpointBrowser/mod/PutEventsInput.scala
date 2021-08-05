package typings.awsSdkClientPinpointBrowser.mod

import typings.awsSdkClientPinpointBrowser.typesEventsRequestMod.EventsRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsInput
  extends StObject
     with typings.awsSdkClientPinpointBrowser.typesPutEventsInputMod.PutEventsInput
object PutEventsInput {
  
  inline def apply(ApplicationId: String, EventsRequest: EventsRequest): PutEventsInput = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], EventsRequest = EventsRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsInput]
  }
}
