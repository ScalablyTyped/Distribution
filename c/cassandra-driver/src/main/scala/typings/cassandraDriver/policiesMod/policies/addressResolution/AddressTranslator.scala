package typings.cassandraDriver.policiesMod.policies.addressResolution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressTranslator extends js.Object {
  def translate(address: String, port: Double, callback: js.Function): Unit
}

object AddressTranslator {
  @scala.inline
  def apply(translate: (String, Double, js.Function) => Unit): AddressTranslator = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction3(translate))
  
    __obj.asInstanceOf[AddressTranslator]
  }
}

