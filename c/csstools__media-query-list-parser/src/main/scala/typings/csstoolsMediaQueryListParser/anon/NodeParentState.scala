package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlainWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeaturePlainMod.MediaFeaturePlainWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeParentState[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaFeaturePlainWalkerEntry
  
  var parent: MediaFeaturePlainWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeParentState {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaFeaturePlainWalkerEntry, parent: MediaFeaturePlainWalkerParent): NodeParentState[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParentState[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeParentState[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeParentState[T]) extends AnyVal {
    
    inline def setNode(value: MediaFeaturePlainWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaFeaturePlainWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
