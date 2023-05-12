package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValueWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValueWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaFeatureValueWalkerEntry extends StObject {
  
  var node: MediaFeatureValueWalkerEntry
  
  var parent: MediaFeatureValueWalkerParent
}
object NodeMediaFeatureValueWalkerEntry {
  
  inline def apply(node: MediaFeatureValueWalkerEntry, parent: MediaFeatureValueWalkerParent): NodeMediaFeatureValueWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaFeatureValueWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaFeatureValueWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaFeatureValueWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaFeatureValueWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
