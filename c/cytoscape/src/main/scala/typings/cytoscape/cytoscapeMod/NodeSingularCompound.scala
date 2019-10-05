package typings.cytoscape.cytoscapeMod

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
  def isChild(): Boolean
  /**
    * Get whether the node is childless (i.e. a node with no child nodes)
    * http://js.cytoscape.org/#node.isChildless
    */
  def isChildless(): Boolean
  /**
    * Get whether the node is an orphan (i.e. a node with no parent)
    * http://js.cytoscape.org/#node.isOrphan
    */
  def isOrphan(): Boolean
  /**
    * Get whether the node is a compound parent
    * (i.e. a node containing one or more child nodes)
    * http://js.cytoscape.org/#node.isParent
    */
  def isParent(): Boolean
}

object NodeSingularCompound {
  @scala.inline
  def apply(
    isChild: () => Boolean,
    isChildless: () => Boolean,
    isOrphan: () => Boolean,
    isParent: () => Boolean
  ): NodeSingularCompound = {
    val __obj = js.Dynamic.literal(isChild = js.Any.fromFunction0(isChild), isChildless = js.Any.fromFunction0(isChildless), isOrphan = js.Any.fromFunction0(isOrphan), isParent = js.Any.fromFunction0(isParent))
  
    __obj.asInstanceOf[NodeSingularCompound]
  }
}

