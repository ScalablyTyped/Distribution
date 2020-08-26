package typings.carbonIconHelpers.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Focusable extends js.Object {
  var focusable: String = js.native
  var height: Double = js.native
  var preserveAspectRatio: String = js.native
  var role: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var viewBox: String = js.native
  var width: Double = js.native
}

object Focusable {
  @scala.inline
  def apply(focusable: String, height: Double, preserveAspectRatio: String, viewBox: String, width: Double): Focusable = {
    val __obj = js.Dynamic.literal(focusable = focusable.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], preserveAspectRatio = preserveAspectRatio.asInstanceOf[js.Any], viewBox = viewBox.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focusable]
  }
  @scala.inline
  implicit class FocusableOps[Self <: Focusable] (val x: Self) extends AnyVal {
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
    def setFocusable(value: String): Self = this.set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreserveAspectRatio(value: String): Self = this.set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewBox(value: String): Self = this.set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

