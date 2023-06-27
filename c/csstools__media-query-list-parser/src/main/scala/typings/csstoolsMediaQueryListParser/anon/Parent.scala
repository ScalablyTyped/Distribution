package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAndWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaAndMod.MediaAndWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaAndWalkerEntry
  
  var parent: MediaAndWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object Parent {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaAndWalkerEntry, parent: MediaAndWalkerParent): Parent[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parent[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & Parent[T]) extends AnyVal {
    
    inline def setNode(value: MediaAndWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaAndWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
