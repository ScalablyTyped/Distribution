package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlainWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlainWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaFeaturePlainWalkerEntry extends StObject {
  
  var node: MediaFeaturePlainWalkerEntry
  
  var parent: MediaFeaturePlainWalkerParent
}
object NodeMediaFeaturePlainWalkerEntry {
  
  inline def apply(node: MediaFeaturePlainWalkerEntry, parent: MediaFeaturePlainWalkerParent): NodeMediaFeaturePlainWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaFeaturePlainWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaFeaturePlainWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaFeaturePlainWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaFeaturePlainWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
