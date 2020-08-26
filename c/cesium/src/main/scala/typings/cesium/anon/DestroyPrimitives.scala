package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DestroyPrimitives extends js.Object {
  var destroyPrimitives: js.UndefOr[Boolean] = js.native
  var show: js.UndefOr[Boolean] = js.native
}

object DestroyPrimitives {
  @scala.inline
  def apply(): DestroyPrimitives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyPrimitives]
  }
  @scala.inline
  implicit class DestroyPrimitivesOps[Self <: DestroyPrimitives] (val x: Self) extends AnyVal {
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
    def setDestroyPrimitives(value: Boolean): Self = this.set("destroyPrimitives", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestroyPrimitives: Self = this.set("destroyPrimitives", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

