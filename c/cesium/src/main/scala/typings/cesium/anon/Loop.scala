package typings.cesium.anon

import typings.cesium.mod.Cartesian3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loop extends js.Object {
  var arcType: js.UndefOr[typings.cesium.mod.ArcType] = js.native
  var granularity: js.UndefOr[Double] = js.native
  var loop: js.UndefOr[Boolean] = js.native
  var positions: js.Array[Cartesian3] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Loop {
  @scala.inline
  def apply(positions: js.Array[Cartesian3]): Loop = {
    val __obj = js.Dynamic.literal(positions = positions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loop]
  }
  @scala.inline
  implicit class LoopOps[Self <: Loop] (val x: Self) extends AnyVal {
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
    def setPositionsVarargs(value: Cartesian3*): Self = this.set("positions", js.Array(value :_*))
    @scala.inline
    def setPositions(value: js.Array[Cartesian3]): Self = this.set("positions", value.asInstanceOf[js.Any])
    @scala.inline
    def setArcType(value: typings.cesium.mod.ArcType): Self = this.set("arcType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArcType: Self = this.set("arcType", js.undefined)
    @scala.inline
    def setGranularity(value: Double): Self = this.set("granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("granularity", js.undefined)
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

