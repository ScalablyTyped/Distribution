package typings
package blessedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoolCountDataSize extends js.Object {
  var boolCount: scala.Double
  var dataSize: scala.Double
  var extended: Anon_BoolCount
  var headerSize: scala.Double
  var magicNumber: scala.Boolean
  var namesSize: scala.Double
  var numCount: scala.Double
  var strCount: scala.Double
  var strTableSize: scala.Double
}

object Anon_BoolCountDataSize {
  @scala.inline
  def apply(
    boolCount: scala.Double,
    dataSize: scala.Double,
    extended: Anon_BoolCount,
    headerSize: scala.Double,
    magicNumber: scala.Boolean,
    namesSize: scala.Double,
    numCount: scala.Double,
    strCount: scala.Double,
    strTableSize: scala.Double
  ): Anon_BoolCountDataSize = {
    val __obj = js.Dynamic.literal(boolCount = boolCount, dataSize = dataSize, extended = extended, headerSize = headerSize, magicNumber = magicNumber, namesSize = namesSize, numCount = numCount, strCount = strCount, strTableSize = strTableSize)
  
    __obj.asInstanceOf[Anon_BoolCountDataSize]
  }
}

