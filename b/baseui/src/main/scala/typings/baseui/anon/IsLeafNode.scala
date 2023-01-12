package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLeafNode extends StObject {
  
  @JSName("$isLeafNode")
  var $isLeafNode: js.UndefOr[Boolean] = js.undefined
}
object IsLeafNode {
  
  inline def apply(): IsLeafNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsLeafNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsLeafNode] (val x: Self) extends AnyVal {
    
    inline def set$isLeafNode(value: Boolean): Self = StObject.set(x, "$isLeafNode", value.asInstanceOf[js.Any])
    
    inline def set$isLeafNodeUndefined: Self = StObject.set(x, "$isLeafNode", js.undefined)
  }
}
