package typings.dbJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbJsStatic extends js.Object {
  def cmp(key1: js.Any, key2: js.Any): Double
  def delete(dbName: String): js.Promise[Unit]
  def open(options: OpenOptions): js.Promise[Server]
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
}

