package typings.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chord_ extends js.Object {
  /**
    * Chord subgroup constituting the source of Chord
    */
  var source: ChordSubgroup = js.native
  /**
    * Chord subgroup constituting the Target of Chord
    */
  var target: ChordSubgroup = js.native
}

object Chord_ {
  @scala.inline
  def apply(source: ChordSubgroup, target: ChordSubgroup): Chord_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chord_]
  }
  @scala.inline
  implicit class Chord_Ops[Self <: Chord_] (val x: Self) extends AnyVal {
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
    def setSource(value: ChordSubgroup): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: ChordSubgroup): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

