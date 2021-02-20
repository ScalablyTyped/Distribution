package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerTlsCertificateSummary extends StObject {
  
  /**
    * When true, the SSL/TLS certificate is attached to the Lightsail load balancer.
    */
  var isAttached: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the SSL/TLS certificate.
    */
  var name: js.UndefOr[ResourceName] = js.native
}
object LoadBalancerTlsCertificateSummary {
  
  @scala.inline
  def apply(): LoadBalancerTlsCertificateSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerTlsCertificateSummary]
  }
  
  @scala.inline
  implicit class LoadBalancerTlsCertificateSummaryMutableBuilder[Self <: LoadBalancerTlsCertificateSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAttached(value: Boolean): Self = StObject.set(x, "isAttached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAttachedUndefined: Self = StObject.set(x, "isAttached", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
