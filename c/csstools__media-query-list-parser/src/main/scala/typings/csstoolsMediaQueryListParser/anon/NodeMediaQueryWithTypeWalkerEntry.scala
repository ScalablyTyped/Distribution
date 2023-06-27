package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithTypeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaQueryMod.MediaQueryWithTypeWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaQueryWithTypeWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaQueryWithTypeWalkerEntry
  
  var parent: MediaQueryWithTypeWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaQueryWithTypeWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaQueryWithTypeWalkerEntry, parent: MediaQueryWithTypeWalkerParent): NodeMediaQueryWithTypeWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaQueryWithTypeWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaQueryWithTypeWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaQueryWithTypeWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaQueryWithTypeWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaQueryWithTypeWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
