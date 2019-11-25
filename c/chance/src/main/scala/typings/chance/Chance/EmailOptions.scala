package typings.chance.Chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions extends js.Object {
  var domain: String
  var length: Double
}

object EmailOptions {
  @scala.inline
  def apply(domain: String, length: Double): EmailOptions = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmailOptions]
  }
}

