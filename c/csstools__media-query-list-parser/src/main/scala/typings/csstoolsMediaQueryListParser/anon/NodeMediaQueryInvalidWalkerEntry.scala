package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalidWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalidWalkerParent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaQueryInvalidWalkerEntry extends StObject {
  
  var node: MediaQueryInvalidWalkerEntry
  
  var parent: MediaQueryInvalidWalkerParent
}
object NodeMediaQueryInvalidWalkerEntry {
  
  inline def apply(node: MediaQueryInvalidWalkerEntry, parent: MediaQueryInvalidWalkerParent): NodeMediaQueryInvalidWalkerEntry = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaQueryInvalidWalkerEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaQueryInvalidWalkerEntry] (val x: Self) extends AnyVal {
    
    inline def setNode(value: MediaQueryInvalidWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaQueryInvalidWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
  }
}
