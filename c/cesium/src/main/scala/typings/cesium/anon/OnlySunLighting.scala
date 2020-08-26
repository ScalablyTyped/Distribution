package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlySunLighting extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var onlySunLighting: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
  var textureUrl: js.UndefOr[String] = js.native
}

object OnlySunLighting {
  @scala.inline
  def apply(): OnlySunLighting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnlySunLighting]
  }
  @scala.inline
  implicit class OnlySunLightingOps[Self <: OnlySunLighting] (val x: Self) extends AnyVal {
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
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setOnlySunLighting(value: Boolean): Self = this.set("onlySunLighting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlySunLighting: Self = this.set("onlySunLighting", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTextureUrl(value: String): Self = this.set("textureUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextureUrl: Self = this.set("textureUrl", js.undefined)
  }
  
}

