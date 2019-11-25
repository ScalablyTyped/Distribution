package typings.d3DashChord.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChordSubgroup extends js.Object {
  /***
    * End angle of the chord subgroup in radians
    */
  var endAngle: Double
  /**
    * The node index i
    */
  var index: Double
  /**
    * Start angle of the chord subgroup in radians
    */
  var startAngle: Double
  /**
    * The node index j
    */
  var subindex: Double
  /**
    * The flow value in matrix[i][j] from node i to node j
    */
  var value: Double
}

object ChordSubgroup {
  @scala.inline
  def apply(endAngle: Double, index: Double, startAngle: Double, subindex: Double, value: Double): ChordSubgroup = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], subindex = subindex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChordSubgroup]
  }
}

