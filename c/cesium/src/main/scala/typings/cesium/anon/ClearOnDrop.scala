package typings.cesium.anon

import typings.cesium.mod.DefaultProxy
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearOnDrop extends js.Object {
  var clampToGround: js.UndefOr[Boolean] = js.native
  var clearOnDrop: js.UndefOr[Boolean] = js.native
  var dropTarget: js.UndefOr[Element | String] = js.native
  var flyToOnDrop: js.UndefOr[Boolean] = js.native
  var proxy: js.UndefOr[DefaultProxy] = js.native
}

object ClearOnDrop {
  @scala.inline
  def apply(): ClearOnDrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearOnDrop]
  }
  @scala.inline
  implicit class ClearOnDropOps[Self <: ClearOnDrop] (val x: Self) extends AnyVal {
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
    def setClampToGround(value: Boolean): Self = this.set("clampToGround", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClampToGround: Self = this.set("clampToGround", js.undefined)
    @scala.inline
    def setClearOnDrop(value: Boolean): Self = this.set("clearOnDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearOnDrop: Self = this.set("clearOnDrop", js.undefined)
    @scala.inline
    def setDropTarget(value: Element | String): Self = this.set("dropTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDropTarget: Self = this.set("dropTarget", js.undefined)
    @scala.inline
    def setFlyToOnDrop(value: Boolean): Self = this.set("flyToOnDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlyToOnDrop: Self = this.set("flyToOnDrop", js.undefined)
    @scala.inline
    def setProxy(value: DefaultProxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
  }
  
}

