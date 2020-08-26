package typings.bgiframe.BgiFrame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISettings extends js.Object {
  var conditional: Boolean = js.native
  var height: String = js.native
  var left: String = js.native
  var opacity: Boolean = js.native
  var src: String = js.native
  var top: String = js.native
  var width: String = js.native
}

object ISettings {
  @scala.inline
  def apply(
    conditional: Boolean,
    height: String,
    left: String,
    opacity: Boolean,
    src: String,
    top: String,
    width: String
  ): ISettings = {
    val __obj = js.Dynamic.literal(conditional = conditional.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISettings]
  }
  @scala.inline
  implicit class ISettingsOps[Self <: ISettings] (val x: Self) extends AnyVal {
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
    def setConditional(value: Boolean): Self = this.set("conditional", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

