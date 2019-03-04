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
    cmp: js.Function2[js.Any, js.Any, scala.Double],
    delete: js.Function1[java.lang.String, js.Promise[scala.Unit]],
    open: js.Function1[OpenOptions, js.Promise[Server]]
  ): DbJsStatic = {
    val __obj = js.Dynamic.literal(cmp = cmp, delete = delete, open = open)
  
    __obj.asInstanceOf[DbJsStatic]
  }
}

