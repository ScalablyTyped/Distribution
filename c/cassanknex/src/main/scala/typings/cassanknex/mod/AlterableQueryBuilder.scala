package typings.cassanknex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlterableQueryBuilder[T] extends StObject {
  
  def alter[K /* <: /* keyof T */ String */](column: K, newType: String): this.type
  
  def drop[K /* <: /* keyof T */ String */](columns: K*): this.type
  
  def rename[K /* <: /* keyof T */ String */](column: K, newColumn: K): this.type
}
object AlterableQueryBuilder {
  
  inline def apply[T](
    alter: (js.Any, String) => AlterableQueryBuilder[T],
    drop: /* repeated */ js.Any => AlterableQueryBuilder[T],
    rename: (js.Any, js.Any) => AlterableQueryBuilder[T]
  ): AlterableQueryBuilder[T] = {
    val __obj = js.Dynamic.literal(alter = js.Any.fromFunction2(alter), drop = js.Any.fromFunction1(drop), rename = js.Any.fromFunction2(rename))
    __obj.asInstanceOf[AlterableQueryBuilder[T]]
  }
  
  extension [Self <: AlterableQueryBuilder[?], T](x: Self & AlterableQueryBuilder[T]) {
    
    inline def setAlter(value: (js.Any, String) => AlterableQueryBuilder[T]): Self = StObject.set(x, "alter", js.Any.fromFunction2(value))
    
    inline def setDrop(value: /* repeated */ js.Any => AlterableQueryBuilder[T]): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
    
    inline def setRename(value: (js.Any, js.Any) => AlterableQueryBuilder[T]): Self = StObject.set(x, "rename", js.Any.fromFunction2(value))
  }
}
