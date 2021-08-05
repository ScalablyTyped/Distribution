package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyableQuery[T] extends StObject {
  
  def keys(): KeysQuery[T]
}
object KeyableQuery {
  
  inline def apply[T](keys: () => KeysQuery[T]): KeyableQuery[T] = {
    val __obj = js.Dynamic.literal(keys = js.Any.fromFunction0(keys))
    __obj.asInstanceOf[KeyableQuery[T]]
  }
  
  extension [Self <: KeyableQuery[?], T](x: Self & KeyableQuery[T]) {
    
    inline def setKeys(value: () => KeysQuery[T]): Self = StObject.set(x, "keys", js.Any.fromFunction0(value))
  }
}
