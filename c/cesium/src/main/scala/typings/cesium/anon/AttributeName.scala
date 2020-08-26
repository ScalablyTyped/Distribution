package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeName extends js.Object {
  var attributeName: String = js.native
  var fragmentShaderSource: js.UndefOr[String] = js.native
  var glslDatatype: js.UndefOr[String] = js.native
  var renderState: js.UndefOr[typings.cesium.mod.RenderState] = js.native
  var vertexShaderSource: js.UndefOr[String] = js.native
}

object AttributeName {
  @scala.inline
  def apply(attributeName: String): AttributeName = {
    val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeName]
  }
  @scala.inline
  implicit class AttributeNameOps[Self <: AttributeName] (val x: Self) extends AnyVal {
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
    def setAttributeName(value: String): Self = this.set("attributeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragmentShaderSource(value: String): Self = this.set("fragmentShaderSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragmentShaderSource: Self = this.set("fragmentShaderSource", js.undefined)
    @scala.inline
    def setGlslDatatype(value: String): Self = this.set("glslDatatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlslDatatype: Self = this.set("glslDatatype", js.undefined)
    @scala.inline
    def setRenderState(value: typings.cesium.mod.RenderState): Self = this.set("renderState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderState: Self = this.set("renderState", js.undefined)
    @scala.inline
    def setVertexShaderSource(value: String): Self = this.set("vertexShaderSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertexShaderSource: Self = this.set("vertexShaderSource", js.undefined)
  }
  
}

