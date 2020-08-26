package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.updateNavigation()
@js.native
trait UpdateNavigationConfig extends js.Object {
  var stateOnly: js.UndefOr[Boolean] = js.native
  var updateTapp: js.UndefOr[Boolean] = js.native
}

object UpdateNavigationConfig {
  @scala.inline
  def apply(): UpdateNavigationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateNavigationConfig]
  }
  @scala.inline
  implicit class UpdateNavigationConfigOps[Self <: UpdateNavigationConfig] (val x: Self) extends AnyVal {
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
    def setStateOnly(value: Boolean): Self = this.set("stateOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateOnly: Self = this.set("stateOnly", js.undefined)
    @scala.inline
    def setUpdateTapp(value: Boolean): Self = this.set("updateTapp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateTapp: Self = this.set("updateTapp", js.undefined)
  }
  
}

