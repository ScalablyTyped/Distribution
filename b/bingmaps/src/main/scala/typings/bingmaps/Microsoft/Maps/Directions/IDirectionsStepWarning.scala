package typings.bingmaps.Microsoft.Maps.Directions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDirectionsStepWarning extends js.Object {
  /** Where the warning starts. */
  var origin: String = js.native
  /** The severity of the warning. Values can be: Low Impact, Minor, Moderate, Serious or None. */
  var severity: String = js.native
  /** The warning text. */
  var text: String = js.native
  /** Where the warning ends. */
  var to: String = js.native
  /** The type of warning. A list of Warning type values can be found here: https://msdn.microsoft.com/en-us/library/hh441731.aspx */
  var warningType: String = js.native
}

object IDirectionsStepWarning {
  @scala.inline
  def apply(origin: String, severity: String, text: String, to: String, warningType: String): IDirectionsStepWarning = {
    val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], warningType = warningType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDirectionsStepWarning]
  }
  @scala.inline
  implicit class IDirectionsStepWarningOps[Self <: IDirectionsStepWarning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrigin(value: String): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: String): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningType(value: String): Self = this.set("warningType", value.asInstanceOf[js.Any])
  }
  
}

