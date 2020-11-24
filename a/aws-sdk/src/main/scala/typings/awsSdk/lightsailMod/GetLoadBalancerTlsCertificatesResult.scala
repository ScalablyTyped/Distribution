package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetLoadBalancerTlsCertificatesResult extends js.Object {
  
  /**
    * An array of LoadBalancerTlsCertificate objects describing your SSL/TLS certificates.
    */
  var tlsCertificates: js.UndefOr[LoadBalancerTlsCertificateList] = js.native
}
object GetLoadBalancerTlsCertificatesResult {
  
  @scala.inline
  def apply(): GetLoadBalancerTlsCertificatesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLoadBalancerTlsCertificatesResult]
  }
  
  @scala.inline
  implicit class GetLoadBalancerTlsCertificatesResultOps[Self <: GetLoadBalancerTlsCertificatesResult] (val x: Self) extends AnyVal {
    
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
    def setTlsCertificatesVarargs(value: LoadBalancerTlsCertificate*): Self = this.set("tlsCertificates", js.Array(value :_*))
    
    @scala.inline
    def setTlsCertificates(value: LoadBalancerTlsCertificateList): Self = this.set("tlsCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTlsCertificates: Self = this.set("tlsCertificates", js.undefined)
  }
}
