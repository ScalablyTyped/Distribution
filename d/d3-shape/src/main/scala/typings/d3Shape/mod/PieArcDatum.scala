package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PieArcDatum[T] extends js.Object {
  /**
    * The input datum; the corresponding element in the input data array of the Pie generator.
    */
  var data: T = js.native
  /**
    * The end angle of the arc.
    * If the pie generator was configured to be used for the arc generator,
    * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var endAngle: Double = js.native
  /**
    * The zero-based sorted index of the arc.
    */
  var index: Double = js.native
  /**
    * The pad angle of the arc. If the pie generator was configured to be used for the arc generator, than the units are in radians.
    */
  var padAngle: Double = js.native
  /**
    * The start angle of the arc.
    * If the pie generator was configured to be used for the arc generator,
    * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var startAngle: Double = js.native
  /**
    * The numeric value of the arc.
    */
  var value: Double = js.native
}

object PieArcDatum {
  @scala.inline
  def apply[T](data: T, endAngle: Double, index: Double, padAngle: Double, startAngle: Double, value: Double): PieArcDatum[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], padAngle = padAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieArcDatum[T]]
  }
  @scala.inline
  implicit class PieArcDatumOps[Self <: PieArcDatum[_], T] (val x: Self with PieArcDatum[T]) extends AnyVal {
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
    def setData(value: T): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setPadAngle(value: Double): Self = this.set("padAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

