package typings.datGui.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GUIParams extends js.Object {
  /**
    * Handles GUI's element placement for you.
    * @default true
    */
  var autoPlace: js.UndefOr[Boolean] = js.native
  /**
    * If true, close/open button shows on top of the GUI.
    * @default false
    */
  var closeOnTop: js.UndefOr[Boolean] = js.native
  /**
    * If true, starts closed.
    * @default false
    */
  var closed: js.UndefOr[Boolean] = js.native
  /**
    * If true, GUI is closed by the "h" keypress.
    * @default false
    */
  var hideable: js.UndefOr[Boolean] = js.native
  /**
    * JSON object representing the saved state of this GUI.
    */
  var load: js.UndefOr[js.Any] = js.native
  /**
    * The name of this GUI.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The identifier for a set of saved values.
    */
  var preset: js.UndefOr[String] = js.native
  /**
    * The width of GUI element.
    */
  var width: js.UndefOr[Double] = js.native
}

object GUIParams {
  @scala.inline
  def apply(): GUIParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GUIParams]
  }
  @scala.inline
  implicit class GUIParamsOps[Self <: GUIParams] (val x: Self) extends AnyVal {
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
    def setAutoPlace(value: Boolean): Self = this.set("autoPlace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoPlace: Self = this.set("autoPlace", js.undefined)
    @scala.inline
    def setCloseOnTop(value: Boolean): Self = this.set("closeOnTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnTop: Self = this.set("closeOnTop", js.undefined)
    @scala.inline
    def setClosed(value: Boolean): Self = this.set("closed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosed: Self = this.set("closed", js.undefined)
    @scala.inline
    def setHideable(value: Boolean): Self = this.set("hideable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideable: Self = this.set("hideable", js.undefined)
    @scala.inline
    def setLoad(value: js.Any): Self = this.set("load", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPreset(value: String): Self = this.set("preset", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreset: Self = this.set("preset", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

