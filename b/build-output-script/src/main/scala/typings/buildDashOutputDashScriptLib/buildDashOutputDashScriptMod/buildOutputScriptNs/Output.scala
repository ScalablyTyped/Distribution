package typings
package buildDashOutputDashScriptLib.buildDashOutputDashScriptMod.buildOutputScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * A valid P2PKH address.
    */
  var address: java.lang.String
  /**
    * Value to send to `address` in satoshis.
    */
  var value: scala.Double
}

object Output {
  @scala.inline
  def apply(address: java.lang.String, value: scala.Double): Output = {
    val __obj = js.Dynamic.literal(address = address, value = value)
  
    __obj.asInstanceOf[Output]
  }
}

