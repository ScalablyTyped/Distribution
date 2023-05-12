package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosedWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosedWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var node: GeneralEnclosedWalkerEntry
  
  var parent: GeneralEnclosedWalkerParent
}
object Node {
  
  inline def apply(node: GeneralEnclosedWalkerEntry, parent: GeneralEnclosedWalkerParent): Node = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
    
    inline def setNode(value: GeneralEnclosedWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: GeneralEnclosedWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
