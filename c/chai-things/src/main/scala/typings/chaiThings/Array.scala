package typings.chaiThings

import typings.chaiThings.Chai.ArrayAssertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  var should: ArrayAssertion
}

object Array {
  @scala.inline
  def apply[T](should: ArrayAssertion): Array[T] = {
    val __obj = js.Dynamic.literal(should = should.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array[T]]
  }
}

