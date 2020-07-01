package typings.charsetDetector.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * input statics
  */
trait InputStats extends js.Object {
  /**
    * count of bytes, eg. `byteStats[32] === 17` means there are 17 bytes with value of `32` in the input
    */
  val byteStats: js.Array[Double]
  /**
    * whether input contains bytes larger that 0x7F (127)
    */
  val c1Bytes: Boolean
}

object InputStats {
  @scala.inline
  def apply(byteStats: js.Array[Double], c1Bytes: Boolean): InputStats = {
    val __obj = js.Dynamic.literal(byteStats = byteStats.asInstanceOf[js.Any], c1Bytes = c1Bytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputStats]
  }
}

