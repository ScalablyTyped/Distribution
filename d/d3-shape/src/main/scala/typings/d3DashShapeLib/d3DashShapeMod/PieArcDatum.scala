package typings
package d3DashShapeLib.d3DashShapeMod

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
  var endAngle: scala.Double
  /**
    * The zero-based sorted index of the arc.
    */
  var index: scala.Double
  /**
    * The pad angle of the arc. If the pie generator was configured to be used for the arc generator, than the units are in radians.
    */
  var padAngle: scala.Double
  /**
    * The start angle of the arc.
    * If the pie generator was configured to be used for the arc generator,
    * then the units are in radians with 0 at -y (12 o’clock) and positive angles proceeding clockwise.
    */
  var startAngle: scala.Double
  /**
    * The numeric value of the arc.
    */
  var value: scala.Double
}

object PieArcDatum {
  @scala.inline
  def apply[T](
    data: T,
    endAngle: scala.Double,
    index: scala.Double,
    padAngle: scala.Double,
    startAngle: scala.Double,
    value: scala.Double
  ): PieArcDatum[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], endAngle = endAngle, index = index, padAngle = padAngle, startAngle = startAngle, value = value)
  
    __obj.asInstanceOf[PieArcDatum[T]]
  }
}

