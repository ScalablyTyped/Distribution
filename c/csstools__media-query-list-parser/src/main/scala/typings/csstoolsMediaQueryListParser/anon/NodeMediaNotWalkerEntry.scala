package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNotWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNotWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaNotWalkerEntry extends StObject {
  
  var node: MediaNotWalkerEntry
  
  var parent: MediaNotWalkerParent
}
object NodeMediaNotWalkerEntry {
  
  inline def apply(node: MediaNotWalkerEntry, parent: MediaNotWalkerParent): NodeMediaNotWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaNotWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaNotWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaNotWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaNotWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
