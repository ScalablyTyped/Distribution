package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EdgeDataDefinition
  extends ElementDataDefinition
     with /* key */ StringDictionary[js.Any] {
  /**
    * the source node id (edge comes from this node)
    */
  var source: String = js.native
  /**
    * the target node id (edge goes to this node)
    */
  var target: String = js.native
}

object EdgeDataDefinition {
  @scala.inline
  def apply(source: String, target: String): EdgeDataDefinition = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EdgeDataDefinition]
  }
  @scala.inline
  implicit class EdgeDataDefinitionOps[Self <: EdgeDataDefinition] (val x: Self) extends AnyVal {
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
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

