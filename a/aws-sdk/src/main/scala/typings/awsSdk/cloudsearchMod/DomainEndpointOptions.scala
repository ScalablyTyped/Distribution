package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainEndpointOptions extends js.Object {
  
  /**
    * Whether the domain is HTTPS only enabled.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  
  /**
    * The minimum required TLS version
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsSdk.cloudsearchMod.TLSSecurityPolicy] = js.native
}
object DomainEndpointOptions {
  
  @scala.inline
  def apply(): DomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEndpointOptions]
  }
  
  @scala.inline
  implicit class DomainEndpointOptionsOps[Self <: DomainEndpointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnforceHTTPS(value: Boolean): Self = this.set("EnforceHTTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceHTTPS: Self = this.set("EnforceHTTPS", js.undefined)
    
    @scala.inline
    def setTLSSecurityPolicy(value: TLSSecurityPolicy): Self = this.set("TLSSecurityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTLSSecurityPolicy: Self = this.set("TLSSecurityPolicy", js.undefined)
  }
}
