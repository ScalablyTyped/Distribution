package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CAPABILITIESNEGOTIATIONERROR extends js.Object {
  var CAPABILITIES_NEGOTIATION_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.capabilities_negotiation_error
  var CONNECTION_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.connection_error
  var MEDIA_PIPELINE_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.media_pipeline_error
  var TIMEOUT_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.timeout_error
  var UNKNOWN_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.unknown_error
}

object Anon_CAPABILITIESNEGOTIATIONERROR {
  @scala.inline
  def apply(
    CAPABILITIES_NEGOTIATION_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.capabilities_negotiation_error,
    CONNECTION_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.connection_error,
    MEDIA_PIPELINE_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.media_pipeline_error,
    TIMEOUT_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.timeout_error,
    UNKNOWN_ERROR: chromeDashAppsLib.chromeDashAppsLibStrings.unknown_error
  ): Anon_CAPABILITIESNEGOTIATIONERROR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CAPABILITIES_NEGOTIATION_ERROR")(CAPABILITIES_NEGOTIATION_ERROR)
    __obj.updateDynamic("CONNECTION_ERROR")(CONNECTION_ERROR)
    __obj.updateDynamic("MEDIA_PIPELINE_ERROR")(MEDIA_PIPELINE_ERROR)
    __obj.updateDynamic("TIMEOUT_ERROR")(TIMEOUT_ERROR)
    __obj.updateDynamic("UNKNOWN_ERROR")(UNKNOWN_ERROR)
    __obj.asInstanceOf[Anon_CAPABILITIESNEGOTIATIONERROR]
  }
}

