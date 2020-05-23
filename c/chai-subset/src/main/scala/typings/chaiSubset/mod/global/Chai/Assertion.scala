package typings.chaiSubset.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Assertion extends js.Object {
  def containSubset(expected: js.Any): Assertion
}

object Assertion {
  @scala.inline
  def apply(containSubset: js.Any => Assertion): Assertion = {
    val __obj = js.Dynamic.literal(containSubset = js.Any.fromFunction1(containSubset))
    __obj.asInstanceOf[Assertion]
  }
}

