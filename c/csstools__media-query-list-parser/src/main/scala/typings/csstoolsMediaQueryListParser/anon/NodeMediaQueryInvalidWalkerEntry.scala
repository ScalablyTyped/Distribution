package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalidWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryInvalidWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaQueryInvalidWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaQueryInvalidWalkerEntry
  
  var parent: MediaQueryInvalidWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaQueryInvalidWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaQueryInvalidWalkerEntry, parent: MediaQueryInvalidWalkerParent): NodeMediaQueryInvalidWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaQueryInvalidWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaQueryInvalidWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaQueryInvalidWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaQueryInvalidWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaQueryInvalidWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
