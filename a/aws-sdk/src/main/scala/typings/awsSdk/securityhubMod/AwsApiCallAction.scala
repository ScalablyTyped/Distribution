package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsApiCallAction extends StObject {
  
  /**
    * Identifies the resources that were affected by the API call.
    */
  var AffectedResources: js.UndefOr[FieldMap] = js.undefined
  
  /**
    * The name of the API method that was issued.
    */
  var Api: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates whether the API call originated from a remote IP address (remoteip) or from a DNS domain (domain).
    */
  var CallerType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provided if CallerType is domain. Provides information about the DNS domain that the API call originated from.
    */
  var DomainDetails: js.UndefOr[AwsApiCallActionDomainDetails] = js.undefined
  
  /**
    * An ISO8601-formatted timestamp that indicates when the API call was first observed.
    */
  var FirstSeen: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An ISO8601-formatted timestamp that indicates when the API call was most recently observed.
    */
  var LastSeen: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Provided if CallerType is remoteIp. Provides information about the remote IP address that the API call originated from.
    */
  var RemoteIpDetails: js.UndefOr[ActionRemoteIpDetails] = js.undefined
  
  /**
    * The name of the Amazon Web Services service that the API method belongs to.
    */
  var ServiceName: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsApiCallAction {
  
  inline def apply(): AwsApiCallAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsApiCallAction]
  }
  
  extension [Self <: AwsApiCallAction](x: Self) {
    
    inline def setAffectedResources(value: FieldMap): Self = StObject.set(x, "AffectedResources", value.asInstanceOf[js.Any])
    
    inline def setAffectedResourcesUndefined: Self = StObject.set(x, "AffectedResources", js.undefined)
    
    inline def setApi(value: NonEmptyString): Self = StObject.set(x, "Api", value.asInstanceOf[js.Any])
    
    inline def setApiUndefined: Self = StObject.set(x, "Api", js.undefined)
    
    inline def setCallerType(value: NonEmptyString): Self = StObject.set(x, "CallerType", value.asInstanceOf[js.Any])
    
    inline def setCallerTypeUndefined: Self = StObject.set(x, "CallerType", js.undefined)
    
    inline def setDomainDetails(value: AwsApiCallActionDomainDetails): Self = StObject.set(x, "DomainDetails", value.asInstanceOf[js.Any])
    
    inline def setDomainDetailsUndefined: Self = StObject.set(x, "DomainDetails", js.undefined)
    
    inline def setFirstSeen(value: NonEmptyString): Self = StObject.set(x, "FirstSeen", value.asInstanceOf[js.Any])
    
    inline def setFirstSeenUndefined: Self = StObject.set(x, "FirstSeen", js.undefined)
    
    inline def setLastSeen(value: NonEmptyString): Self = StObject.set(x, "LastSeen", value.asInstanceOf[js.Any])
    
    inline def setLastSeenUndefined: Self = StObject.set(x, "LastSeen", js.undefined)
    
    inline def setRemoteIpDetails(value: ActionRemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
    
    inline def setServiceName(value: NonEmptyString): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
