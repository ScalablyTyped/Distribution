package typings.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChordSubgroup extends js.Object {
  /***
    * End angle of the chord subgroup in radians
    */
  var endAngle: Double = js.native
  /**
    * The node index i
    */
  var index: Double = js.native
  /**
    * Start angle of the chord subgroup in radians
    */
  var startAngle: Double = js.native
  /**
    * The node index j
    */
  var subindex: Double = js.native
  /**
    * The flow value in matrix[i][j] from node i to node j
    */
  var value: Double = js.native
}

object ChordSubgroup {
  @scala.inline
  def apply(endAngle: Double, index: Double, startAngle: Double, subindex: Double, value: Double): ChordSubgroup = {
    val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], subindex = subindex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChordSubgroup]
  }
  @scala.inline
  implicit class ChordSubgroupOps[Self <: ChordSubgroup] (val x: Self) extends AnyVal {
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
    def setSubindex(value: Double): Self = this.set("subindex", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

