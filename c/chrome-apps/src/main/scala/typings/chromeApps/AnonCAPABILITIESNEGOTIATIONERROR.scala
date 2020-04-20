package typings.chromeApps

import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typings.chromeApps.chromeAppsStrings.connection_error_
import typings.chromeApps.chromeAppsStrings.media_pipeline_error_
import typings.chromeApps.chromeAppsStrings.timeout_error_
import typings.chromeApps.chromeAppsStrings.unknown_error_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCAPABILITIESNEGOTIATIONERROR extends js.Object {
  var CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_
  var CONNECTION_ERROR: connection_error_
  var MEDIA_PIPELINE_ERROR: media_pipeline_error_
  var TIMEOUT_ERROR: timeout_error_
  var UNKNOWN_ERROR: unknown_error_
}

object AnonCAPABILITIESNEGOTIATIONERROR {
  @scala.inline
  def apply(
    CAPABILITIES_NEGOTIATION_ERROR: capabilities_negotiation_error_,
    CONNECTION_ERROR: connection_error_,
    MEDIA_PIPELINE_ERROR: media_pipeline_error_,
    TIMEOUT_ERROR: timeout_error_,
    UNKNOWN_ERROR: unknown_error_
  ): AnonCAPABILITIESNEGOTIATIONERROR = {
    val __obj = js.Dynamic.literal(CAPABILITIES_NEGOTIATION_ERROR = CAPABILITIES_NEGOTIATION_ERROR.asInstanceOf[js.Any], CONNECTION_ERROR = CONNECTION_ERROR.asInstanceOf[js.Any], MEDIA_PIPELINE_ERROR = MEDIA_PIPELINE_ERROR.asInstanceOf[js.Any], TIMEOUT_ERROR = TIMEOUT_ERROR.asInstanceOf[js.Any], UNKNOWN_ERROR = UNKNOWN_ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCAPABILITIESNEGOTIATIONERROR]
  }
}

