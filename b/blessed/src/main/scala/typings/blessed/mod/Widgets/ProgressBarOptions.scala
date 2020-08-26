package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressBarOptions extends BoxOptions {
  /**
    * the amount filled (0 - 100).
    */
  var filled: js.UndefOr[Double] = js.native
  /**
    * enable key support.
    */
  @JSName("keys")
  var keys_ProgressBarOptions: js.UndefOr[Boolean] = js.native
  /**
    * enable mouse support.
    */
  @JSName("mouse")
  var mouse_ProgressBarOptions: js.UndefOr[Boolean] = js.native
  /**
    * can be `horizontal` or `vertical`.
    */
  var orientation: js.UndefOr[String] = js.native
  /**
    * the character to fill the bar with (default is space).
    */
  var pch: js.UndefOr[String] = js.native
  /**
    * same as `filled`.
    */
  var value: js.UndefOr[Double] = js.native
}

object ProgressBarOptions {
  @scala.inline
  def apply(): ProgressBarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarOptions]
  }
  @scala.inline
  implicit class ProgressBarOptionsOps[Self <: ProgressBarOptions] (val x: Self) extends AnyVal {
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
    def setFilled(value: Double): Self = this.set("filled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilled: Self = this.set("filled", js.undefined)
    @scala.inline
    def setKeys(value: Boolean): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setMouse(value: Boolean): Self = this.set("mouse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMouse: Self = this.set("mouse", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPch(value: String): Self = this.set("pch", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePch: Self = this.set("pch", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

