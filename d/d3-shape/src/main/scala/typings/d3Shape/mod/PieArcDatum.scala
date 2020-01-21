package typings.d3Shape.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieArcDatum[T] extends js.Object {
  /**
    * The input datum; the corresponding element in the input data array of the Pie generator.
    */
  var data: T
  /**
    * The end angle of the arc.
    * If the pie generator was configured to be used for the arc generator,
    * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var endAngle: Double
  /**
    * The zero-based sorted index of the arc.
    */
  var index: Double
  /**
    * The pad angle of the arc. If the pie generator was configured to be used for the arc generator, than the units are in radians.
    */
  var padAngle: Double
  /**
    * The start angle of the arc.
    * If the pie generator was configured to be used for the arc generator,
    * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var startAngle: Double
  /**
    * The numeric value of the arc.
    */
  var value: Double
}

object PieArcDatum {
  @scala.inline
  def apply[T](data: T, endAngle: Double, index: Double, padAngle: Double, startAngle: Double, value: Double): PieArcDatum[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], padAngle = padAngle.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PieArcDatum[T]]
  }
}

