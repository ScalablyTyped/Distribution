package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestedServiceQuotaChange extends StObject {
  
  /**
    * The case Id for the service quota increase request.
    */
  var CaseId: js.UndefOr[CustomerServiceEngagementId] = js.undefined
  
  /**
    * The date and time when the service quota increase request was received and the case Id was created. 
    */
  var Created: js.UndefOr[DateTime] = js.undefined
  
  /**
    * New increased value for the service quota.
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.undefined
  
  /**
    * Identifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[typings.awsSdk.servicequotasMod.GlobalQuota] = js.undefined
  
  /**
    * The unique identifier of a requested service quota change.
    */
  var Id: js.UndefOr[RequestId] = js.undefined
  
  /**
    * The date and time of the most recent change in the service quota increase request.
    */
  var LastUpdated: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaArn] = js.undefined
  
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaCode] = js.undefined
  
  /**
    * Name of the service quota.
    */
  var QuotaName: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaName] = js.undefined
  
  /**
    * The IAM identity who submitted the service quota increase request.
    */
  var Requester: js.UndefOr[typings.awsSdk.servicequotasMod.Requester] = js.undefined
  
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceCode] = js.undefined
  
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceName] = js.undefined
  
  /**
    * State of the service quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.undefined
  
  /**
    * Specifies the unit used for the quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.undefined
}
object RequestedServiceQuotaChange {
  
  inline def apply(): RequestedServiceQuotaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestedServiceQuotaChange]
  }
  
  extension [Self <: RequestedServiceQuotaChange](x: Self) {
    
    inline def setCaseId(value: CustomerServiceEngagementId): Self = StObject.set(x, "CaseId", value.asInstanceOf[js.Any])
    
    inline def setCaseIdUndefined: Self = StObject.set(x, "CaseId", js.undefined)
    
    inline def setCreated(value: DateTime): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    inline def setDesiredValue(value: QuotaValue): Self = StObject.set(x, "DesiredValue", value.asInstanceOf[js.Any])
    
    inline def setDesiredValueUndefined: Self = StObject.set(x, "DesiredValue", js.undefined)
    
    inline def setGlobalQuota(value: GlobalQuota): Self = StObject.set(x, "GlobalQuota", value.asInstanceOf[js.Any])
    
    inline def setGlobalQuotaUndefined: Self = StObject.set(x, "GlobalQuota", js.undefined)
    
    inline def setId(value: RequestId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLastUpdated(value: DateTime): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    inline def setQuotaArn(value: QuotaArn): Self = StObject.set(x, "QuotaArn", value.asInstanceOf[js.Any])
    
    inline def setQuotaArnUndefined: Self = StObject.set(x, "QuotaArn", js.undefined)
    
    inline def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    inline def setQuotaCodeUndefined: Self = StObject.set(x, "QuotaCode", js.undefined)
    
    inline def setQuotaName(value: QuotaName): Self = StObject.set(x, "QuotaName", value.asInstanceOf[js.Any])
    
    inline def setQuotaNameUndefined: Self = StObject.set(x, "QuotaName", js.undefined)
    
    inline def setRequester(value: Requester): Self = StObject.set(x, "Requester", value.asInstanceOf[js.Any])
    
    inline def setRequesterUndefined: Self = StObject.set(x, "Requester", js.undefined)
    
    inline def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    inline def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setStatus(value: RequestStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUnit(value: QuotaUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
