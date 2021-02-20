package typings.awsSdk.servicequotasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestedServiceQuotaChange extends StObject {
  
  /**
    * The case Id for the service quota increase request.
    */
  var CaseId: js.UndefOr[CustomerServiceEngagementId] = js.native
  
  /**
    * The date and time when the service quota increase request was received and the case Id was created. 
    */
  var Created: js.UndefOr[DateTime] = js.native
  
  /**
    * New increased value for the service quota.
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.native
  
  /**
    * Identifies if the quota is global.
    */
  var GlobalQuota: js.UndefOr[typings.awsSdk.servicequotasMod.GlobalQuota] = js.native
  
  /**
    * The unique identifier of a requested service quota change.
    */
  var Id: js.UndefOr[RequestId] = js.native
  
  /**
    * The date and time of the most recent change in the service quota increase request.
    */
  var LastUpdated: js.UndefOr[DateTime] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the service quota.
    */
  var QuotaArn: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaArn] = js.native
  
  /**
    * Specifies the service quota that you want to use.
    */
  var QuotaCode: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaCode] = js.native
  
  /**
    * Name of the service quota.
    */
  var QuotaName: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaName] = js.native
  
  /**
    * The IAM identity who submitted the service quota increase request.
    */
  var Requester: js.UndefOr[typings.awsSdk.servicequotasMod.Requester] = js.native
  
  /**
    * Specifies the service that you want to use.
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceCode] = js.native
  
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceName] = js.native
  
  /**
    * State of the service quota increase request.
    */
  var Status: js.UndefOr[RequestStatus] = js.native
  
  /**
    * Specifies the unit used for the quota.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
}
object RequestedServiceQuotaChange {
  
  @scala.inline
  def apply(): RequestedServiceQuotaChange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestedServiceQuotaChange]
  }
  
  @scala.inline
  implicit class RequestedServiceQuotaChangeMutableBuilder[Self <: RequestedServiceQuotaChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseId(value: CustomerServiceEngagementId): Self = StObject.set(x, "CaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseIdUndefined: Self = StObject.set(x, "CaseId", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = StObject.set(x, "Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "Created", js.undefined)
    
    @scala.inline
    def setDesiredValue(value: QuotaValue): Self = StObject.set(x, "DesiredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredValueUndefined: Self = StObject.set(x, "DesiredValue", js.undefined)
    
    @scala.inline
    def setGlobalQuota(value: GlobalQuota): Self = StObject.set(x, "GlobalQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalQuotaUndefined: Self = StObject.set(x, "GlobalQuota", js.undefined)
    
    @scala.inline
    def setId(value: RequestId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: DateTime): Self = StObject.set(x, "LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedUndefined: Self = StObject.set(x, "LastUpdated", js.undefined)
    
    @scala.inline
    def setQuotaArn(value: QuotaArn): Self = StObject.set(x, "QuotaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaArnUndefined: Self = StObject.set(x, "QuotaArn", js.undefined)
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = StObject.set(x, "QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaCodeUndefined: Self = StObject.set(x, "QuotaCode", js.undefined)
    
    @scala.inline
    def setQuotaName(value: QuotaName): Self = StObject.set(x, "QuotaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuotaNameUndefined: Self = StObject.set(x, "QuotaName", js.undefined)
    
    @scala.inline
    def setRequester(value: Requester): Self = StObject.set(x, "Requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequesterUndefined: Self = StObject.set(x, "Requester", js.undefined)
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = StObject.set(x, "ServiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceCodeUndefined: Self = StObject.set(x, "ServiceCode", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setStatus(value: RequestStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUnit(value: QuotaUnit): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
  }
}
