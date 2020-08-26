package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentsPerAttribute extends js.Object {
  var componentDatatype: js.UndefOr[typings.cesium.mod.ComponentDatatype] = js.native
  var componentsPerAttribute: js.UndefOr[Double] = js.native
  var normalize: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[js.Array[Double]] = js.native
}

object ComponentsPerAttribute {
  @scala.inline
  def apply(): ComponentsPerAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentsPerAttribute]
  }
  @scala.inline
  implicit class ComponentsPerAttributeOps[Self <: ComponentsPerAttribute] (val x: Self) extends AnyVal {
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
    def setComponentDatatype(value: typings.cesium.mod.ComponentDatatype): Self = this.set("componentDatatype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentDatatype: Self = this.set("componentDatatype", js.undefined)
    @scala.inline
    def setComponentsPerAttribute(value: Double): Self = this.set("componentsPerAttribute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentsPerAttribute: Self = this.set("componentsPerAttribute", js.undefined)
    @scala.inline
    def setNormalize(value: Boolean): Self = this.set("normalize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNormalize: Self = this.set("normalize", js.undefined)
    @scala.inline
    def setValueVarargs(value: Double*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[Double]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

