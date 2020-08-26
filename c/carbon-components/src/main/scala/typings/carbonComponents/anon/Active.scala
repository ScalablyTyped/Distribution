package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Active extends js.Object {
  var active: Boolean = js.native
  var classLoadingOverlay: String = js.native
  var classLoadingOverlayStop: String = js.native
  var classLoadingStop: String = js.native
  var selectorInit: String = js.native
  var selectorLoadingOverlay: String = js.native
}

object Active {
  @scala.inline
  def apply(
    active: Boolean,
    classLoadingOverlay: String,
    classLoadingOverlayStop: String,
    classLoadingStop: String,
    selectorInit: String,
    selectorLoadingOverlay: String
  ): Active = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], classLoadingOverlay = classLoadingOverlay.asInstanceOf[js.Any], classLoadingOverlayStop = classLoadingOverlayStop.asInstanceOf[js.Any], classLoadingStop = classLoadingStop.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorLoadingOverlay = selectorLoadingOverlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Active]
  }
  @scala.inline
  implicit class ActiveOps[Self <: Active] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassLoadingOverlay(value: String): Self = this.set("classLoadingOverlay", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassLoadingOverlayStop(value: String): Self = this.set("classLoadingOverlayStop", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassLoadingStop(value: String): Self = this.set("classLoadingStop", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorLoadingOverlay(value: String): Self = this.set("selectorLoadingOverlay", value.asInstanceOf[js.Any])
  }
  
}

