package typings.chrome.chrome.input.ime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CandidateWindowParameterProperties extends js.Object {
  /**
    * Optional.
    * Text that is shown at the bottom of the candidate window.
    */
  var auxiliaryText: js.UndefOr[String] = js.native
  /**
    * Optional.
    * True to display the auxiliary text, false to hide it.
    */
  var auxiliaryTextVisible: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * True to show the cursor, false to hide it.
    */
  var cursorVisible: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * The number of candidates to display per page.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.
    * True if the candidate window should be rendered vertical, false to make it horizontal.
    */
  var vertical: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * True to show the Candidate window, false to hide it.
    */
  var visible: js.UndefOr[Boolean] = js.native
  /**
    * Optional.
    * Where to display the candidate window.
    * @since Chrome 28.
    */
  var windowPosition: js.UndefOr[String] = js.native
}

object CandidateWindowParameterProperties {
  @scala.inline
  def apply(): CandidateWindowParameterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandidateWindowParameterProperties]
  }
  @scala.inline
  implicit class CandidateWindowParameterPropertiesOps[Self <: CandidateWindowParameterProperties] (val x: Self) extends AnyVal {
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
    def setAuxiliaryText(value: String): Self = this.set("auxiliaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryText: Self = this.set("auxiliaryText", js.undefined)
    @scala.inline
    def setAuxiliaryTextVisible(value: Boolean): Self = this.set("auxiliaryTextVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuxiliaryTextVisible: Self = this.set("auxiliaryTextVisible", js.undefined)
    @scala.inline
    def setCursorVisible(value: Boolean): Self = this.set("cursorVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorVisible: Self = this.set("cursorVisible", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setWindowPosition(value: String): Self = this.set("windowPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowPosition: Self = this.set("windowPosition", js.undefined)
  }
  
}

