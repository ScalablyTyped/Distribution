package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaInParensMod.MediaInParensWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaInParensWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaInParensWalkerEntry
  
  var parent: MediaInParensWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaInParensWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaInParensWalkerEntry, parent: MediaInParensWalkerParent): NodeMediaInParensWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaInParensWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaInParensWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaInParensWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaInParensWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaInParensWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
