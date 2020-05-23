package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NextNumber extends js.Object {
  var nextNumber: Double
  var nextNumberIncrement: Double
  var stringPrefix: String
}

object NextNumber {
  @scala.inline
  def apply(nextNumber: Double, nextNumberIncrement: Double, stringPrefix: String): NextNumber = {
    val __obj = js.Dynamic.literal(nextNumber = nextNumber.asInstanceOf[js.Any], nextNumberIncrement = nextNumberIncrement.asInstanceOf[js.Any], stringPrefix = stringPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[NextNumber]
  }
}

