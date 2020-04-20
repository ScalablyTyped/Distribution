package typings.chromeApps.chrome.displaySource

import typings.chromeApps.AnonCAPABILITIESNEGOTIATIONERROR
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chromeAppsStrings.CAPABILITIES_NEGOTIATION_ERROR
import typings.chromeApps.chromeAppsStrings.CONNECTION_ERROR
import typings.chromeApps.chromeAppsStrings.MEDIA_PIPELINE_ERROR
import typings.chromeApps.chromeAppsStrings.TIMEOUT_ERROR
import typings.chromeApps.chromeAppsStrings.UNKNOWN_ERROR
import typings.chromeApps.chromeAppsStrings.capabilities_negotiation_error_
import typings.chromeApps.chromeAppsStrings.connection_error_
import typings.chromeApps.chromeAppsStrings.media_pipeline_error_
import typings.chromeApps.chromeAppsStrings.timeout_error_
import typings.chromeApps.chromeAppsStrings.unknown_error_
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorInfo extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  /** @see ErrorType */
  var `type`: ToStringLiteral[
    AnonCAPABILITIESNEGOTIATIONERROR, 
    CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
    Exclude[
      CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
      unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
    ]
  ]
}

object ErrorInfo {
  @scala.inline
  def apply(
    `type`: ToStringLiteral[
      AnonCAPABILITIESNEGOTIATIONERROR, 
      CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
      Exclude[
        CONNECTION_ERROR | CAPABILITIES_NEGOTIATION_ERROR | MEDIA_PIPELINE_ERROR | TIMEOUT_ERROR | UNKNOWN_ERROR, 
        unknown_error_ | media_pipeline_error_ | connection_error_ | capabilities_negotiation_error_ | timeout_error_
      ]
    ],
    description: String = null
  ): ErrorInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
}

