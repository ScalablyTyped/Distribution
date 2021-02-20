package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDomainRequest extends StObject {
  
  /**
    * The domain ID.
    */
  var DomainId: typings.awsSdk.sagemakerMod.DomainId = js.native
  
  /**
    * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained (not automatically deleted). 
    */
  var RetentionPolicy: js.UndefOr[typings.awsSdk.sagemakerMod.RetentionPolicy] = js.native
}
object DeleteDomainRequest {
  
  @scala.inline
  def apply(DomainId: DomainId): DeleteDomainRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDomainRequest]
  }
  
  @scala.inline
  implicit class DeleteDomainRequestMutableBuilder[Self <: DeleteDomainRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPolicy(value: RetentionPolicy): Self = StObject.set(x, "RetentionPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPolicyUndefined: Self = StObject.set(x, "RetentionPolicy", js.undefined)
  }
}
