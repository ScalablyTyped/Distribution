package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningArtifactProperties extends StObject {
  
  /**
    * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.native
  
  /**
    * If set to true, AWS Service Catalog stops validating the specified provisioning artifact even if it is invalid.
    */
  var DisableTemplateValidation: js.UndefOr[typings.awsSdk.servicecatalogMod.DisableTemplateValidation] = js.native
  
  /**
    * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:  "LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..." 
    */
  var Info: ProvisioningArtifactInfo = js.native
  
  /**
    * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.native
  
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.native
}
object ProvisioningArtifactProperties {
  
  @scala.inline
  def apply(Info: ProvisioningArtifactInfo): ProvisioningArtifactProperties = {
    val __obj = js.Dynamic.literal(Info = Info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactProperties]
  }
  
  @scala.inline
  implicit class ProvisioningArtifactPropertiesMutableBuilder[Self <: ProvisioningArtifactProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: ProvisioningArtifactDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDisableTemplateValidation(value: DisableTemplateValidation): Self = StObject.set(x, "DisableTemplateValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableTemplateValidationUndefined: Self = StObject.set(x, "DisableTemplateValidation", js.undefined)
    
    @scala.inline
    def setInfo(value: ProvisioningArtifactInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
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
