package typings
package d3DashChordLib.d3DashChordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chord extends js.Object {
  /**
    * Chord subgroup constituting the source of Chord
    */
  var source: ChordSubgroup
  /**
    * Chord subgroup constituting the Target of Chord
    */
  var target: ChordSubgroup
}

object Chord {
  @scala.inline
  def apply(source: ChordSubgroup, target: ChordSubgroup): Chord = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(source)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Chord]
  }
}

