package typings.chromeApps

import typings.chromeApps.chrome.events.Event
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
  val AuthenticationMethod: AnonPBC
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
  val ErrorType: AnonCAPABILITIESNEGOTIATIONERROR
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
  val SinkState: AnonCONNECTED
  val getAvailableSinks: js.Function
  val onSessionErrorOccured: Event[_]
  val onSessionTerminated: Event[_]
  val onSinksUpdated: Event[_]
  val requestAuthentication: js.Function
  val startSession: js.Function
  val terminateSession: js.Function
}

object TypeofdisplaySource {
  @scala.inline
  def apply(
    AuthenticationMethod: AnonPBC,
    ErrorType: AnonCAPABILITIESNEGOTIATIONERROR,
    SinkState: AnonCONNECTED,
    getAvailableSinks: js.Function,
    onSessionErrorOccured: Event[_],
    onSessionTerminated: Event[_],
    onSinksUpdated: Event[_],
    requestAuthentication: js.Function,
    startSession: js.Function,
    terminateSession: js.Function
  ): TypeofdisplaySource = {
    val __obj = js.Dynamic.literal(AuthenticationMethod = AuthenticationMethod.asInstanceOf[js.Any], ErrorType = ErrorType.asInstanceOf[js.Any], SinkState = SinkState.asInstanceOf[js.Any], getAvailableSinks = getAvailableSinks.asInstanceOf[js.Any], onSessionErrorOccured = onSessionErrorOccured.asInstanceOf[js.Any], onSessionTerminated = onSessionTerminated.asInstanceOf[js.Any], onSinksUpdated = onSinksUpdated.asInstanceOf[js.Any], requestAuthentication = requestAuthentication.asInstanceOf[js.Any], startSession = startSession.asInstanceOf[js.Any], terminateSession = terminateSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofdisplaySource]
  }
}

