package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ratio
  extends CssNodeCommon
     with CssNode
     with CssNodePlain {
  var left: String = js.native
  var right: String = js.native
  @JSName("type")
  var type_Ratio: typings.cssTree.cssTreeStrings.Ratio = js.native
}

object Ratio {
  @scala.inline
  def apply(left: String, right: String, `type`: typings.cssTree.cssTreeStrings.Ratio): Ratio = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ratio]
  }
  @scala.inline
  implicit class RatioOps[Self <: Ratio] (val x: Self) extends AnyVal {
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
    def setLeft(value: String): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: String): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Ratio): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

