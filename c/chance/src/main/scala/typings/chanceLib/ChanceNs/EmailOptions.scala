package typings
package chanceLib.ChanceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions extends js.Object {
  var domain: java.lang.String
  var length: scala.Double
}

object EmailOptions {
  @scala.inline
  def apply(domain: java.lang.String, length: scala.Double): EmailOptions = {
    val __obj = js.Dynamic.literal(domain = domain, length = length)
  
    __obj.asInstanceOf[EmailOptions]
  }
}

