package typings.awsSdk.servicequotasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceQuotaIncreaseRequestInTemplate extends js.Object {
  
  /**
    * The AWS Region where the increase request occurs.
    */
  var AwsRegion: js.UndefOr[typings.awsSdk.servicequotasMod.AwsRegion] = js.native
  
  /**
    * Identifies the new, increased value of the service quota in the increase request. 
    */
  var DesiredValue: js.UndefOr[QuotaValue] = js.native
  
  /**
    * Specifies if the quota is a global quota.
    */
  var GlobalQuota: js.UndefOr[typings.awsSdk.servicequotasMod.GlobalQuota] = js.native
  
  /**
    * The code identifier for the service quota specified in the increase request.
    */
  var QuotaCode: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaCode] = js.native
  
  /**
    * The name of the service quota in the increase request.
    */
  var QuotaName: js.UndefOr[typings.awsSdk.servicequotasMod.QuotaName] = js.native
  
  /**
    * The code identifier for the AWS service specified in the increase request.
    */
  var ServiceCode: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceCode] = js.native
  
  /**
    * The name of the AWS service specified in the increase request. 
    */
  var ServiceName: js.UndefOr[typings.awsSdk.servicequotasMod.ServiceName] = js.native
  
  /**
    * The unit of measure for the increase request.
    */
  var Unit: js.UndefOr[QuotaUnit] = js.native
}
object ServiceQuotaIncreaseRequestInTemplate {
  
  @scala.inline
  def apply(): ServiceQuotaIncreaseRequestInTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceQuotaIncreaseRequestInTemplate]
  }
  
  @scala.inline
  implicit class ServiceQuotaIncreaseRequestInTemplateOps[Self <: ServiceQuotaIncreaseRequestInTemplate] (val x: Self) extends AnyVal {
    
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
    def setAwsRegion(value: AwsRegion): Self = this.set("AwsRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsRegion: Self = this.set("AwsRegion", js.undefined)
    
    @scala.inline
    def setDesiredValue(value: QuotaValue): Self = this.set("DesiredValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesiredValue: Self = this.set("DesiredValue", js.undefined)
    
    @scala.inline
    def setGlobalQuota(value: GlobalQuota): Self = this.set("GlobalQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalQuota: Self = this.set("GlobalQuota", js.undefined)
    
    @scala.inline
    def setQuotaCode(value: QuotaCode): Self = this.set("QuotaCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaCode: Self = this.set("QuotaCode", js.undefined)
    
    @scala.inline
    def setQuotaName(value: QuotaName): Self = this.set("QuotaName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuotaName: Self = this.set("QuotaName", js.undefined)
    
    @scala.inline
    def setServiceCode(value: ServiceCode): Self = this.set("ServiceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceCode: Self = this.set("ServiceCode", js.undefined)
    
    @scala.inline
    def setServiceName(value: ServiceName): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    
    @scala.inline
    def setUnit(value: QuotaUnit): Self = this.set("Unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnit: Self = this.set("Unit", js.undefined)
  }
}
