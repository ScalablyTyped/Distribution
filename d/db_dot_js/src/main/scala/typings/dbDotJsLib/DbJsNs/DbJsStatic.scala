package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbJsStatic extends js.Object {
  def cmp(key1: js.Any, key2: js.Any): scala.Double
  def delete(dbName: java.lang.String): js.Promise[scala.Unit]
  def open(options: OpenOptions): js.Promise[Server]
}

object DbJsStatic {
  @scala.inline
  def apply(
    cmp: (js.Any, js.Any) => scala.Double,
    delete: java.lang.String => js.Promise[scala.Unit],
    open: OpenOptions => js.Promise[Server]
  ): DbJsStatic = {
    val __obj = js.Dynamic.literal(cmp = js.Any.fromFunction2(cmp), delete = js.Any.fromFunction1(delete), open = js.Any.fromFunction1(open))
  
    __obj.asInstanceOf[DbJsStatic]
  }
}

