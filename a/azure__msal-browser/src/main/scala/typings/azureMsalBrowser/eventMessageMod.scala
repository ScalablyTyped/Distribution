package typings.azureMsalBrowser

import typings.azureMsalBrowser.browserConstantsMod.InteractionStatus
import typings.azureMsalBrowser.browserConstantsMod.InteractionType
import typings.azureMsalBrowser.eventTypeMod.EventType
import typings.azureMsalCommon.accountInfoMod.AccountInfo
import typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.mod.AuthError
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventMessageMod {
  
  @JSImport("@azure/msal-browser/dist/event/EventMessage", "EventMessageUtils")
  @js.native
  open class EventMessageUtils () extends StObject
  /* static members */
  object EventMessageUtils {
    
    @JSImport("@azure/msal-browser/dist/event/EventMessage", "EventMessageUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets interaction status from event message
      * @param message
      * @param currentStatus
      */
    inline def getInteractionStatusFromEvent(message: EventMessage): InteractionStatus | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionStatusFromEvent")(message.asInstanceOf[js.Any]).asInstanceOf[InteractionStatus | Null]
    inline def getInteractionStatusFromEvent(message: EventMessage, currentStatus: InteractionStatus): InteractionStatus | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getInteractionStatusFromEvent")(message.asInstanceOf[js.Any], currentStatus.asInstanceOf[js.Any])).asInstanceOf[InteractionStatus | Null]
  }
  
  type EventCallbackFunction = js.Function1[/* message */ EventMessage, Unit]
  
  type EventError = AuthError | js.Error | Null
  
  trait EventMessage extends StObject {
    
    var error: EventError
    
    var eventType: EventType
    
    var interactionType: InteractionType | Null
    
    var payload: EventPayload
    
    var timestamp: Double
  }
  object EventMessage {
    
    inline def apply(eventType: EventType, timestamp: Double): EventMessage = {
      val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], error = null, interactionType = null, payload = null)
      __obj.asInstanceOf[EventMessage]
    }
    
    extension [Self <: EventMessage](x: Self) {
      
      inline def setError(value: EventError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setInteractionType(value: InteractionType): Self = StObject.set(x, "interactionType", value.asInstanceOf[js.Any])
      
      inline def setInteractionTypeNull: Self = StObject.set(x, "interactionType", null)
      
      inline def setPayload(value: EventPayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.azureMsalCommon.accountInfoMod.AccountInfo
    - typings.azureMsalBrowser.popupRequestMod.PopupRequest
    - typings.azureMsalBrowser.redirectRequestMod.RedirectRequest
    - typings.azureMsalBrowser.silentRequestMod.SilentRequest
    - typings.azureMsalBrowser.ssoSilentRequestMod.SsoSilentRequest
    - typings.azureMsalBrowser.endSessionRequestMod.EndSessionRequest
    - typings.azureMsalCommon.authenticationResultMod.AuthenticationResult
    - typings.azureMsalBrowser.eventMessageMod.PopupEvent
    - scala.Null
  */
  type EventPayload = _EventPayload | AccountInfo | AuthenticationResult | Null
  
  trait PopupEvent
    extends StObject
       with _EventPayload {
    
    var popupWindow: Window
  }
  object PopupEvent {
    
    inline def apply(popupWindow: Window): PopupEvent = {
      val __obj = js.Dynamic.literal(popupWindow = popupWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupEvent]
    }
    
    extension [Self <: PopupEvent](x: Self) {
      
      inline def setPopupWindow(value: Window): Self = StObject.set(x, "popupWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EventPayload extends StObject
  object _EventPayload {
    
    inline def EndSessionRequest(): typings.azureMsalBrowser.endSessionRequestMod.EndSessionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.azureMsalBrowser.endSessionRequestMod.EndSessionRequest]
    }
    
    inline def PopupEvent(popupWindow: Window): typings.azureMsalBrowser.eventMessageMod.PopupEvent = {
      val __obj = js.Dynamic.literal(popupWindow = popupWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMsalBrowser.eventMessageMod.PopupEvent]
    }
    
    inline def PopupRequest(scopes: js.Array[String]): typings.azureMsalBrowser.popupRequestMod.PopupRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMsalBrowser.popupRequestMod.PopupRequest]
    }
    
    inline def RedirectRequest(scopes: js.Array[String]): typings.azureMsalBrowser.redirectRequestMod.RedirectRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMsalBrowser.redirectRequestMod.RedirectRequest]
    }
    
    inline def SilentRequest(scopes: js.Array[String]): typings.azureMsalBrowser.silentRequestMod.SilentRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMsalBrowser.silentRequestMod.SilentRequest]
    }
    
    inline def SsoSilentRequest(): typings.azureMsalBrowser.ssoSilentRequestMod.SsoSilentRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.azureMsalBrowser.ssoSilentRequestMod.SsoSilentRequest]
    }
  }
}
