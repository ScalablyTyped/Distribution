package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DbJsStatic extends js.Object {
  def cmp(key1: js.Any, key2: js.Any): scala.Double
  def delete(dbName: java.lang.String): stdLib.Promise[scala.Unit]
  def open(options: OpenOptions): stdLib.Promise[Server]
}

