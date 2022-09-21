package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set[T] extends StObject {
  
  def toJSON(): Any
}
object Set {
  
  inline def apply[T](toJSON: () => Any): Set[T] = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Set[T]]
  }
  
  extension [Self <: Set[?], T](x: Self & Set[T]) {
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
