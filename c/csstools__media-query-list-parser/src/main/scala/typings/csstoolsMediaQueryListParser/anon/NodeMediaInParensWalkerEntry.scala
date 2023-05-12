package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaInParensWalkerEntry extends StObject {
  
  var node: MediaInParensWalkerEntry
  
  var parent: MediaInParensWalkerParent
}
object NodeMediaInParensWalkerEntry {
  
  inline def apply(node: MediaInParensWalkerEntry, parent: MediaInParensWalkerParent): NodeMediaInParensWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaInParensWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaInParensWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaInParensWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaInParensWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
