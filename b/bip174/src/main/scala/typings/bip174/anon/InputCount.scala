package typings.bip174.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputCount extends js.Object {
  var inputCount: Double
  var outputCount: Double
}

object InputCount {
  @scala.inline
  def apply(inputCount: Double, outputCount: Double): InputCount = {
    val __obj = js.Dynamic.literal(inputCount = inputCount.asInstanceOf[js.Any], outputCount = outputCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputCount]
  }
}

