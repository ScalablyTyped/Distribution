package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * http://js.cytoscape.org/#collection/compound-nodes
  */
trait NodeSingularCompound extends js.Object {
  /**
    * Get whether the node is a compound child (i.e. contained within a node)
    *  http://js.cytoscape.org/#node.isChild
    */
  def isChild(): scala.Boolean
  /**
    * Get whether the node is childless (i.e. a node with no child nodes)
    * http://js.cytoscape.org/#node.isChildless
    */
  def isChildless(): scala.Boolean
  /**
    * Get whether the node is an orphan (i.e. a node with no parent)
    * http://js.cytoscape.org/#node.isOrphan
    */
  def isOrphan(): scala.Boolean
  /**
    * Get whether the node is a compound parent
    * (i.e. a node containing one or more child nodes)
    * http://js.cytoscape.org/#node.isParent
    */
  def isParent(): scala.Boolean
}

object NodeSingularCompound {
  @scala.inline
  def apply(
    isChild: js.Function0[scala.Boolean],
    isChildless: js.Function0[scala.Boolean],
    isOrphan: js.Function0[scala.Boolean],
    isParent: js.Function0[scala.Boolean]
  ): NodeSingularCompound = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isChild")(isChild)
    __obj.updateDynamic("isChildless")(isChildless)
    __obj.updateDynamic("isOrphan")(isOrphan)
    __obj.updateDynamic("isParent")(isParent)
    __obj.asInstanceOf[NodeSingularCompound]
  }
}

