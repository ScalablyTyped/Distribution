package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkforceRequest extends StObject {
  
  /**
    * Use this parameter to update your OIDC Identity Provider (IdP) configuration for a workforce made using your own IdP.
    */
  var OidcConfig: js.UndefOr[typings.awsSdk.sagemakerMod.OidcConfig] = js.undefined
  
  /**
    * A list of one to ten worker IP address ranges (CIDRs) that can be used to access tasks assigned to this workforce. Maximum: Ten CIDR values
    */
  var SourceIpConfig: js.UndefOr[typings.awsSdk.sagemakerMod.SourceIpConfig] = js.undefined
  
  /**
    * The name of the private workforce that you want to update. You can find your workforce name by using the operation.
    */
  var WorkforceName: typings.awsSdk.sagemakerMod.WorkforceName
  
  /**
    * Use this parameter to update your VPC configuration for a workforce.
    */
  var WorkforceVpcConfig: js.UndefOr[WorkforceVpcConfigRequest] = js.undefined
}
object UpdateWorkforceRequest {
  
  inline def apply(WorkforceName: WorkforceName): UpdateWorkforceRequest = {
    val __obj = js.Dynamic.literal(WorkforceName = WorkforceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkforceRequest]
  }
  
  extension [Self <: UpdateWorkforceRequest](x: Self) {
    
    inline def setOidcConfig(value: OidcConfig): Self = StObject.set(x, "OidcConfig", value.asInstanceOf[js.Any])
    
    inline def setOidcConfigUndefined: Self = StObject.set(x, "OidcConfig", js.undefined)
    
    inline def setSourceIpConfig(value: SourceIpConfig): Self = StObject.set(x, "SourceIpConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceIpConfigUndefined: Self = StObject.set(x, "SourceIpConfig", js.undefined)
    
    inline def setWorkforceName(value: WorkforceName): Self = StObject.set(x, "WorkforceName", value.asInstanceOf[js.Any])
    
    inline def setWorkforceVpcConfig(value: WorkforceVpcConfigRequest): Self = StObject.set(x, "WorkforceVpcConfig", value.asInstanceOf[js.Any])
    
    inline def setWorkforceVpcConfigUndefined: Self = StObject.set(x, "WorkforceVpcConfig", js.undefined)
  }
}
