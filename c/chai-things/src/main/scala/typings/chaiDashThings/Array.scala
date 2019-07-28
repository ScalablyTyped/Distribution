package typings.chaiDashThings

import typings.chaiDashThings.ChaiNs.ArrayAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  var should: ArrayAssertion
}

object Array {
  @scala.inline
  def apply[T](should: ArrayAssertion): Array[T] = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[Array[T]]
  }
}

