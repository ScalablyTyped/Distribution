package typings
package bingmapsLib.MicrosoftNs.MapsNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDirectionsStepWarning extends js.Object {
  /** Where the warning starts. */
  var origin: java.lang.String
  /** The severity of the warning. Values can be: Low Impact, Minor, Moderate, Serious or None. */
  var severity: java.lang.String
  /** The warning text. */
  var text: java.lang.String
  /** Where the warning ends. */
  var to: java.lang.String
  /** The type of warning. A list of Warning type values can be found here: https://msdn.microsoft.com/en-us/library/hh441731.aspx */
  var warningType: java.lang.String
}

object IDirectionsStepWarning {
  @scala.inline
  def apply(
    origin: java.lang.String,
    severity: java.lang.String,
    text: java.lang.String,
    to: java.lang.String,
    warningType: java.lang.String
  ): IDirectionsStepWarning = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("origin")(origin)
    __obj.updateDynamic("severity")(severity)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("warningType")(warningType)
    __obj.asInstanceOf[IDirectionsStepWarning]
  }
}

