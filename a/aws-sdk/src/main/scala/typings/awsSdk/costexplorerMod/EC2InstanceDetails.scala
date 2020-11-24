package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2InstanceDetails extends js.Object {
  
  /**
    * The Availability Zone of the recommended reservation.
    */
  var AvailabilityZone: js.UndefOr[GenericString] = js.native
  
  /**
    * Whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  
  /**
    * The type of instance that AWS recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  
  /**
    * The platform of the recommended reservation. The platform is the specific combination of operating system, license model, and software on an instance.
    */
  var Platform: js.UndefOr[GenericString] = js.native
  
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * Whether the recommended reservation is dedicated or shared.
    */
  var Tenancy: js.UndefOr[GenericString] = js.native
}
object EC2InstanceDetails {
  
  @scala.inline
  def apply(): EC2InstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2InstanceDetails]
  }
  
  @scala.inline
  implicit class EC2InstanceDetailsOps[Self <: EC2InstanceDetails] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityZone(value: GenericString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setCurrentGeneration(value: GenericBoolean): Self = this.set("CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentGeneration: Self = this.set("CurrentGeneration", js.undefined)
    
    @scala.inline
    def setFamily(value: GenericString): Self = this.set("Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("Family", js.undefined)
    
    @scala.inline
    def setInstanceType(value: GenericString): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setPlatform(value: GenericString): Self = this.set("Platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("Platform", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setSizeFlexEligible(value: GenericBoolean): Self = this.set("SizeFlexEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeFlexEligible: Self = this.set("SizeFlexEligible", js.undefined)
    
    @scala.inline
    def setTenancy(value: GenericString): Self = this.set("Tenancy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTenancy: Self = this.set("Tenancy", js.undefined)
  }
}
