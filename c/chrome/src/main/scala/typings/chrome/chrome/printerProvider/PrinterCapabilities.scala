package typings.chrome.chrome.printerProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrinterCapabilities extends js.Object {
  /** Device capabilities in CDD format. */
  var capabilities: js.Any = js.native
}

object PrinterCapabilities {
  @scala.inline
  def apply(capabilities: js.Any): PrinterCapabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrinterCapabilities]
  }
  @scala.inline
  implicit class PrinterCapabilitiesOps[Self <: PrinterCapabilities] (val x: Self) extends AnyVal {
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
    def setCapabilities(value: js.Any): Self = this.set("capabilities", value.asInstanceOf[js.Any])
  }
  
}

