package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitableQuery[T] extends js.Object {
  def limit(n: js.Any, m: js.Any): ExecutableQuery[T]
}

