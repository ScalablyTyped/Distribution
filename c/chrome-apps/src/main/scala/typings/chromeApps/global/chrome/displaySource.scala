package typings.chromeApps.global.chrome

import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.Disconnected_
import typings.chromeApps.chromeAppsStrings.PBC
import typings.chromeApps.chromeAppsStrings.PIN
import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typings.chromeApps.chromeAppsStrings.connection_error_
import typings.chromeApps.chromeAppsStrings.media_pipeline_error_
import typings.chromeApps.chromeAppsStrings.timeout_error_
import typings.chromeApps.chromeAppsStrings.unknown_error_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.displaySource
////////////////////
// Display Source //
////////////////////
/**
  * @requires(dev) Development versions only
  * @requires Permissions: 'displaySource'
  * The *chrome.displaySource* API creates a Display session using WebMediaStreamTrack as sources.
  * @todo TODO Finish documentation and typings
  */
object displaySource {
  
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
  object AuthenticationMethod {
    
    @JSGlobal("chrome.displaySource.AuthenticationMethod")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.displaySource.AuthenticationMethod.PBC")
    @js.native
    def PBC: typings.chromeApps.chromeAppsStrings.PBC = js.native
    inline def PBC_=(x: PBC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PBC")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.displaySource.AuthenticationMethod.PIN")
    @js.native
    def PIN: typings.chromeApps.chromeAppsStrings.PIN = js.native
    inline def PIN_=(x: PIN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PIN")(x.asInstanceOf[js.Any])
  }
  
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
  object ErrorType {
    
    @JSGlobal("chrome.displaySource.ErrorType")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.displaySource.ErrorType.CAPABILITIES_NEGOTIATION_ERROR")
    @js.native
    def CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_ = js.native
    inline def CAPABILITIES_NEGOTIATION_ERROR_=(x: capabilities_negotiation_error_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CAPABILITIES_NEGOTIATION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.displaySource.ErrorType.CONNECTION_ERROR")
    @js.native
    def CONNECTION_ERROR: connection_error_ = js.native
    inline def CONNECTION_ERROR_=(x: connection_error_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.displaySource.ErrorType.MEDIA_PIPELINE_ERROR")
    @js.native
    def MEDIA_PIPELINE_ERROR: media_pipeline_error_ = js.native
    inline def MEDIA_PIPELINE_ERROR_=(x: media_pipeline_error_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_PIPELINE_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.displaySource.ErrorType.TIMEOUT_ERROR")
    @js.native
    def TIMEOUT_ERROR: timeout_error_ = js.native
    inline def TIMEOUT_ERROR_=(x: timeout_error_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.displaySource.ErrorType.UNKNOWN_ERROR")
    @js.native
    def UNKNOWN_ERROR: unknown_error_ = js.native
    inline def UNKNOWN_ERROR_=(x: unknown_error_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
  }
  
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
  object SinkState {
    
    @JSGlobal("chrome.displaySource.SinkState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("chrome.displaySource.SinkState.CONNECTED")
    @js.native
    def CONNECTED: Connected_ = js.native
    inline def CONNECTED_=(x: Connected_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTED")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.displaySource.SinkState.CONNECTING")
    @js.native
    def CONNECTING: Connecting_ = js.native
    inline def CONNECTING_=(x: Connecting_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
    
    @JSGlobal("chrome.displaySource.SinkState.DISCONNECTED")
    @js.native
    def DISCONNECTED: Disconnected_ = js.native
    inline def DISCONNECTED_=(x: Disconnected_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECTED")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("chrome.displaySource.getAvailableSinks")
  @js.native
  val getAvailableSinks: js.Function = js.native
  
  @JSGlobal("chrome.displaySource.onSessionErrorOccured")
  @js.native
  val onSessionErrorOccured: typings.chromeApps.chrome.events.Event[Any] = js.native
  
  @JSGlobal("chrome.displaySource.onSessionTerminated")
  @js.native
  val onSessionTerminated: typings.chromeApps.chrome.events.Event[Any] = js.native
  
  @JSGlobal("chrome.displaySource.onSinksUpdated")
  @js.native
  val onSinksUpdated: typings.chromeApps.chrome.events.Event[Any] = js.native
  
  @JSGlobal("chrome.displaySource.requestAuthentication")
  @js.native
  val requestAuthentication: js.Function = js.native
  
  @JSGlobal("chrome.displaySource.startSession")
  @js.native
  val startSession: js.Function = js.native
  
  @JSGlobal("chrome.displaySource.terminateSession")
  @js.native
  val terminateSession: js.Function = js.native
}
