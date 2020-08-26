package typings.charsetDetector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * input statics
  */
@js.native
trait InputStats extends js.Object {
  /**
    * count of bytes, eg. `byteStats[32] === 17` means there are 17 bytes with value of `32` in the input
    */
  val byteStats: js.Array[Double] = js.native
  /**
    * whether input contains bytes larger that 0x7F (127)
    */
  val c1Bytes: Boolean = js.native
}

object InputStats {
  @scala.inline
  def apply(byteStats: js.Array[Double], c1Bytes: Boolean): InputStats = {
    val __obj = js.Dynamic.literal(byteStats = byteStats.asInstanceOf[js.Any], c1Bytes = c1Bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputStats]
  }
  @scala.inline
  implicit class InputStatsOps[Self <: InputStats] (val x: Self) extends AnyVal {
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
    def setByteStatsVarargs(value: Double*): Self = this.set("byteStats", js.Array(value :_*))
    @scala.inline
    def setByteStats(value: js.Array[Double]): Self = this.set("byteStats", value.asInstanceOf[js.Any])
    @scala.inline
    def setC1Bytes(value: Boolean): Self = this.set("c1Bytes", value.asInstanceOf[js.Any])
  }
  
}

