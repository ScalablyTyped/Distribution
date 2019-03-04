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
  def apply(close: js.Function0[scala.Unit], getIndexedDB: js.Function0[stdLib.IDBDatabase]): BaseServer = {
    val __obj = js.Dynamic.literal(close = close, getIndexedDB = getIndexedDB)
  
    __obj.asInstanceOf[BaseServer]
  }
}

