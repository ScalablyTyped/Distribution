package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DbJsStatic extends StObject {
  
  def cmp(key1: Any, key2: Any): Double
  
  def delete(dbName: String): js.Promise[Unit]
  
  def open(options: OpenOptions): js.Promise[Server]
}
object DbJsStatic {
  
  inline def apply(
    cmp: (Any, Any) => Double,
    delete: String => js.Promise[Unit],
    open: OpenOptions => js.Promise[Server]
  ): DbJsStatic = {
    val __obj = js.Dynamic.literal(cmp = js.Any.fromFunction2(cmp), delete = js.Any.fromFunction1(delete), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[DbJsStatic]
  }
  
  extension [Self <: DbJsStatic](x: Self) {
    
    inline def setCmp(value: (Any, Any) => Double): Self = StObject.set(x, "cmp", js.Any.fromFunction2(value))
    
    inline def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    inline def setOpen(value: OpenOptions => js.Promise[Server]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
