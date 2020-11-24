package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2ResourceUtilization extends js.Object {
  
  /**
    *  The EBS field that contains a list of EBS metrics associated with the current instance. 
    */
  var EBSResourceUtilization: js.UndefOr[typings.awsSdk.costexplorerMod.EBSResourceUtilization] = js.native
  
  /**
    *  Maximum observed or expected CPU utilization of the instance.
    */
  var MaxCpuUtilizationPercentage: js.UndefOr[GenericString] = js.native
  
  /**
    *  Maximum observed or expected memory utilization of the instance.
    */
  var MaxMemoryUtilizationPercentage: js.UndefOr[GenericString] = js.native
  
  /**
    *  Maximum observed or expected storage utilization of the instance (does not measure EBS storage).
    */
  var MaxStorageUtilizationPercentage: js.UndefOr[GenericString] = js.native
}
object EC2ResourceUtilization {
  
  @scala.inline
  def apply(): EC2ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2ResourceUtilization]
  }
  
  @scala.inline
  implicit class EC2ResourceUtilizationOps[Self <: EC2ResourceUtilization] (val x: Self) extends AnyVal {
    
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
    def setEBSResourceUtilization(value: EBSResourceUtilization): Self = this.set("EBSResourceUtilization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEBSResourceUtilization: Self = this.set("EBSResourceUtilization", js.undefined)
    
    @scala.inline
    def setMaxCpuUtilizationPercentage(value: GenericString): Self = this.set("MaxCpuUtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCpuUtilizationPercentage: Self = this.set("MaxCpuUtilizationPercentage", js.undefined)
    
    @scala.inline
    def setMaxMemoryUtilizationPercentage(value: GenericString): Self = this.set("MaxMemoryUtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMemoryUtilizationPercentage: Self = this.set("MaxMemoryUtilizationPercentage", js.undefined)
    
    @scala.inline
    def setMaxStorageUtilizationPercentage(value: GenericString): Self = this.set("MaxStorageUtilizationPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxStorageUtilizationPercentage: Self = this.set("MaxStorageUtilizationPercentage", js.undefined)
  }
}
