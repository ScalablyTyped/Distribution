package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDataDefinition
  extends ElementDataDefinition
     with /* key */ StringDictionary[js.Any] {
  var parent: js.UndefOr[String] = js.native
}

object NodeDataDefinition {
  @scala.inline
  def apply(): NodeDataDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDataDefinition]
  }
  @scala.inline
  implicit class NodeDataDefinitionOps[Self <: NodeDataDefinition] (val x: Self) extends AnyVal {
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
  }
  
}

