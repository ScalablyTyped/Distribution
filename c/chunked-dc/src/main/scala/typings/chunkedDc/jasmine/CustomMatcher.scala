package typings.chunkedDc.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomMatcher extends js.Object {
  def compare(actual: js.Any, expected: js.Any): CustomMatcherResult = js.native
  def compare[T](actual: T, expected: T): CustomMatcherResult = js.native
}

