package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dimension
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  @JSName("type")
  var type_Dimension: typings.cssTree.cssTreeStrings.Dimension = js.native
  var unit: String = js.native
  var value: String = js.native
}

object Dimension {
  @scala.inline
  def apply(`type`: typings.cssTree.cssTreeStrings.Dimension, unit: String, value: String): Dimension = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dimension]
  }
  @scala.inline
  implicit class DimensionOps[Self <: Dimension] (val x: Self) extends AnyVal {
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
    def setType(value: typings.cssTree.cssTreeStrings.Dimension): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

