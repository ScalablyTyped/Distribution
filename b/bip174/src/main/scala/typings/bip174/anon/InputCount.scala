package typings.bip174.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputCount extends js.Object {
  var inputCount: Double = js.native
  var outputCount: Double = js.native
}

object InputCount {
  @scala.inline
  def apply(inputCount: Double, outputCount: Double): InputCount = {
    val __obj = js.Dynamic.literal(inputCount = inputCount.asInstanceOf[js.Any], outputCount = outputCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputCount]
  }
  @scala.inline
  implicit class InputCountOps[Self <: InputCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInputCount(value: Double): Self = this.set("inputCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutputCount(value: Double): Self = this.set("outputCount", value.asInstanceOf[js.Any])
  }
  
}

