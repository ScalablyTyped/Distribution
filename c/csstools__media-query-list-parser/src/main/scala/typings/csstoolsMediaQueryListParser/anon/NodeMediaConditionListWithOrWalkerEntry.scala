package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOrWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOrWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaConditionListWithOrWalkerEntry extends StObject {
  
  var node: MediaConditionListWithOrWalkerEntry
  
  var parent: MediaConditionListWithOrWalkerParent
}
object NodeMediaConditionListWithOrWalkerEntry {
  
  inline def apply(node: MediaConditionListWithOrWalkerEntry, parent: MediaConditionListWithOrWalkerParent): NodeMediaConditionListWithOrWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaConditionListWithOrWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaConditionListWithOrWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaConditionListWithOrWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaConditionListWithOrWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
