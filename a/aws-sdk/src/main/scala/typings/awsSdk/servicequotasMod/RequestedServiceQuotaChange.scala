package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestedServiceQuotaChange extends js.Object {
  
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
  implicit class RequestedServiceQuotaChangeOps[Self <: RequestedServiceQuotaChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaseId(value: CustomerServiceEngagementId): Self = this.set("CaseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseId: Self = this.set("CaseId", js.undefined)
    
    @scala.inline
    def setCreated(value: DateTime): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    
    @scala.inline
    def setDesiredValue(value: QuotaValue): Self = this.set("DesiredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredValue: Self = this.set("DesiredValue", js.undefined)
    
    @scala.inline
    def setGlobalQuota(value: GlobalQuota): Self = this.set("GlobalQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalQuota: Self = this.set("GlobalQuota", js.undefined)
    
    @scala.inline
    def setId(value: RequestId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setLastUpdated(value: DateTime): Self = this.set("LastUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdated: Self = this.set("LastUpdated", js.undefined)
    
    @scala.inline
    def setQuotaArn(value: QuotaArn): Self = this.set("QuotaArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaArn: Self = this.set("QuotaArn", js.undefined)
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = this.set("QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaCode: Self = this.set("QuotaCode", js.undefined)
    
    @scala.inline
    def setQuotaName(value: QuotaName): Self = this.set("QuotaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaName: Self = this.set("QuotaName", js.undefined)
    
    @scala.inline
    def setRequester(value: Requester): Self = this.set("Requester", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequester: Self = this.set("Requester", js.undefined)
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCode: Self = this.set("ServiceCode", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    
    @scala.inline
    def setStatus(value: RequestStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUnit(value: QuotaUnit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
}
