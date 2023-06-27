package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAndWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaConditionListMod.MediaConditionListWithAndWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaConditionListWithAndWalkerEntry
  
  var parent: MediaConditionListWithAndWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object State {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaConditionListWithAndWalkerEntry, parent: MediaConditionListWithAndWalkerParent): State[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[State[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: State[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & State[T]) extends AnyVal {
    
    inline def setNode(value: MediaConditionListWithAndWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaConditionListWithAndWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
