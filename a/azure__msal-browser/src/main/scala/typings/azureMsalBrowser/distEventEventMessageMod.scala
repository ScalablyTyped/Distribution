package typings.azureMsalBrowser

import typings.azureMsalBrowser.distCryptoMsrBrowserCryptoMod.global.Window
import typings.azureMsalBrowser.distEventEventTypeMod.EventType
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionStatus
import typings.azureMsalBrowser.distUtilsBrowserConstantsMod.InteractionType
import typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
import typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
import typings.azureMsalCommon.mod.AuthError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEventEventMessageMod {
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMessage] (val x: Self) extends AnyVal {
      
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
    - typings.azureMsalCommon.distAccountAccountInfoMod.AccountInfo
    - typings.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest
    - typings.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest
    - typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest
    - typings.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest
    - typings.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest
    - typings.azureMsalCommon.distResponseAuthenticationResultMod.AuthenticationResult
    - typings.azureMsalBrowser.distEventEventMessageMod.PopupEvent
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupEvent] (val x: Self) extends AnyVal {
      
      inline def setPopupWindow(value: Window): Self = StObject.set(x, "popupWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait _EventPayload extends StObject
  object _EventPayload {
    
    inline def EndSessionRequest(): typings.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.azureMsalBrowser.distRequestEndSessionRequestMod.EndSessionRequest]
    }
    
    inline def PopupEvent(popupWindow: Window): typings.azureMsalBrowser.distEventEventMessageMod.PopupEvent = {
      val __obj = js.Dynamic.literal(popupWindow = popupWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMsalBrowser.distEventEventMessageMod.PopupEvent]
    }
    
    inline def PopupRequest(scopes: js.Array[String]): typings.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMsalBrowser.distRequestPopupRequestMod.PopupRequest]
    }
    
    inline def RedirectRequest(scopes: js.Array[String]): typings.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMsalBrowser.distRequestRedirectRequestMod.RedirectRequest]
    }
    
    inline def SilentRequest(scopes: js.Array[String]): typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest = {
      val __obj = js.Dynamic.literal(scopes = scopes.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.azureMsalBrowser.distRequestSilentRequestMod.SilentRequest]
    }
    
    inline def SsoSilentRequest(): typings.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.azureMsalBrowser.distRequestSsoSilentRequestMod.SsoSilentRequest]
    }
  }
}
