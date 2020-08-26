package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentShaderSource extends js.Object {
  var fragmentShaderSource: js.UndefOr[String] = js.native
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.native
  var translucent: js.UndefOr[Boolean] = js.native
  var vertexShaderSource: js.UndefOr[String] = js.native
}

object FragmentShaderSource {
  @scala.inline
  def apply(): FragmentShaderSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FragmentShaderSource]
  }
  @scala.inline
  implicit class FragmentShaderSourceOps[Self <: FragmentShaderSource] (val x: Self) extends AnyVal {
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
    def setFragmentShaderSource(value: String): Self = this.set("fragmentShaderSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentShaderSource: Self = this.set("fragmentShaderSource", js.undefined)
    @scala.inline
    def setRenderState(value: typings.cesium.mod.RenderState): Self = this.set("renderState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderState: Self = this.set("renderState", js.undefined)
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
    @scala.inline
    def setVertexShaderSource(value: String): Self = this.set("vertexShaderSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexShaderSource: Self = this.set("vertexShaderSource", js.undefined)
  }
  
}

