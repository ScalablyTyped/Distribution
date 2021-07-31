package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Map[K, V] extends StObject {
  
  def toJSON(): js.Any
}
object Map {
  
  @scala.inline
  def apply[K, V](toJSON: () => js.Any): Map[K, V] = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Map[K, V]]
  }
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map[?, ?], K, V] (val x: Self & (Map[K, V])) extends AnyVal {
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
