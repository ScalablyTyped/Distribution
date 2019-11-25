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
    val __obj = js.Dynamic.literal(boolCount = boolCount.asInstanceOf[js.Any], dataSize = dataSize.asInstanceOf[js.Any], extended = extended.asInstanceOf[js.Any], headerSize = headerSize.asInstanceOf[js.Any], magicNumber = magicNumber.asInstanceOf[js.Any], namesSize = namesSize.asInstanceOf[js.Any], numCount = numCount.asInstanceOf[js.Any], strCount = strCount.asInstanceOf[js.Any], strTableSize = strTableSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BoolCountDataSize]
  }
}

