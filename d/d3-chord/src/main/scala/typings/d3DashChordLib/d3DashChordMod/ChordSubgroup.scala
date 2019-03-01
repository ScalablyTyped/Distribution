package typings
package d3DashChordLib.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChordSubgroup extends js.Object {
  /***
    * End angle of the chord subgroup in radians
    */
  var endAngle: scala.Double
  /**
    * The node index i
    */
  var index: scala.Double
  /**
    * Start angle of the chord subgroup in radians
    */
  var startAngle: scala.Double
  /**
    * The node index j
    */
  var subindex: scala.Double
  /**
    * The flow value in matrix[i][j] from node i to node j
    */
  var value: scala.Double
}

object ChordSubgroup {
  @scala.inline
  def apply(
    endAngle: scala.Double,
    index: scala.Double,
    startAngle: scala.Double,
    subindex: scala.Double,
    value: scala.Double
  ): ChordSubgroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("index")(index)
    __obj.updateDynamic("startAngle")(startAngle)
    __obj.updateDynamic("subindex")(subindex)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ChordSubgroup]
  }
}

