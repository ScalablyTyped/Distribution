package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberOfVerticalLines extends js.Object {
  var center: Cartesian3 = js.native
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var extrudedHeight: js.UndefOr[Double] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var numberOfVerticalLines: js.UndefOr[Double] = js.native
  var rotation: js.UndefOr[Double] = js.native
  var semiMajorAxis: Double = js.native
  var semiMinorAxis: Double = js.native
}

object NumberOfVerticalLines {
  @scala.inline
  def apply(center: Cartesian3, semiMajorAxis: Double, semiMinorAxis: Double): NumberOfVerticalLines = {
    val __obj = js.Dynamic.literal(center = center.asInstanceOf[js.Any], semiMajorAxis = semiMajorAxis.asInstanceOf[js.Any], semiMinorAxis = semiMinorAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOfVerticalLines]
  }
  @scala.inline
  implicit class NumberOfVerticalLinesOps[Self <: NumberOfVerticalLines] (val x: Self) extends AnyVal {
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
    def setCenter(value: Cartesian3): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemiMajorAxis(value: Double): Self = this.set("semiMajorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def setSemiMinorAxis(value: Double): Self = this.set("semiMinorAxis", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipsoid(value: typings.cesium.mod.Ellipsoid): Self = this.set("ellipsoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsoid: Self = this.set("ellipsoid", js.undefined)
    @scala.inline
    def setExtrudedHeight(value: Double): Self = this.set("extrudedHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtrudedHeight: Self = this.set("extrudedHeight", js.undefined)
    @scala.inline
    def setGranularity(value: Double): Self = this.set("granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setNumberOfVerticalLines(value: Double): Self = this.set("numberOfVerticalLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfVerticalLines: Self = this.set("numberOfVerticalLines", js.undefined)
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
  }
  
}

