package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreditCardType extends js.Object {
  var length: Double
  var name: String
  var prefix: String
  var short_name: String
}

object CreditCardType {
  @scala.inline
  def apply(length: Double, name: String, prefix: String, short_name: String): CreditCardType = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], short_name = short_name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreditCardType]
  }
}

