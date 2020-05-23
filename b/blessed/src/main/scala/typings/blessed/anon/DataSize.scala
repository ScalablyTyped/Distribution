package typings.blessed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSize extends js.Object {
  var boolCount: Double
  var dataSize: Double
  var extended: BoolCount
  var headerSize: Double
  var magicNumber: Boolean
  var namesSize: Double
  var numCount: Double
  var strCount: Double
  var strTableSize: Double
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
}

