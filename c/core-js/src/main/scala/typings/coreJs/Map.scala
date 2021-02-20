package typings.coreJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Map[K, V] extends StObject {
  
  def toJSON(): js.Any = js.native
}
object Map {
  
  @scala.inline
  def apply[K, V](toJSON: () => js.Any): Map[K, V] = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Map[K, V]]
  }
  
  @scala.inline
  implicit class MapMutableBuilder[Self <: Map[_, _], K, V] (val x: Self with (Map[K, V])) extends AnyVal {
    
    @scala.inline
    def setToJSON(value: () => js.Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
