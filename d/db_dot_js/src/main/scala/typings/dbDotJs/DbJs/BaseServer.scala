package typings.dbDotJs.DbJs

import typings.std.IDBDatabase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseServer extends js.Object {
  def close(): Unit
  def getIndexedDB(): IDBDatabase
}

object BaseServer {
  @scala.inline
  def apply(close: () => Unit, getIndexedDB: () => IDBDatabase): BaseServer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getIndexedDB = js.Any.fromFunction0(getIndexedDB))
  
    __obj.asInstanceOf[BaseServer]
  }
}

