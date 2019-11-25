package typings.d3DashChord.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChordGroup extends js.Object {
  /**
    * The end angle of the chord group in radians
    */
  var endAngle: Double
  /**
    * The node index i
    */
  var index: Double
  /**
    * The start angle of the chord group in radians
    */
  var startAngle: Double
  /**
    * The total outgoing flow value for node i
    */
  var value: Double
}

object ChordGroup {
  @scala.inline
  def apply(endAngle: Double, index: Double, startAngle: Double, value: Double): ChordGroup = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChordGroup]
  }
}

