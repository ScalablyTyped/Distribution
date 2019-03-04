package typings
package chaiDashThingsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  var should: chaiDashThingsLib.ChaiNs.ArrayAssertion
}

object Array {
  @scala.inline
  def apply[T](should: chaiDashThingsLib.ChaiNs.ArrayAssertion): Array[T] = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[Array[T]]
  }
}

