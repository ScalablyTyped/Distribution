package typings.cytoscape.anon

import typings.cytoscape.mod.SingularElementReturnValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ele[T] extends StObject {
  
  /**
    * The element that corresponds to the minimum value.
    */
  var ele: SingularElementReturnValue
  
  /**
    * The minimum value found.
    */
  var value: T
}
object Ele {
  
  inline def apply[T](ele: SingularElementReturnValue, value: T): Ele[T] = {
    val __obj = js.Dynamic.literal(ele = ele.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ele[T]]
  }
  
  extension [Self <: Ele[?], T](x: Self & Ele[T]) {
    
    inline def setEle(value: SingularElementReturnValue): Self = StObject.set(x, "ele", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
