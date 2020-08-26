package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberOfLevelZeroTilesX extends js.Object {
  var ellipsoid: js.UndefOr[typings.cesium.mod.Ellipsoid] = js.native
  var numberOfLevelZeroTilesX: js.UndefOr[Double] = js.native
  var numberOfLevelZeroTilesY: js.UndefOr[Double] = js.native
  var rectangle: js.UndefOr[typings.cesium.mod.Rectangle] = js.native
}

object NumberOfLevelZeroTilesX {
  @scala.inline
  def apply(): NumberOfLevelZeroTilesX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberOfLevelZeroTilesX]
  }
  @scala.inline
  implicit class NumberOfLevelZeroTilesXOps[Self <: NumberOfLevelZeroTilesX] (val x: Self) extends AnyVal {
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
    def setRectangle(value: typings.cesium.mod.Rectangle): Self = this.set("rectangle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangle: Self = this.set("rectangle", js.undefined)
  }
  
}

