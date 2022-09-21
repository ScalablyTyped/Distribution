package typings.chevrotainTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CstNode
  extends StObject
     with CstElement {
  
  val children: CstChildrenDictionary
  
  /**
    * Will only be present if the {@link IParserConfig.nodeLocationTracking} is
    * **not** set to "none".
    * See: https://chevrotain.io/docs/guide/concrete_syntax_tree.html#cstnodes-location
    * For more details.
    */
  val location: js.UndefOr[CstNodeLocation] = js.undefined
  
  val name: String
  
  /**
    * A flag indicating the whole CSTNode has been recovered during **re-sync** error recovery.
    * This means that some of the node's children may be missing.
    * - Note that single token insertion/deletion recovery would not activate this flag.
    *   This flag would only be activated in **re-sync** recovery when the rule's
    *   grammar cannot be fully parsed.
    * - See: https://chevrotain.io/docs/tutorial/step4_fault_tolerance.html
    *   for more info on error recovery and fault tolerance.
    */
  val recoveredNode: js.UndefOr[Boolean] = js.undefined
}
object CstNode {
  
  inline def apply(children: CstChildrenDictionary, name: String): CstNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CstNode]
  }
  
  extension [Self <: CstNode](x: Self) {
    
    inline def setChildren(value: CstChildrenDictionary): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: CstNodeLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRecoveredNode(value: Boolean): Self = StObject.set(x, "recoveredNode", value.asInstanceOf[js.Any])
    
    inline def setRecoveredNodeUndefined: Self = StObject.set(x, "recoveredNode", js.undefined)
  }
}
