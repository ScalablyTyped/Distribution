package typings
package axonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Address extends js.Object {
  var address: java.lang.String
  var family: java.lang.String
  var port: scala.Double
  var string: java.lang.String
}

object Anon_Address {
  @scala.inline
  def apply(address: java.lang.String, family: java.lang.String, port: scala.Double, string: java.lang.String): Anon_Address = {
    val __obj = js.Dynamic.literal(address = address, family = family, port = port, string = string)
  
    __obj.asInstanceOf[Anon_Address]
  }
}

