package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DistinctableQuery[T] extends js.Object {
  def distinct(): DistinctQuery[T] = js.native
  def distinct(filter: js.Function1[/* value */ T, scala.Boolean]): DistinctQuery[T] = js.native
}

