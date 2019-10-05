package typings.cassandraDashDriver.cassandraDashDriverMod.policies.addressResolution

import typings.cassandraDashDriver.cassandraDashDriverMod.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressTranslator extends js.Object {
  def translate(address: String, port: Double, callback: Callback): Unit
}

object AddressTranslator {
  @scala.inline
  def apply(translate: (String, Double, Callback) => Unit): AddressTranslator = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction3(translate))
  
    __obj.asInstanceOf[AddressTranslator]
  }
}

