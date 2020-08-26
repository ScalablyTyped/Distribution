package typings.cesium.anon

import typings.cesium.mod.Matrix4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelMatrix extends js.Object {
  var blendOption: js.UndefOr[typings.cesium.mod.BlendOption] = js.native
  var debugShowBoundingVolume: js.UndefOr[Boolean] = js.native
  var modelMatrix: js.UndefOr[Matrix4] = js.native
}

object ModelMatrix {
  @scala.inline
  def apply(): ModelMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelMatrix]
  }
  @scala.inline
  implicit class ModelMatrixOps[Self <: ModelMatrix] (val x: Self) extends AnyVal {
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
    def setBlendOption(value: typings.cesium.mod.BlendOption): Self = this.set("blendOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendOption: Self = this.set("blendOption", js.undefined)
    @scala.inline
    def setDebugShowBoundingVolume(value: Boolean): Self = this.set("debugShowBoundingVolume", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebugShowBoundingVolume: Self = this.set("debugShowBoundingVolume", js.undefined)
    @scala.inline
    def setModelMatrix(value: Matrix4): Self = this.set("modelMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModelMatrix: Self = this.set("modelMatrix", js.undefined)
  }
  
}

