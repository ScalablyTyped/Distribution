package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberOfLevelZeroTilesY extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.native
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.native
  var rectangleNortheastInMeters: js.UndefOr[Cartesian2] = js.native
  var rectangleSouthwestInMeters: js.UndefOr[Cartesian2] = js.native
}

object NumberOfLevelZeroTilesY {
  @scala.inline
  def apply(): NumberOfLevelZeroTilesY = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOfLevelZeroTilesY]
  }
  @scala.inline
  implicit class NumberOfLevelZeroTilesYOps[Self <: NumberOfLevelZeroTilesY] (val x: Self) extends AnyVal {
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
    def setNumberOfLevelZeroTilesX(value: Double): Self = this.set("numberOfLevelZeroTilesX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfLevelZeroTilesX: Self = this.set("numberOfLevelZeroTilesX", js.undefined)
    @scala.inline
    def setNumberOfLevelZeroTilesY(value: Double): Self = this.set("numberOfLevelZeroTilesY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfLevelZeroTilesY: Self = this.set("numberOfLevelZeroTilesY", js.undefined)
    @scala.inline
    def setRectangleNortheastInMeters(value: Cartesian2): Self = this.set("rectangleNortheastInMeters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangleNortheastInMeters: Self = this.set("rectangleNortheastInMeters", js.undefined)
    @scala.inline
    def setRectangleSouthwestInMeters(value: Cartesian2): Self = this.set("rectangleSouthwestInMeters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangleSouthwestInMeters: Self = this.set("rectangleSouthwestInMeters", js.undefined)
  }
  
}

