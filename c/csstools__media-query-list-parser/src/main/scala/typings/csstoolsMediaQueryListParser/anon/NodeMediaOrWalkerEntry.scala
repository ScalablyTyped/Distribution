package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOrWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOrWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaOrWalkerEntry extends StObject {
  
  var node: MediaOrWalkerEntry
  
  var parent: MediaOrWalkerParent
}
object NodeMediaOrWalkerEntry {
  
  inline def apply(node: MediaOrWalkerEntry, parent: MediaOrWalkerParent): NodeMediaOrWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaOrWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaOrWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaOrWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaOrWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
