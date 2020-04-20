package typings.blessed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoolCount extends js.Object {
  var boolCount: Double
  var dataSize: Double
  var headerSize: Double
  var lastStrTableOffset: Double
  var numCount: Double
  var strCount: Double
  var strTableSize: Double
}

object AnonBoolCount {
  @scala.inline
  def apply(
    boolCount: Double,
    dataSize: Double,
    headerSize: Double,
    lastStrTableOffset: Double,
    numCount: Double,
    strCount: Double,
    strTableSize: Double
  ): AnonBoolCount = {
    val __obj = js.Dynamic.literal(boolCount = boolCount.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], lastStrTableOffset = lastStrTableOffset.asInstanceOf[js.Any], numCount = numCount.asInstanceOf[js.Any], strCount = strCount.asInstanceOf[js.Any], strTableSize = strTableSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolCount]
  }
}

