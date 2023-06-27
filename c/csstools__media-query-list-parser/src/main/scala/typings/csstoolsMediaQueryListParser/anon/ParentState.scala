package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaConditionWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionMod.MediaConditionWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentState[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaConditionWalkerEntry
  
  var parent: MediaConditionWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object ParentState {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaConditionWalkerEntry, parent: MediaConditionWalkerParent): ParentState[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentState[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentState[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & ParentState[T]) extends AnyVal {
    
    inline def setNode(value: MediaConditionWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaConditionWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
