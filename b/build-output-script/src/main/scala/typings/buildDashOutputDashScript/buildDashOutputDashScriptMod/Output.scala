package typings.buildDashOutputDashScript.buildDashOutputDashScriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  /**
    * A valid P2PKH address.
    */
  var address: String
  /**
    * Value to send to `address` in satoshis.
    */
  var value: Double
}

object Output {
  @scala.inline
  def apply(address: String, value: Double): Output = {
    val __obj = js.Dynamic.literal(address = address, value = value)
  
    __obj.asInstanceOf[Output]
  }
}

