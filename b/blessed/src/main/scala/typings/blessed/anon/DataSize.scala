package typings.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSize extends js.Object {
  var boolCount: Double = js.native
  var dataSize: Double = js.native
  var extended: BoolCount = js.native
  var headerSize: Double = js.native
  var magicNumber: Boolean = js.native
  var namesSize: Double = js.native
  var numCount: Double = js.native
  var strCount: Double = js.native
  var strTableSize: Double = js.native
}

object DataSize {
  @scala.inline
  def apply(
    boolCount: Double,
    dataSize: Double,
    extended: BoolCount,
    headerSize: Double,
    magicNumber: Boolean,
    namesSize: Double,
    numCount: Double,
    strCount: Double,
    strTableSize: Double
  ): DataSize = {
    val __obj = js.Dynamic.literal(boolCount = boolCount.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], extended = extended.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], magicNumber = magicNumber.asInstanceOf[js.Any], namesSize = namesSize.asInstanceOf[js.Any], numCount = numCount.asInstanceOf[js.Any], strCount = strCount.asInstanceOf[js.Any], strTableSize = strTableSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSize]
  }
  @scala.inline
  implicit class DataSizeOps[Self <: DataSize] (val x: Self) extends AnyVal {
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
    def setExtended(value: BoolCount): Self = this.set("extended", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaderSize(value: Double): Self = this.set("headerSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMagicNumber(value: Boolean): Self = this.set("magicNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamesSize(value: Double): Self = this.set("namesSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumCount(value: Double): Self = this.set("numCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrCount(value: Double): Self = this.set("strCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setStrTableSize(value: Double): Self = this.set("strTableSize", value.asInstanceOf[js.Any])
  }
  
}

