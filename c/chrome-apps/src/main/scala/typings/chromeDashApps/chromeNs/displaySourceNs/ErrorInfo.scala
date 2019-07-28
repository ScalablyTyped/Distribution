package typings.chromeDashApps.chromeNs.displaySourceNs

import typings.chromeDashApps.Anon_CAPABILITIESNEGOTIATIONERROR
import typings.chromeDashApps.chromeDashAppsStrings.capabilities_negotiation_error
import typings.chromeDashApps.chromeDashAppsStrings.connection_error
import typings.chromeDashApps.chromeDashAppsStrings.media_pipeline_error
import typings.chromeDashApps.chromeDashAppsStrings.timeout_error
import typings.chromeDashApps.chromeDashAppsStrings.unknown_error
import typings.chromeDashApps.chromeNs.ToStringLiteral
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  /** @see ErrorType */
  var `type`: ToStringLiteral[
    Anon_CAPABILITIESNEGOTIATIONERROR, 
    String, 
    Exclude[
      String, 
      unknown_error | capabilities_negotiation_error | timeout_error | media_pipeline_error | connection_error
    ]
  ]
}

object ErrorInfo {
  @scala.inline
  def apply(
    `type`: ToStringLiteral[
      Anon_CAPABILITIESNEGOTIATIONERROR, 
      String, 
      Exclude[
        String, 
        unknown_error | capabilities_negotiation_error | timeout_error | media_pipeline_error | connection_error
      ]
    ],
    description: String = null
  ): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[ErrorInfo]
  }
}

