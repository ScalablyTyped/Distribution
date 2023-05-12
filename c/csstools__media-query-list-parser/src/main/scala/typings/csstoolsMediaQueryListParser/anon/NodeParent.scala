package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAndWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAndWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeParent extends StObject {
  
  var node: MediaConditionListWithAndWalkerEntry
  
  var parent: MediaConditionListWithAndWalkerParent
}
object NodeParent {
  
  inline def apply(node: MediaConditionListWithAndWalkerEntry, parent: MediaConditionListWithAndWalkerParent): NodeParent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeParent] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaConditionListWithAndWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaConditionListWithAndWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
