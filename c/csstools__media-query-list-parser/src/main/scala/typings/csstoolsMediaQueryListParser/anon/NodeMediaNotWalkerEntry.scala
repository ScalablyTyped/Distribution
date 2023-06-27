package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNotWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaNotMod.MediaNotWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaNotWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaNotWalkerEntry
  
  var parent: MediaNotWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaNotWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaNotWalkerEntry, parent: MediaNotWalkerParent): NodeMediaNotWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaNotWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaNotWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaNotWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaNotWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaNotWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
