package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error
import typings.chromeApps.chromeAppsStrings.connection_error
import typings.chromeApps.chromeAppsStrings.media_pipeline_error
import typings.chromeApps.chromeAppsStrings.timeout_error
import typings.chromeApps.chromeAppsStrings.unknown_error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCAPABILITIESNEGOTIATIONERROR extends js.Object {
  var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error
  var CONNECTION_ERROR: connection_error
  var MEDIA_PIPELINE_ERROR: media_pipeline_error
  var TIMEOUT_ERROR: timeout_error
  var UNKNOWN_ERROR: unknown_error_
}

object AnonCAPABILITIESNEGOTIATIONERROR {
  @scala.inline
  def apply(
    CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error,
    CONNECTION_ERROR: connection_error,
    MEDIA_PIPELINE_ERROR: media_pipeline_error,
    TIMEOUT_ERROR: timeout_error,
    UNKNOWN_ERROR: unknown_error_
  ): AnonCAPABILITIESNEGOTIATIONERROR = {
    val __obj = js.Dynamic.literal(CAPABILITIES_NEGOTIATION_ERROR = CAPABILITIES_NEGOTIATION_ERROR.asInstanceOf[js.Any], CONNECTION_ERROR = CONNECTION_ERROR.asInstanceOf[js.Any], MEDIA_PIPELINE_ERROR = MEDIA_PIPELINE_ERROR.asInstanceOf[js.Any], TIMEOUT_ERROR = TIMEOUT_ERROR.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCAPABILITIESNEGOTIATIONERROR]
  }
}

