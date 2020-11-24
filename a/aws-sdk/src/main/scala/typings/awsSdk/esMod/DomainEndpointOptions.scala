package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomainEndpointOptions extends js.Object {
  
  /**
    * Specify the fully qualified domain for your custom endpoint.
    */
  var CustomEndpoint: js.UndefOr[DomainNameFqdn] = js.native
  
  /**
    * Specify ACM certificate ARN for your custom endpoint.
    */
  var CustomEndpointCertificateArn: js.UndefOr[ARN] = js.native
  
  /**
    * Specify if custom endpoint should be enabled for the Elasticsearch domain.
    */
  var CustomEndpointEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  
  /**
    * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain.  It can be one of the following values:  Policy-Min-TLS-1-0-2019-07:  TLS security policy which supports TLSv1.0 and higher. Policy-Min-TLS-1-2-2019-07:  TLS security policy which supports only TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsSdk.esMod.TLSSecurityPolicy] = js.native
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
    def setCustomEndpoint(value: DomainNameFqdn): Self = this.set("CustomEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndpoint: Self = this.set("CustomEndpoint", js.undefined)
    
    @scala.inline
    def setCustomEndpointCertificateArn(value: ARN): Self = this.set("CustomEndpointCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndpointCertificateArn: Self = this.set("CustomEndpointCertificateArn", js.undefined)
    
    @scala.inline
    def setCustomEndpointEnabled(value: Boolean): Self = this.set("CustomEndpointEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEndpointEnabled: Self = this.set("CustomEndpointEnabled", js.undefined)
    
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
