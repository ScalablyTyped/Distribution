package typings.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chord_ extends js.Object {
  /**
    * Chord subgroup constituting the source of Chord
    */
  var source: ChordSubgroup
  /**
    * Chord subgroup constituting the Target of Chord
    */
  var target: ChordSubgroup
}

object Chord_ {
  @scala.inline
  def apply(source: ChordSubgroup, target: ChordSubgroup): Chord_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chord_]
  }
}

