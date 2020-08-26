package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.`pseudo-element`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PseudoElementNode
  extends SelectorNodeType
     with BaseNode {
  @JSName("name")
  var name_PseudoElementNode: String = js.native
  var `type`: `pseudo-element` = js.native
}

object PseudoElementNode {
  @scala.inline
  def apply(name: String, `type`: `pseudo-element`): PseudoElementNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoElementNode]
  }
  @scala.inline
  implicit class PseudoElementNodeOps[Self <: PseudoElementNode] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `pseudo-element`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

