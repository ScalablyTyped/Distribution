package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElasticsearchDomainDomainEndpointOptions extends js.Object {
  
  /**
    * Whether to require that all traffic to the domain arrive over HTTPS.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  
  /**
    * The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain. Valid values:    Policy-Min-TLS-1-0-2019-07, which supports TLSv1.0 and higher    Policy-Min-TLS-1-2-2019-07, which only supports TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[NonEmptyString] = js.native
}
object AwsElasticsearchDomainDomainEndpointOptions {
  
  @scala.inline
  def apply(): AwsElasticsearchDomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainDomainEndpointOptions]
  }
  
  @scala.inline
  implicit class AwsElasticsearchDomainDomainEndpointOptionsOps[Self <: AwsElasticsearchDomainDomainEndpointOptions] (val x: Self) extends AnyVal {
    
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
    def setEnforceHTTPS(value: Boolean): Self = this.set("EnforceHTTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceHTTPS: Self = this.set("EnforceHTTPS", js.undefined)
    
    @scala.inline
    def setTLSSecurityPolicy(value: NonEmptyString): Self = this.set("TLSSecurityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTLSSecurityPolicy: Self = this.set("TLSSecurityPolicy", js.undefined)
  }
}
