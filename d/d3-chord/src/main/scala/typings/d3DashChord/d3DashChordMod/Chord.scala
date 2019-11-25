package typings.d3DashChord.d3DashChordMod

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
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Chord]
  }
}

@JSImport("d3-chord", "chord")
@js.native
object chord extends js.Object {
  def apply(): ChordLayout = js.native
}

