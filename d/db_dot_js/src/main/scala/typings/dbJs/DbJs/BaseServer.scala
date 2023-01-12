package typings.dbJs.DbJs

import typings.std.IDBDatabase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseServer extends StObject {
  
  def close(): Unit
  
  def getIndexedDB(): IDBDatabase
}
object BaseServer {
  
  inline def apply(close: () => Unit, getIndexedDB: () => IDBDatabase): BaseServer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getIndexedDB = js.Any.fromFunction0(getIndexedDB))
    __obj.asInstanceOf[BaseServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseServer] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setGetIndexedDB(value: () => IDBDatabase): Self = StObject.set(x, "getIndexedDB", js.Any.fromFunction0(value))
  }
}
