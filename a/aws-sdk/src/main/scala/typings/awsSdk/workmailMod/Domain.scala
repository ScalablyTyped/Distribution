package typings.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Domain extends StObject {
  
  /**
    * The fully qualified domain name.
    */
  var DomainName: js.UndefOr[typings.awsSdk.workmailMod.DomainName] = js.undefined
  
  /**
    * The hosted zone ID for a domain hosted in Route 53. Required when configuring a domain hosted in Route 53.
    */
  var HostedZoneId: js.UndefOr[typings.awsSdk.workmailMod.HostedZoneId] = js.undefined
}
object Domain {
  
  @scala.inline
  def apply(): Domain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Domain]
  }
  
  @scala.inline
  implicit class DomainMutableBuilder[Self <: Domain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setHostedZoneId(value: HostedZoneId): Self = StObject.set(x, "HostedZoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostedZoneIdUndefined: Self = StObject.set(x, "HostedZoneId", js.undefined)
  }
}
