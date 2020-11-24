package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceSummary extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) that AWS Cloud Map assigns to the service when you create it.
    */
  var Arn: js.UndefOr[typings.awsSdk.servicediscoveryMod.Arn] = js.native
  
  /**
    * The date and time that the service was created.
    */
  var CreateDate: js.UndefOr[Timestamp] = js.native
  
  /**
    * The description that you specify when you create the service.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  
  var DnsConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.DnsConfig] = js.native
  
  var HealthCheckConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckConfig] = js.native
  
  var HealthCheckCustomConfig: js.UndefOr[typings.awsSdk.servicediscoveryMod.HealthCheckCustomConfig] = js.native
  
  /**
    * The ID that AWS Cloud Map assigned to the service when you created it.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The number of instances that are currently associated with the service. Instances that were previously associated with the service but that have been deleted are not included in the count. The count might not reflect pending registrations and deregistrations.
    */
  var InstanceCount: js.UndefOr[ResourceCount] = js.native
  
  /**
    * The name of the service.
    */
  var Name: js.UndefOr[ServiceName] = js.native
}
object ServiceSummary {
  
  @scala.inline
  def apply(): ServiceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSummary]
  }
  
  @scala.inline
  implicit class ServiceSummaryOps[Self <: ServiceSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setCreateDate(value: Timestamp): Self = this.set("CreateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateDate: Self = this.set("CreateDate", js.undefined)
    
    @scala.inline
    def setDescription(value: ResourceDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDnsConfig(value: DnsConfig): Self = this.set("DnsConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDnsConfig: Self = this.set("DnsConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckConfig(value: HealthCheckConfig): Self = this.set("HealthCheckConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckConfig: Self = this.set("HealthCheckConfig", js.undefined)
    
    @scala.inline
    def setHealthCheckCustomConfig(value: HealthCheckCustomConfig): Self = this.set("HealthCheckCustomConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheckCustomConfig: Self = this.set("HealthCheckCustomConfig", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setInstanceCount(value: ResourceCount): Self = this.set("InstanceCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCount: Self = this.set("InstanceCount", js.undefined)
    
    @scala.inline
    def setName(value: ServiceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
