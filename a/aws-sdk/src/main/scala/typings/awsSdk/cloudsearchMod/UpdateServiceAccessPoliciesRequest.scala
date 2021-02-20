package typings.awsSdk.cloudsearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServiceAccessPoliciesRequest extends StObject {
  
  /**
    * The access rules you want to configure. These rules replace any existing rules. 
    */
  var AccessPolicies: PolicyDocument = js.native
  
  var DomainName: typings.awsSdk.cloudsearchMod.DomainName = js.native
}
object UpdateServiceAccessPoliciesRequest {
  
  @scala.inline
  def apply(AccessPolicies: PolicyDocument, DomainName: DomainName): UpdateServiceAccessPoliciesRequest = {
    val __obj = js.Dynamic.literal(AccessPolicies = AccessPolicies.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceAccessPoliciesRequest]
  }
  
  @scala.inline
  implicit class UpdateServiceAccessPoliciesRequestMutableBuilder[Self <: UpdateServiceAccessPoliciesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicies(value: PolicyDocument): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
