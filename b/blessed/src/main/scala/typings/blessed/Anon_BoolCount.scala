package typings.blessed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoolCount extends js.Object {
  var boolCount: Double
  var dataSize: Double
  var headerSize: Double
  var lastStrTableOffset: Double
  var numCount: Double
  var strCount: Double
  var strTableSize: Double
}

object Anon_BoolCount {
  @scala.inline
  def apply(
    boolCount: Double,
    dataSize: Double,
    headerSize: Double,
    lastStrTableOffset: Double,
    numCount: Double,
    strCount: Double,
    strTableSize: Double
  ): Anon_BoolCount = {
    val __obj = js.Dynamic.literal(boolCount = boolCount, dataSize = dataSize, headerSize = headerSize, lastStrTableOffset = lastStrTableOffset, numCount = numCount, strCount = strCount, strTableSize = strTableSize)
  
    __obj.asInstanceOf[Anon_BoolCount]
  }
}

