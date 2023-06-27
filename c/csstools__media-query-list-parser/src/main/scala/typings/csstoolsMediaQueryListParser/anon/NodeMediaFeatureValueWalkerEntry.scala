package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValueWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureValueMod.MediaFeatureValueWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaFeatureValueWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaFeatureValueWalkerEntry
  
  var parent: MediaFeatureValueWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaFeatureValueWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaFeatureValueWalkerEntry, parent: MediaFeatureValueWalkerParent): NodeMediaFeatureValueWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaFeatureValueWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaFeatureValueWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaFeatureValueWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaFeatureValueWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaFeatureValueWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
