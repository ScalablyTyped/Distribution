package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutTypeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutTypeWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaQueryWithoutTypeWalkerEntry extends StObject {
  
  var node: MediaQueryWithoutTypeWalkerEntry
  
  var parent: MediaQueryWithoutTypeWalkerParent
}
object NodeMediaQueryWithoutTypeWalkerEntry {
  
  inline def apply(node: MediaQueryWithoutTypeWalkerEntry, parent: MediaQueryWithoutTypeWalkerParent): NodeMediaQueryWithoutTypeWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaQueryWithoutTypeWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaQueryWithoutTypeWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaQueryWithoutTypeWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaQueryWithoutTypeWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
