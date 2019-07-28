package typings.chromeDashApps.chromeNs.displaySourceNs

import typings.chromeDashApps.chromeDashAppsStrings.capabilities_negotiation_error
import typings.chromeDashApps.chromeDashAppsStrings.connection_error
import typings.chromeDashApps.chromeDashAppsStrings.media_pipeline_error
import typings.chromeDashApps.chromeDashAppsStrings.timeout_error
import typings.chromeDashApps.chromeDashAppsStrings.unknown_error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSGlobal("chrome.displaySource.ErrorType")
@js.native
object ErrorType extends js.Object {
  var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error = js.native
  var CONNECTION_ERROR: connection_error = js.native
  var MEDIA_PIPELINE_ERROR: media_pipeline_error = js.native
  var TIMEOUT_ERROR: timeout_error = js.native
  var UNKNOWN_ERROR: unknown_error = js.native
}

