package typings.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChordGroup extends js.Object {
  /**
    * The end angle of the chord group in radians
    */
  var endAngle: Double = js.native
  /**
    * The node index i
    */
  var index: Double = js.native
  /**
    * The start angle of the chord group in radians
    */
  var startAngle: Double = js.native
  /**
    * The total outgoing flow value for node i
    */
  var value: Double = js.native
}

object ChordGroup {
  @scala.inline
  def apply(endAngle: Double, index: Double, startAngle: Double, value: Double): ChordGroup = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordGroup]
  }
  @scala.inline
  implicit class ChordGroupOps[Self <: ChordGroup] (val x: Self) extends AnyVal {
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
    def setEndAngle(value: Double): Self = this.set("endAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartAngle(value: Double): Self = this.set("startAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

