package typings.cassandraDriver.policiesMod.policies.addressResolution

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressTranslator extends js.Object {
  
  def translate(address: String, port: Double, callback: js.Function): Unit = js.native
}
object AddressTranslator {
  
  @scala.inline
  def apply(translate: (String, Double, js.Function) => Unit): AddressTranslator = {
    val __obj = js.Dynamic.literal(translate = js.Any.fromFunction3(translate))
    __obj.asInstanceOf[AddressTranslator]
  }
  
  @scala.inline
  implicit class AddressTranslatorOps[Self <: AddressTranslator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTranslate(value: (String, Double, js.Function) => Unit): Self = this.set("translate", js.Any.fromFunction3(value))
  }
}
