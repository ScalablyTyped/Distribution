package typings.chromeApps.global.chrome

import typings.chromeApps.chromeAppsStrings.Connected_
import typings.chromeApps.chromeAppsStrings.Connecting_
import typings.chromeApps.chromeAppsStrings.Disconnected_
import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typings.chromeApps.chromeAppsStrings.connection_error_
import typings.chromeApps.chromeAppsStrings.media_pipeline_error_
import typings.chromeApps.chromeAppsStrings.timeout_error_
import typings.chromeApps.chromeAppsStrings.unknown_error_
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSGlobal("chrome.displaySource")
@js.native
object displaySource extends js.Object {
  
  val getAvailableSinks: js.Function = js.native
  
  val onSessionErrorOccured: typings.chromeApps.chrome.events.Event[js.Any] = js.native
  
  val onSessionTerminated: typings.chromeApps.chrome.events.Event[js.Any] = js.native
  
  val onSinksUpdated: typings.chromeApps.chrome.events.Event[js.Any] = js.native
  
  val requestAuthentication: js.Function = js.native
  
  val startSession: js.Function = js.native
  
  val terminateSession: js.Function = js.native
  
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
  @js.native
  object AuthenticationMethod extends js.Object {
    
    var PBC: typings.chromeApps.chromeAppsStrings.PBC = js.native
    
    var PIN: typings.chromeApps.chromeAppsStrings.PIN = js.native
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
  @js.native
  object ErrorType extends js.Object {
    
    var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_ = js.native
    
    var CONNECTION_ERROR: connection_error_ = js.native
    
    var MEDIA_PIPELINE_ERROR: media_pipeline_error_ = js.native
    
    var TIMEOUT_ERROR: timeout_error_ = js.native
    
    var UNKNOWN_ERROR: unknown_error_ = js.native
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
  @js.native
  object SinkState extends js.Object {
    
    var CONNECTED: Connected_ = js.native
    
    var CONNECTING: Connecting_ = js.native
    
    var DISCONNECTED: Disconnected_ = js.native
  }
}
