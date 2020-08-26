package typings.cssSelectorTokenizer.mod

import typings.cssSelectorTokenizer.cssSelectorTokenizerStrings.item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemNode
  extends ValueNodeType
     with BaseNode {
  @JSName("name")
  var name_ItemNode: String = js.native
  var `type`: item = js.native
}

object ItemNode {
  @scala.inline
  def apply(name: String, `type`: item): ItemNode = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemNode]
  }
  @scala.inline
  implicit class ItemNodeOps[Self <: ItemNode] (val x: Self) extends AnyVal {
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
    def setType(value: item): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

