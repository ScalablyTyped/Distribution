package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nth
  extends CssNodeCommon
     with CssNode {
  var nth: AnPlusB | Identifier = js.native
  var selector: SelectorList | Null = js.native
  @JSName("type")
  var type_Nth: typings.cssTree.cssTreeStrings.Nth = js.native
}

object Nth {
  @scala.inline
  def apply(nth: AnPlusB | Identifier, `type`: typings.cssTree.cssTreeStrings.Nth): Nth = {
    val __obj = js.Dynamic.literal(nth = nth.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nth]
  }
  @scala.inline
  implicit class NthOps[Self <: Nth] (val x: Self) extends AnyVal {
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
    def setNth(value: AnPlusB | Identifier): Self = this.set("nth", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.cssTree.cssTreeStrings.Nth): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelector(value: SelectorList): Self = this.set("selector", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorNull: Self = this.set("selector", null)
  }
  
}

