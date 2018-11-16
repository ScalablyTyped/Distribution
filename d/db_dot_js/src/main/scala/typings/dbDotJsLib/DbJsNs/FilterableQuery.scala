package typings
package dbDotJsLib.DbJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableQuery[T] extends js.Object {
  def filter(filter: js.Function1[/* value */ T, scala.Boolean]): FilterQuery[T] = js.native
  def filter[TValue](index: java.lang.String, value: TValue): FilterQuery[T] = js.native
}

