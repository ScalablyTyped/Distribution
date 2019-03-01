package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NextNumber extends js.Object {
  var nextNumber: scala.Double
  var nextNumberIncrement: scala.Double
  var stringPrefix: java.lang.String
}

object Anon_NextNumber {
  @scala.inline
  def apply(nextNumber: scala.Double, nextNumberIncrement: scala.Double, stringPrefix: java.lang.String): Anon_NextNumber = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nextNumber")(nextNumber)
    __obj.updateDynamic("nextNumberIncrement")(nextNumberIncrement)
    __obj.updateDynamic("stringPrefix")(stringPrefix)
    __obj.asInstanceOf[Anon_NextNumber]
  }
}

