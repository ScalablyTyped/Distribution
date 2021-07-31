package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifact extends StObject {
  
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[ProvisioningArtifactCreatedTime] = js.undefined
  
  /**
    * The description of the provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
  
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
}
object ProvisioningArtifact {
  
  @scala.inline
  def apply(): ProvisioningArtifact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifact]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactMutableBuilder[Self <: ProvisioningArtifact] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedTime(value: ProvisioningArtifactCreatedTime): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    @scala.inline
    def setDescription(value: ProvisioningArtifactDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
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
  }
}
