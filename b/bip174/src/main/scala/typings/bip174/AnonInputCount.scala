package typings.bip174

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInputCount extends js.Object {
  var inputCount: Double
  var outputCount: Double
}

object AnonInputCount {
  @scala.inline
  def apply(inputCount: Double, outputCount: Double): AnonInputCount = {
    val __obj = js.Dynamic.literal(inputCount = inputCount.asInstanceOf[js.Any], outputCount = outputCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInputCount]
  }
}

