package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaConditionWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaConditionWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaConditionWalkerEntry extends StObject {
  
  var node: MediaConditionWalkerEntry
  
  var parent: MediaConditionWalkerParent
}
object NodeMediaConditionWalkerEntry {
  
  inline def apply(node: MediaConditionWalkerEntry, parent: MediaConditionWalkerParent): NodeMediaConditionWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaConditionWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaConditionWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaConditionWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaConditionWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
