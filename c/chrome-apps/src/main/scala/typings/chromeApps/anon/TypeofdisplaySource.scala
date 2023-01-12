package typings.chromeApps.anon

import typings.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofdisplaySource extends StObject {
  
  /**
    * @enum
    * @description
    *
    * **'PBC'**
    * Push Button Config authentication method.
    *
    * **'PIN'**
    * PIN authentication method.
    */
  val AuthenticationMethod: PBC
  
  /**
    * @enum
    * @description
    * **'connection_error'**
    * The connection with sink cannot be established or has dropped unexpectedly.
    *
    * **'capabilities_negotiation_error'**
    * The capabilities of this Display Source and the connected
    * sink do not fit (e.g. the sink cannot play the media content of
    * the formats given by the source).
    *
    * **'media_pipeline_error'**
    * There was an error in media pipeline: while encoding, packetizing or
    * sending the media content.
    *
    * **'timeout_error'**
    * The sink became unresponsive.
    *
    * **'unknown_error'**
    * Unspecified error.
    */
  val ErrorType: CAPABILITIESNEGOTIATIONERROR
  
  /**
    * @enum
    * @description
    * **'connected'**
    * Connected using this Display Source (i.e., there is an active session)
    *
    * **'connecting'**
    * In process of connection to this Display Source
    *
    * **'disconnected'**
    * Disconnected from this Display Source
    */
  val SinkState: CONNECTED
  
  val getAvailableSinks: js.Function
  
  val onSessionErrorOccured: Event[Any]
  
  val onSessionTerminated: Event[Any]
  
  val onSinksUpdated: Event[Any]
  
  val requestAuthentication: js.Function
  
  val startSession: js.Function
  
  val terminateSession: js.Function
}
object TypeofdisplaySource {
  
  inline def apply(
    AuthenticationMethod: PBC,
    ErrorType: CAPABILITIESNEGOTIATIONERROR,
    SinkState: CONNECTED,
    getAvailableSinks: js.Function,
    onSessionErrorOccured: Event[Any],
    onSessionTerminated: Event[Any],
    onSinksUpdated: Event[Any],
    requestAuthentication: js.Function,
    startSession: js.Function,
    terminateSession: js.Function
  ): TypeofdisplaySource = {
    val __obj = js.Dynamic.literal(AuthenticationMethod = AuthenticationMethod.asInstanceOf[js.Any], ErrorType = ErrorType.asInstanceOf[js.Any], SinkState = SinkState.asInstanceOf[js.Any], getAvailableSinks = getAvailableSinks.asInstanceOf[js.Any], onSessionErrorOccured = onSessionErrorOccured.asInstanceOf[js.Any], onSessionTerminated = onSessionTerminated.asInstanceOf[js.Any], onSinksUpdated = onSinksUpdated.asInstanceOf[js.Any], requestAuthentication = requestAuthentication.asInstanceOf[js.Any], startSession = startSession.asInstanceOf[js.Any], terminateSession = terminateSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdisplaySource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofdisplaySource] (val x: Self) extends AnyVal {
    
    inline def setAuthenticationMethod(value: PBC): Self = StObject.set(x, "AuthenticationMethod", value.asInstanceOf[js.Any])
    
    inline def setErrorType(value: CAPABILITIESNEGOTIATIONERROR): Self = StObject.set(x, "ErrorType", value.asInstanceOf[js.Any])
    
    inline def setGetAvailableSinks(value: js.Function): Self = StObject.set(x, "getAvailableSinks", value.asInstanceOf[js.Any])
    
    inline def setOnSessionErrorOccured(value: Event[Any]): Self = StObject.set(x, "onSessionErrorOccured", value.asInstanceOf[js.Any])
    
    inline def setOnSessionTerminated(value: Event[Any]): Self = StObject.set(x, "onSessionTerminated", value.asInstanceOf[js.Any])
    
    inline def setOnSinksUpdated(value: Event[Any]): Self = StObject.set(x, "onSinksUpdated", value.asInstanceOf[js.Any])
    
    inline def setRequestAuthentication(value: js.Function): Self = StObject.set(x, "requestAuthentication", value.asInstanceOf[js.Any])
    
    inline def setSinkState(value: CONNECTED): Self = StObject.set(x, "SinkState", value.asInstanceOf[js.Any])
    
    inline def setStartSession(value: js.Function): Self = StObject.set(x, "startSession", value.asInstanceOf[js.Any])
    
    inline def setTerminateSession(value: js.Function): Self = StObject.set(x, "terminateSession", value.asInstanceOf[js.Any])
  }
}
