package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RDSInstanceDetails extends js.Object {
  
  /**
    * Whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.native
  
  /**
    * The database edition that the recommended reservation supports.
    */
  var DatabaseEdition: js.UndefOr[GenericString] = js.native
  
  /**
    * The database engine that the recommended reservation supports.
    */
  var DatabaseEngine: js.UndefOr[GenericString] = js.native
  
  /**
    * Whether the recommendation is for a reservation in a single Availability Zone or a reservation with a backup in a second Availability Zone.
    */
  var DeploymentOption: js.UndefOr[GenericString] = js.native
  
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.native
  
  /**
    * The type of instance that AWS recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.native
  
  /**
    * The license model that the recommended reservation supports.
    */
  var LicenseModel: js.UndefOr[GenericString] = js.native
  
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.native
  
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.native
}
object RDSInstanceDetails {
  
  @scala.inline
  def apply(): RDSInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RDSInstanceDetails]
  }
  
  @scala.inline
  implicit class RDSInstanceDetailsOps[Self <: RDSInstanceDetails] (val x: Self) extends AnyVal {
    
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
    def setCurrentGeneration(value: GenericBoolean): Self = this.set("CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentGeneration: Self = this.set("CurrentGeneration", js.undefined)
    
    @scala.inline
    def setDatabaseEdition(value: GenericString): Self = this.set("DatabaseEdition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseEdition: Self = this.set("DatabaseEdition", js.undefined)
    
    @scala.inline
    def setDatabaseEngine(value: GenericString): Self = this.set("DatabaseEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatabaseEngine: Self = this.set("DatabaseEngine", js.undefined)
    
    @scala.inline
    def setDeploymentOption(value: GenericString): Self = this.set("DeploymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentOption: Self = this.set("DeploymentOption", js.undefined)
    
    @scala.inline
    def setFamily(value: GenericString): Self = this.set("Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFamily: Self = this.set("Family", js.undefined)
    
    @scala.inline
    def setInstanceType(value: GenericString): Self = this.set("InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceType: Self = this.set("InstanceType", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: GenericString): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = this.set("Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    
    @scala.inline
    def setSizeFlexEligible(value: GenericBoolean): Self = this.set("SizeFlexEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeFlexEligible: Self = this.set("SizeFlexEligible", js.undefined)
  }
}
