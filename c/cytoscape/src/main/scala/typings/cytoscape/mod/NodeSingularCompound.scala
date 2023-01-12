package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/compound-nodes
  */
trait NodeSingularCompound extends StObject {
  
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
  
  inline def apply(
    isChild: () => Boolean,
    isChildless: () => Boolean,
    isOrphan: () => Boolean,
    isParent: () => Boolean
  ): NodeSingularCompound = {
    val __obj = js.Dynamic.literal(isChild = js.Any.fromFunction0(isChild), isChildless = js.Any.fromFunction0(isChildless), isOrphan = js.Any.fromFunction0(isOrphan), isParent = js.Any.fromFunction0(isParent))
    __obj.asInstanceOf[NodeSingularCompound]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeSingularCompound] (val x: Self) extends AnyVal {
    
    inline def setIsChild(value: () => Boolean): Self = StObject.set(x, "isChild", js.Any.fromFunction0(value))
    
    inline def setIsChildless(value: () => Boolean): Self = StObject.set(x, "isChildless", js.Any.fromFunction0(value))
    
    inline def setIsOrphan(value: () => Boolean): Self = StObject.set(x, "isOrphan", js.Any.fromFunction0(value))
    
    inline def setIsParent(value: () => Boolean): Self = StObject.set(x, "isParent", js.Any.fromFunction0(value))
  }
}
