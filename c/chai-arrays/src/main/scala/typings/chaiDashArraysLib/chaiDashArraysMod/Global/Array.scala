package typings
package chaiDashArraysLib.chaiDashArraysMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Array[T] extends js.Object {
  var should: chaiDashArraysLib.chaiDashArraysMod.Global.ChaiNs.Assertion
}

object Array {
  @scala.inline
  def apply[T](should: chaiDashArraysLib.chaiDashArraysMod.Global.ChaiNs.Assertion): Array[T] = {
    val __obj = js.Dynamic.literal(should = should)
  
    __obj.asInstanceOf[Array[T]]
  }
}

