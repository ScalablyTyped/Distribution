package typings.bip174.srcLibInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TapTree extends StObject {
  
  var leaves: js.Array[TapLeaf]
}
object TapTree {
  
  inline def apply(leaves: js.Array[TapLeaf]): TapTree = {
    val __obj = js.Dynamic.literal(leaves = leaves.asInstanceOf[js.Any])
    __obj.asInstanceOf[TapTree]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TapTree] (val x: Self) extends AnyVal {
    
    inline def setLeaves(value: js.Array[TapLeaf]): Self = StObject.set(x, "leaves", value.asInstanceOf[js.Any])
    
    inline def setLeavesVarargs(value: TapLeaf*): Self = StObject.set(x, "leaves", js.Array(value*))
  }
}
