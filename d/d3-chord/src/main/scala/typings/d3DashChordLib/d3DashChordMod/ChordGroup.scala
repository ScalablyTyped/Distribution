package typings
package d3DashChordLib.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChordGroup extends js.Object {
  /**
    * The end angle of the chord group in radians
    */
  var endAngle: scala.Double
  /**
    * The node index i
    */
  var index: scala.Double
  /**
    * The start angle of the chord group in radians
    */
  var startAngle: scala.Double
  /**
    * The total outgoing flow value for node i
    */
  var value: scala.Double
}

object ChordGroup {
  @scala.inline
  def apply(endAngle: scala.Double, index: scala.Double, startAngle: scala.Double, value: scala.Double): ChordGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("startAngle")(startAngle)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChordGroup]
  }
}

