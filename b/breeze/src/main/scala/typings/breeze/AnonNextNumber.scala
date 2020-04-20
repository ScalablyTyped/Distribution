package typings.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNextNumber extends js.Object {
  var nextNumber: Double
  var nextNumberIncrement: Double
  var stringPrefix: String
}

object AnonNextNumber {
  @scala.inline
  def apply(nextNumber: Double, nextNumberIncrement: Double, stringPrefix: String): AnonNextNumber = {
    val __obj = js.Dynamic.literal(nextNumber = nextNumber.asInstanceOf[js.Any], nextNumberIncrement = nextNumberIncrement.asInstanceOf[js.Any], stringPrefix = stringPrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNextNumber]
  }
}

