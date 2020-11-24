package typings.braintreeWeb.anon

import typings.braintreeWeb.braintreeWebNumbers.`1`
import typings.braintreeWeb.braintreeWebNumbers.`2`
import typings.braintreeWeb.braintreeWebStrings.`2-bootstrap3-modal`
import typings.braintreeWeb.braintreeWebStrings.`2-inline-iframe`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends js.Object {
  
  var authorization: js.UndefOr[String] = js.native
  
  var client: js.UndefOr[typings.braintreeWeb.clientMod.Client] = js.native
  
  var version: js.UndefOr[
    `1` | typings.braintreeWeb.braintreeWebStrings.`1` | `2` | typings.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
  ] = js.native
}
object Version {
  
  @scala.inline
  def apply(): Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Version]
  }
  
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    
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
    def setAuthorization(value: String): Self = this.set("authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorization: Self = this.set("authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setVersion(
      value: `1` | typings.braintreeWeb.braintreeWebStrings.`1` | `2` | typings.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
    ): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
