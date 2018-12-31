package typings
package chromeDashAppsLib.chromeNs.displaySourceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.displaySource")
@js.native
object displaySourceNsMembers extends js.Object {
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
  val AuthenticationMethod: chromeDashAppsLib.Anon_PBC = js.native
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
  val ErrorType: chromeDashAppsLib.Anon_UNKNOWNERROR = js.native
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
  val SinkState: chromeDashAppsLib.Anon_DISCONNECTED = js.native
  val getAvailableSinks: js.Function = js.native
  val onSessionErrorOccured: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Any] = js.native
  val onSessionTerminated: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Any] = js.native
  val onSinksUpdated: chromeDashAppsLib.chromeNs.eventsNs.Event[js.Any] = js.native
  val requestAuthentication: js.Function = js.native
  val startSession: js.Function = js.native
  val terminateSession: js.Function = js.native
}

