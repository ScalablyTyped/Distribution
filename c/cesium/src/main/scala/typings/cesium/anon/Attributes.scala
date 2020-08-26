package typings.cesium.anon

import typings.cesium.mod.GeometryAttributes
import typings.cesium.mod.PrimitiveType
import typings.std.Uint16Array
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var attributes: GeometryAttributes = js.native
  var boundingSphere: js.UndefOr[typings.cesium.mod.BoundingSphere] = js.native
  var indices: js.UndefOr[Uint16Array | Uint32Array] = js.native
  var primitiveType: js.UndefOr[PrimitiveType] = js.native
}

object Attributes {
  @scala.inline
  def apply(attributes: GeometryAttributes): Attributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
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
    def setAttributes(value: GeometryAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoundingSphere(value: typings.cesium.mod.BoundingSphere): Self = this.set("boundingSphere", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundingSphere: Self = this.set("boundingSphere", js.undefined)
    @scala.inline
    def setIndices(value: Uint16Array | Uint32Array): Self = this.set("indices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndices: Self = this.set("indices", js.undefined)
    @scala.inline
    def setPrimitiveType(value: PrimitiveType): Self = this.set("primitiveType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimitiveType: Self = this.set("primitiveType", js.undefined)
  }
  
}

