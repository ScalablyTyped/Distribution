package typings.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoolCount extends js.Object {
  var boolCount: Double = js.native
  var dataSize: Double = js.native
  var headerSize: Double = js.native
  var lastStrTableOffset: Double = js.native
  var numCount: Double = js.native
  var strCount: Double = js.native
  var strTableSize: Double = js.native
}

object BoolCount {
  @scala.inline
  def apply(
    boolCount: Double,
    dataSize: Double,
    headerSize: Double,
    lastStrTableOffset: Double,
    numCount: Double,
    strCount: Double,
    strTableSize: Double
  ): BoolCount = {
    val __obj = js.Dynamic.literal(boolCount = boolCount.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], lastStrTableOffset = lastStrTableOffset.asInstanceOf[js.Any], numCount = numCount.asInstanceOf[js.Any], strCount = strCount.asInstanceOf[js.Any], strTableSize = strTableSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoolCount]
  }
  @scala.inline
  implicit class BoolCountOps[Self <: BoolCount] (val x: Self) extends AnyVal {
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
    def setBoolCount(value: Double): Self = this.set("boolCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSize(value: Double): Self = this.set("dataSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderSize(value: Double): Self = this.set("headerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastStrTableOffset(value: Double): Self = this.set("lastStrTableOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumCount(value: Double): Self = this.set("numCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrCount(value: Double): Self = this.set("strCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrTableSize(value: Double): Self = this.set("strTableSize", value.asInstanceOf[js.Any])
  }
  
}

