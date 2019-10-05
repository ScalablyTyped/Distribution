package typings.dbDotJs.DbJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterableQuery[T] extends js.Object {
  def filter(filter: js.Function1[/* value */ T, Boolean]): FilterQuery[T] = js.native
  def filter[TValue](index: String, value: TValue): FilterQuery[T] = js.native
}

