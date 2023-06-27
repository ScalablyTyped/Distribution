package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeWalkerEntry
import typings.csstoolsMediaQueryListParser.distNodesMediaFeatureRangeMod.MediaFeatureRangeWalkerParent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeMediaFeatureRangeWalkerEntry[T /* <: Record[java.lang.String, Any] */] extends StObject {
  
  var node: MediaFeatureRangeWalkerEntry
  
  var parent: MediaFeatureRangeWalkerParent
  
  var state: js.UndefOr[T] = js.undefined
}
object NodeMediaFeatureRangeWalkerEntry {
  
  inline def apply[T /* <: Record[java.lang.String, Any] */](node: MediaFeatureRangeWalkerEntry, parent: MediaFeatureRangeWalkerParent): NodeMediaFeatureRangeWalkerEntry[T] = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeMediaFeatureRangeWalkerEntry[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeMediaFeatureRangeWalkerEntry[?], T /* <: Record[java.lang.String, Any] */] (val x: Self & NodeMediaFeatureRangeWalkerEntry[T]) extends AnyVal {
    
    inline def setNode(value: MediaFeatureRangeWalkerEntry): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setParent(value: MediaFeatureRangeWalkerParent): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setState(value: T): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
