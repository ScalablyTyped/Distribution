package typings.cssTree.mod

import typings.cssTree.cssTreeStrings.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DSNodeGroup
  extends StObject
     with DSNode
     with DSNodeMultiplied {
  
  var combinator: DSNodeCombinator
  
  var disallowEmpty: Boolean
  
  var explicit: Boolean
  
  var terms: js.Array[DSNode]
  
  var `type`: Group
}
object DSNodeGroup {
  
  inline def apply(combinator: DSNodeCombinator, disallowEmpty: Boolean, explicit: Boolean, terms: js.Array[DSNode]): DSNodeGroup = {
    val __obj = js.Dynamic.literal(combinator = combinator.asInstanceOf[js.Any], disallowEmpty = disallowEmpty.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Group")
    __obj.asInstanceOf[DSNodeGroup]
  }
  
  extension [Self <: DSNodeGroup](x: Self) {
    
    inline def setCombinator(value: DSNodeCombinator): Self = StObject.set(x, "combinator", value.asInstanceOf[js.Any])
    
    inline def setDisallowEmpty(value: Boolean): Self = StObject.set(x, "disallowEmpty", value.asInstanceOf[js.Any])
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: js.Array[DSNode]): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setTermsVarargs(value: DSNode*): Self = StObject.set(x, "terms", js.Array(value*))
    
    inline def setType(value: Group): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
