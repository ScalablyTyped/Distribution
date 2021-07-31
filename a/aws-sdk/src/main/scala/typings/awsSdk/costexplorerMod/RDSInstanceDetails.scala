package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RDSInstanceDetails extends StObject {
  
  /**
    * Whether the recommendation is for a current-generation instance. 
    */
  var CurrentGeneration: js.UndefOr[GenericBoolean] = js.undefined
  
  /**
    * The database edition that the recommended reservation supports.
    */
  var DatabaseEdition: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The database engine that the recommended reservation supports.
    */
  var DatabaseEngine: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Whether the recommendation is for a reservation in a single Availability Zone or a reservation with a backup in a second Availability Zone.
    */
  var DeploymentOption: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The instance family of the recommended reservation.
    */
  var Family: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The type of instance that AWS recommends.
    */
  var InstanceType: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The license model that the recommended reservation supports.
    */
  var LicenseModel: js.UndefOr[GenericString] = js.undefined
  
  /**
    * The AWS Region of the recommended reservation.
    */
  var Region: js.UndefOr[GenericString] = js.undefined
  
  /**
    * Whether the recommended reservation is size flexible.
    */
  var SizeFlexEligible: js.UndefOr[GenericBoolean] = js.undefined
}
object RDSInstanceDetails {
  
  @scala.inline
  def apply(): RDSInstanceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RDSInstanceDetails]
  }
  
  @scala.inline
  implicit class RDSInstanceDetailsMutableBuilder[Self <: RDSInstanceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentGeneration(value: GenericBoolean): Self = StObject.set(x, "CurrentGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentGenerationUndefined: Self = StObject.set(x, "CurrentGeneration", js.undefined)
    
    @scala.inline
    def setDatabaseEdition(value: GenericString): Self = StObject.set(x, "DatabaseEdition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseEditionUndefined: Self = StObject.set(x, "DatabaseEdition", js.undefined)
    
    @scala.inline
    def setDatabaseEngine(value: GenericString): Self = StObject.set(x, "DatabaseEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseEngineUndefined: Self = StObject.set(x, "DatabaseEngine", js.undefined)
    
    @scala.inline
    def setDeploymentOption(value: GenericString): Self = StObject.set(x, "DeploymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentOptionUndefined: Self = StObject.set(x, "DeploymentOption", js.undefined)
    
    @scala.inline
    def setFamily(value: GenericString): Self = StObject.set(x, "Family", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyUndefined: Self = StObject.set(x, "Family", js.undefined)
    
    @scala.inline
    def setInstanceType(value: GenericString): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: GenericString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setRegion(value: GenericString): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    @scala.inline
    def setSizeFlexEligible(value: GenericBoolean): Self = StObject.set(x, "SizeFlexEligible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeFlexEligibleUndefined: Self = StObject.set(x, "SizeFlexEligible", js.undefined)
  }
}
