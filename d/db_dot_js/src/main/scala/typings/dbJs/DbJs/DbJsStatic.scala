package typings.dbJs.DbJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DbJsStatic extends StObject {
  
  def cmp(key1: js.Any, key2: js.Any): Double = js.native
  
  def delete(dbName: String): js.Promise[Unit] = js.native
  
  def open(options: OpenOptions): js.Promise[Server] = js.native
}
object DbJsStatic {
  
  @scala.inline
  def apply(
    cmp: (js.Any, js.Any) => Double,
    delete: String => js.Promise[Unit],
    open: OpenOptions => js.Promise[Server]
  ): DbJsStatic = {
    val __obj = js.Dynamic.literal(cmp = js.Any.fromFunction2(cmp), delete = js.Any.fromFunction1(delete), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[DbJsStatic]
  }
  
  @scala.inline
  implicit class DbJsStaticMutableBuilder[Self <: DbJsStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCmp(value: (js.Any, js.Any) => Double): Self = StObject.set(x, "cmp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDelete(value: String => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOpen(value: OpenOptions => js.Promise[Server]): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
