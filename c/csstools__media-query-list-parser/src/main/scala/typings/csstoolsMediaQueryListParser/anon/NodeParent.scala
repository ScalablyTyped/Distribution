package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOrWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithOrWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeParent[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaConditionListWithOrWalkerEntry
  
  var parent: MediaConditionListWithOrWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeParent {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaConditionListWithOrWalkerEntry, parent: MediaConditionListWithOrWalkerParent): NodeParent[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeParent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeParent[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeParent[T]) extends AnyVal {
    
    inline def setNode(value: MediaConditionListWithOrWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaConditionListWithOrWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
