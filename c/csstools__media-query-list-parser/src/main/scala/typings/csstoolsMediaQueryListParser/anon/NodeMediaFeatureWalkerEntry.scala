package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeatureWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeatureWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaFeatureWalkerEntry extends StObject {
  
  var node: MediaFeatureWalkerEntry
  
  var parent: MediaFeatureWalkerParent
}
object NodeMediaFeatureWalkerEntry {
  
  inline def apply(node: MediaFeatureWalkerEntry, parent: MediaFeatureWalkerParent): NodeMediaFeatureWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaFeatureWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaFeatureWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaFeatureWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaFeatureWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
