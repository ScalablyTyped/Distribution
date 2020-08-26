package typings.backboneMarionette.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegionViewOptions extends js.Object {
  /**
    * DEPRECATED: If you replace the current view with a new view by calling show, by
    * default it will automatically destroy the previous view. You can
    * prevent this behavior by setting this option to true.
    */
  var preventDestroy: js.UndefOr[Boolean] = js.native
}

object RegionViewOptions {
  @scala.inline
  def apply(): RegionViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegionViewOptions]
  }
  @scala.inline
  implicit class RegionViewOptionsOps[Self <: RegionViewOptions] (val x: Self) extends AnyVal {
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
    def setPreventDestroy(value: Boolean): Self = this.set("preventDestroy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDestroy: Self = this.set("preventDestroy", js.undefined)
  }
  
}

