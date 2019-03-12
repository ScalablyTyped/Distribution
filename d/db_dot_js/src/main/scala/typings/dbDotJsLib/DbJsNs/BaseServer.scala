package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseServer extends js.Object {
  def close(): scala.Unit
  def getIndexedDB(): stdLib.IDBDatabase
}

object BaseServer {
  @scala.inline
  def apply(close: () => scala.Unit, getIndexedDB: () => stdLib.IDBDatabase): BaseServer = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), getIndexedDB = js.Any.fromFunction0(getIndexedDB))
  
    __obj.asInstanceOf[BaseServer]
  }
}

