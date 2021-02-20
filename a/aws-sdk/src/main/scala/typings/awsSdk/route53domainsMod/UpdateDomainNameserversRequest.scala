package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDomainNameserversRequest extends StObject {
  
  /**
    * The name of the domain that you want to change name servers for.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName = js.native
  
  /**
    * The authorization key for .fi domains
    */
  var FIAuthKey: js.UndefOr[typings.awsSdk.route53domainsMod.FIAuthKey] = js.native
  
  /**
    * A list of new name servers for the domain.
    */
  var Nameservers: NameserverList = js.native
}
object UpdateDomainNameserversRequest {
  
  @scala.inline
  def apply(DomainName: DomainName, Nameservers: NameserverList): UpdateDomainNameserversRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], Nameservers = Nameservers.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDomainNameserversRequest]
  }
  
  @scala.inline
  implicit class UpdateDomainNameserversRequestMutableBuilder[Self <: UpdateDomainNameserversRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIAuthKey(value: FIAuthKey): Self = StObject.set(x, "FIAuthKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIAuthKeyUndefined: Self = StObject.set(x, "FIAuthKey", js.undefined)
    
    @scala.inline
    def setNameservers(value: NameserverList): Self = StObject.set(x, "Nameservers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameserversVarargs(value: Nameserver*): Self = StObject.set(x, "Nameservers", js.Array(value :_*))
  }
}
