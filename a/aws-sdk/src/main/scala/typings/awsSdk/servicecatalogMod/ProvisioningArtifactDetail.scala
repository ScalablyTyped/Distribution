package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactDetail extends StObject {
  
  /**
    * Indicates whether the product version is active.
    */
  var Active: js.UndefOr[ProvisioningArtifactActive] = js.undefined
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreationTime] = js.undefined
  
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactName] = js.undefined
  
  /**
    * Information set by the administrator to provide guidance to end users about which provisioning artifacts to use.
    */
  var Guidance: js.UndefOr[ProvisioningArtifactGuidance] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.undefined
  
  /**
    * The name of the provisioning artifact.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
}
object ProvisioningArtifactDetail {
  
  @scala.inline
  def apply(): ProvisioningArtifactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactDetail]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactDetailMutableBuilder[Self <: ProvisioningArtifactDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: ProvisioningArtifactActive): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: CreationTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ProvisioningArtifactName): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGuidance(value: ProvisioningArtifactGuidance): Self = StObject.set(x, "Guidance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGuidanceUndefined: Self = StObject.set(x, "Guidance", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ProvisioningArtifactName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setType(value: ProvisioningArtifactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
