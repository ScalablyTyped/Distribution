package typings.catalog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSpecimenProps extends js.Object {
  var dark: js.UndefOr[Boolean] = js.native
  var description: js.UndefOr[String] = js.native
  var light: js.UndefOr[Boolean] = js.native
  var overlay: js.UndefOr[String] = js.native
  var plain: js.UndefOr[Boolean] = js.native
  var scale: js.UndefOr[Boolean] = js.native
  var src: String = js.native
  var title: js.UndefOr[String] = js.native
}

object ImageSpecimenProps {
  @scala.inline
  def apply(src: String): ImageSpecimenProps = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSpecimenProps]
  }
  @scala.inline
  implicit class ImageSpecimenPropsOps[Self <: ImageSpecimenProps] (val x: Self) extends AnyVal {
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
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setDark(value: Boolean): Self = this.set("dark", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLight(value: Boolean): Self = this.set("light", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    @scala.inline
    def setOverlay(value: String): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    @scala.inline
    def setScale(value: Boolean): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

