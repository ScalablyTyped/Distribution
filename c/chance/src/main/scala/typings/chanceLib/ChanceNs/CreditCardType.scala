package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardType extends js.Object {
  var length: scala.Double
  var name: java.lang.String
  var prefix: java.lang.String
  var short_name: java.lang.String
}

object CreditCardType {
  @scala.inline
  def apply(
    length: scala.Double,
    name: java.lang.String,
    prefix: java.lang.String,
    short_name: java.lang.String
  ): CreditCardType = {
    val __obj = js.Dynamic.literal(length = length, name = name, prefix = prefix, short_name = short_name)
  
    __obj.asInstanceOf[CreditCardType]
  }
}

