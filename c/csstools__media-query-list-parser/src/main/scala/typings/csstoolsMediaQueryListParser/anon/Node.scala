package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosedWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesGeneralEnclosedMod.GeneralEnclosedWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: GeneralEnclosedWalkerEntry
  
  var parent: GeneralEnclosedWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object Node {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: GeneralEnclosedWalkerEntry, parent: GeneralEnclosedWalkerParent): Node[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Node[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Node[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & Node[T]) extends AnyVal {
    
    inline def setNode(value: GeneralEnclosedWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: GeneralEnclosedWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
