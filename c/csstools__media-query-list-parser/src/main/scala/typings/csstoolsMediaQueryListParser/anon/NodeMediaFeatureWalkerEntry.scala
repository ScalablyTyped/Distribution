package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeatureWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureMod.MediaFeatureWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaFeatureWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaFeatureWalkerEntry
  
  var parent: MediaFeatureWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaFeatureWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaFeatureWalkerEntry, parent: MediaFeatureWalkerParent): NodeMediaFeatureWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaFeatureWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaFeatureWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaFeatureWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaFeatureWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaFeatureWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
