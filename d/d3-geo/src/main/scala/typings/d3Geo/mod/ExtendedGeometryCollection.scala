package typings.d3Geo.mod

import typings.d3Geo.anon.Properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedGeometryCollection[GeometryType /* <: GeoGeometryObjects */] extends js.Object {
  var bbox: js.UndefOr[js.Array[Double]] = js.native
  var crs: js.UndefOr[Properties] = js.native
  var geometries: js.Array[GeometryType] = js.native
  var `type`: String = js.native
}

object ExtendedGeometryCollection {
  @scala.inline
  def apply[/* <: typings.d3Geo.mod.GeoGeometryObjects */ GeometryType](geometries: js.Array[GeometryType], `type`: String): ExtendedGeometryCollection[GeometryType] = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedGeometryCollection[GeometryType]]
  }
  @scala.inline
  implicit class ExtendedGeometryCollectionOps[Self <: ExtendedGeometryCollection[_], /* <: typings.d3Geo.mod.GeoGeometryObjects */ GeometryType] (val x: Self with ExtendedGeometryCollection[GeometryType]) extends AnyVal {
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
    def setGeometriesVarargs(value: GeometryType*): Self = this.set("geometries", js.Array(value :_*))
    @scala.inline
    def setGeometries(value: js.Array[GeometryType]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBboxVarargs(value: Double*): Self = this.set("bbox", js.Array(value :_*))
    @scala.inline
    def setBbox(value: js.Array[Double]): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    @scala.inline
    def setCrs(value: Properties): Self = this.set("crs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrs: Self = this.set("crs", js.undefined)
  }
  
}

