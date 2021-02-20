package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWorkforceRequest extends StObject {
  
  /**
    * Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using your own IdP.
    */
  var OidcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.OidcConfig] = js.native
  
  /**
    * A list of one to ten worker IP address ranges (CIDRs) that can be used to access tasks assigned to this workforce. Maximum: Ten CIDR values
    */
  var SourceIpConfig: js.UndefOr[typings.awsSdk.sagemakerMod.SourceIpConfig] = js.native
  
  /**
    * The name of the private workforce that you want to update. You can find your workforce name by using the operation.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName = js.native
}
object UpdateWorkforceRequest {
  
  @scala.inline
  def apply(WorkforceName: WorkforceName): UpdateWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkforceRequest]
  }
  
  @scala.inline
  implicit class UpdateWorkforceRequestMutableBuilder[Self <: UpdateWorkforceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOidcConfig(value: OidcConfig): Self = StObject.set(x, "OidcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOidcConfigUndefined: Self = StObject.set(x, "OidcConfig", js.undefined)
    
    @scala.inline
    def setSourceIpConfig(value: SourceIpConfig): Self = StObject.set(x, "SourceIpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpConfigUndefined: Self = StObject.set(x, "SourceIpConfig", js.undefined)
    
    @scala.inline
    def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
  }
}
