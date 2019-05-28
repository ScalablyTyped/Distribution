package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofdisplaySource extends js.Object {
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
  val AuthenticationMethod: Anon_PBC
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
  val ErrorType: Anon_CAPABILITIESNEGOTIATIONERROR
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
  val SinkState: Anon_CONNECTED
  val getAvailableSinks: js.Function
  val onSessionErrorOccured: chromeDashAppsLib.chromeNs.eventsNs.Event[_]
  val onSessionTerminated: chromeDashAppsLib.chromeNs.eventsNs.Event[_]
  val onSinksUpdated: chromeDashAppsLib.chromeNs.eventsNs.Event[_]
  val requestAuthentication: js.Function
  val startSession: js.Function
  val terminateSession: js.Function
}

object TypeofdisplaySource {
  @scala.inline
  def apply(
    AuthenticationMethod: Anon_PBC,
    ErrorType: Anon_CAPABILITIESNEGOTIATIONERROR,
    SinkState: Anon_CONNECTED,
    getAvailableSinks: js.Function,
    onSessionErrorOccured: chromeDashAppsLib.chromeNs.eventsNs.Event[_],
    onSessionTerminated: chromeDashAppsLib.chromeNs.eventsNs.Event[_],
    onSinksUpdated: chromeDashAppsLib.chromeNs.eventsNs.Event[_],
    requestAuthentication: js.Function,
    startSession: js.Function,
    terminateSession: js.Function
  ): TypeofdisplaySource = {
    val __obj = js.Dynamic.literal(AuthenticationMethod = AuthenticationMethod, ErrorType = ErrorType, SinkState = SinkState, getAvailableSinks = getAvailableSinks, onSessionErrorOccured = onSessionErrorOccured, onSessionTerminated = onSessionTerminated, onSinksUpdated = onSinksUpdated, requestAuthentication = requestAuthentication, startSession = startSession, terminateSession = terminateSession)
  
    __obj.asInstanceOf[TypeofdisplaySource]
  }
}

