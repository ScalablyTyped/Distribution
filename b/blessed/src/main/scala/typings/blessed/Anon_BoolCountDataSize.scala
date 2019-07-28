package typings.blessed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoolCountDataSize extends js.Object {
  var boolCount: Double
  var dataSize: Double
  var extended: Anon_BoolCount
  var headerSize: Double
  var magicNumber: Boolean
  var namesSize: Double
  var numCount: Double
  var strCount: Double
  var strTableSize: Double
}

object Anon_BoolCountDataSize {
  @scala.inline
  def apply(
    boolCount: Double,
    dataSize: Double,
    extended: Anon_BoolCount,
    headerSize: Double,
    magicNumber: Boolean,
    namesSize: Double,
    numCount: Double,
    strCount: Double,
    strTableSize: Double
  ): Anon_BoolCountDataSize = {
    val __obj = js.Dynamic.literal(boolCount = boolCount, dataSize = dataSize, extended = extended, headerSize = headerSize, magicNumber = magicNumber, namesSize = namesSize, numCount = numCount, strCount = strCount, strTableSize = strTableSize)
  
    __obj.asInstanceOf[Anon_BoolCountDataSize]
  }
}

