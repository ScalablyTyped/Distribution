package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CountableQuery[T] extends js.Object {
  def count(): ExecutableQuery[T]
}

