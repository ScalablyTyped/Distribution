package typings.braintreeWeb.anon

import typings.braintreeWeb.braintreeWebNumbers.`1`
import typings.braintreeWeb.braintreeWebNumbers.`2`
import typings.braintreeWeb.braintreeWebStrings.`2-bootstrap3-modal`
import typings.braintreeWeb.braintreeWebStrings.`2-inline-iframe`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends StObject {
  
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
  implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    @scala.inline
    def setClient(value: typings.braintreeWeb.clientMod.Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUndefined: Self = StObject.set(x, "client", js.undefined)
    
    @scala.inline
    def setVersion(
      value: `1` | typings.braintreeWeb.braintreeWebStrings.`1` | `2` | typings.braintreeWeb.braintreeWebStrings.`2` | `2-bootstrap3-modal` | `2-inline-iframe`
    ): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
