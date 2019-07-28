package typings.chance.ChanceNs

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
    val __obj = js.Dynamic.literal(domain = domain, length = length)
  
    __obj.asInstanceOf[EmailOptions]
  }
}

