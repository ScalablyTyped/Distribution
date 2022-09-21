package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiCallAction extends StObject {
  
  /**
    * The details of the Amazon Web Services account that made the API call. This field identifies the resources that were affected by this API call.
    */
  var AffectedResources: js.UndefOr[typings.awsSdk.guarddutyMod.AffectedResources] = js.undefined
  
  /**
    * The Amazon Web Services API name.
    */
  var Api: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services API caller type.
    */
  var CallerType: js.UndefOr[String] = js.undefined
  
  /**
    * The domain information for the Amazon Web Services API call.
    */
  var DomainDetails: js.UndefOr[typings.awsSdk.guarddutyMod.DomainDetails] = js.undefined
  
  /**
    * The error code of the failed Amazon Web Services API action.
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The details of the Amazon Web Services account that made the API call. This field appears if the call was made from outside your account.
    */
  var RemoteAccountDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteAccountDetails] = js.undefined
  
  /**
    * The remote IP information of the connection that initiated the Amazon Web Services API call.
    */
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.guarddutyMod.RemoteIpDetails] = js.undefined
  
  /**
    * The Amazon Web Services service name whose API was invoked.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  
  /**
    * The agent through which the API request was made.
    */
  var UserAgent: js.UndefOr[String] = js.undefined
}
object AwsApiCallAction {
  
  inline def apply(): AwsApiCallAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiCallAction]
  }
  
  extension [Self <: AwsApiCallAction](x: Self) {
    
    inline def setAffectedResources(value: AffectedResources): Self = StObject.set(x, "AffectedResources", value.asInstanceOf[js.Any])
    
    inline def setAffectedResourcesUndefined: Self = StObject.set(x, "AffectedResources", js.undefined)
    
    inline def setApi(value: String): Self = StObject.set(x, "Api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "Api", js.undefined)
    
    inline def setCallerType(value: String): Self = StObject.set(x, "CallerType", value.asInstanceOf[js.Any])
    
    inline def setCallerTypeUndefined: Self = StObject.set(x, "CallerType", js.undefined)
    
    inline def setDomainDetails(value: DomainDetails): Self = StObject.set(x, "DomainDetails", value.asInstanceOf[js.Any])
    
    inline def setDomainDetailsUndefined: Self = StObject.set(x, "DomainDetails", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setRemoteAccountDetails(value: RemoteAccountDetails): Self = StObject.set(x, "RemoteAccountDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccountDetailsUndefined: Self = StObject.set(x, "RemoteAccountDetails", js.undefined)
    
    inline def setRemoteIpDetails(value: RemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
    
    inline def setServiceName(value: String): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "UserAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "UserAgent", js.undefined)
  }
}
