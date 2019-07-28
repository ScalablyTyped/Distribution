package typings.bingmaps.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsStepWarning extends js.Object {
  /** Where the warning starts. */
  var origin: String
  /** The severity of the warning. Values can be: Low Impact, Minor, Moderate, Serious or None. */
  var severity: String
  /** The warning text. */
  var text: String
  /** Where the warning ends. */
  var to: String
  /** The type of warning. A list of Warning type values can be found here: https://msdn.microsoft.com/en-us/library/hh441731.aspx */
  var warningType: String
}

object IDirectionsStepWarning {
  @scala.inline
  def apply(origin: String, severity: String, text: String, to: String, warningType: String): IDirectionsStepWarning = {
    val __obj = js.Dynamic.literal(origin = origin, severity = severity, text = text, to = to, warningType = warningType)
  
    __obj.asInstanceOf[IDirectionsStepWarning]
  }
}

