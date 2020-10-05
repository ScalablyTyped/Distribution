package typings.d3Force.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimulationNodeDatum extends js.Object {
  /**
    * Node’s fixed x-position (if position was fixed)
    */
  var fx: js.UndefOr[Double | Null] = js.native
  /**
    * Node’s fixed y-position (if position was fixed)
    */
  var fy: js.UndefOr[Double | Null] = js.native
  /**
    * Node’s zero-based index into nodes array. This property is set during the initialization process of a simulation.
    */
  var index: js.UndefOr[Double] = js.native
  /**
    * Node’s current x-velocity
    */
  var vx: js.UndefOr[Double] = js.native
  /**
    * Node’s current y-velocity
    */
  var vy: js.UndefOr[Double] = js.native
  /**
    * Node’s current x-position
    */
  var x: js.UndefOr[Double] = js.native
  /**
    * Node’s current y-position
    */
  var y: js.UndefOr[Double] = js.native
}

object SimulationNodeDatum {
  @scala.inline
  def apply(): SimulationNodeDatum = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationNodeDatum]
  }
  @scala.inline
  implicit class SimulationNodeDatumOps[Self <: SimulationNodeDatum] (val x: Self) extends AnyVal {
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
    def setFx(value: Double): Self = this.set("fx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFx: Self = this.set("fx", js.undefined)
    @scala.inline
    def setFxNull: Self = this.set("fx", null)
    @scala.inline
    def setFy(value: Double): Self = this.set("fy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFy: Self = this.set("fy", js.undefined)
    @scala.inline
    def setFyNull: Self = this.set("fy", null)
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    @scala.inline
    def setVx(value: Double): Self = this.set("vx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVx: Self = this.set("vx", js.undefined)
    @scala.inline
    def setVy(value: Double): Self = this.set("vy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVy: Self = this.set("vy", js.undefined)
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
  
}

