package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaFeatureRangeWalkerEntry extends StObject {
  
  var node: MediaFeatureRangeWalkerEntry
  
  var parent: MediaFeatureRangeWalkerParent
}
object NodeMediaFeatureRangeWalkerEntry {
  
  inline def apply(node: MediaFeatureRangeWalkerEntry, parent: MediaFeatureRangeWalkerParent): NodeMediaFeatureRangeWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaFeatureRangeWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaFeatureRangeWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaFeatureRangeWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaFeatureRangeWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
