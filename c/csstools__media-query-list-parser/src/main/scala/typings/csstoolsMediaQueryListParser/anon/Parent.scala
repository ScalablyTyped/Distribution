package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAndWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAndWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  var node: MediaAndWalkerEntry
  
  var parent: MediaAndWalkerParent
}
object Parent {
  
  inline def apply(node: MediaAndWalkerEntry, parent: MediaAndWalkerParent): Parent = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaAndWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeVarargs(value: ComponentValue*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setParent(value: MediaAndWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
