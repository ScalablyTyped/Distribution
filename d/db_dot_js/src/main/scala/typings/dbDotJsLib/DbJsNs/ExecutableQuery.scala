package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Query API
trait ExecutableQuery[T] extends js.Object {
  def execute(): js.Promise[js.Array[T]]
}

