package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOrWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaOrMod.MediaOrWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaOrWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaOrWalkerEntry
  
  var parent: MediaOrWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaOrWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaOrWalkerEntry, parent: MediaOrWalkerParent): NodeMediaOrWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaOrWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaOrWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaOrWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaOrWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaOrWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
