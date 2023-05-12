package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithTypeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithTypeWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaQueryWithTypeWalkerEntry extends StObject {
  
  var node: MediaQueryWithTypeWalkerEntry
  
  var parent: MediaQueryWithTypeWalkerParent
}
object NodeMediaQueryWithTypeWalkerEntry {
  
  inline def apply(node: MediaQueryWithTypeWalkerEntry, parent: MediaQueryWithTypeWalkerParent): NodeMediaQueryWithTypeWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaQueryWithTypeWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaQueryWithTypeWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaQueryWithTypeWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaQueryWithTypeWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
