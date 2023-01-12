package typings.cytoscape.anon

import typings.cytoscape.mod.CollectionReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Both extends StObject {
  
  var both: CollectionReturnValue
  
  var left: CollectionReturnValue
  
  var right: CollectionReturnValue
}
object Both {
  
  inline def apply(both: CollectionReturnValue, left: CollectionReturnValue, right: CollectionReturnValue): Both = {
    val __obj = js.Dynamic.literal(both = both.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Both]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Both] (val x: Self) extends AnyVal {
    
    inline def setBoth(value: CollectionReturnValue): Self = StObject.set(x, "both", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: CollectionReturnValue): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: CollectionReturnValue): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
