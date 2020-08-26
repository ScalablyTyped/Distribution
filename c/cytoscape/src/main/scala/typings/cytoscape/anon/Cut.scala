package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import typings.cytoscape.mod.NodeCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cut extends js.Object {
  var components: CollectionReturnValue = js.native
  var cut: NodeCollection = js.native
}

object Cut {
  @scala.inline
  def apply(components: CollectionReturnValue, cut: NodeCollection): Cut = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], cut = cut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cut]
  }
  @scala.inline
  implicit class CutOps[Self <: Cut] (val x: Self) extends AnyVal {
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
    def setComponents(value: CollectionReturnValue): Self = this.set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def setCut(value: NodeCollection): Self = this.set("cut", value.asInstanceOf[js.Any])
  }
  
}

