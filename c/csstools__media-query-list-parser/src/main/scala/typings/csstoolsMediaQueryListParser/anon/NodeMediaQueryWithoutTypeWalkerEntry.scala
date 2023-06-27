package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutTypeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithoutTypeWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaQueryWithoutTypeWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaQueryWithoutTypeWalkerEntry
  
  var parent: MediaQueryWithoutTypeWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaQueryWithoutTypeWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaQueryWithoutTypeWalkerEntry, parent: MediaQueryWithoutTypeWalkerParent): NodeMediaQueryWithoutTypeWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaQueryWithoutTypeWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaQueryWithoutTypeWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaQueryWithoutTypeWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaQueryWithoutTypeWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaQueryWithoutTypeWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
