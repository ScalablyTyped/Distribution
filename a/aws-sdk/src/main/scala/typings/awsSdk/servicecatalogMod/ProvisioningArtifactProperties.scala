package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningArtifactProperties extends StObject {
  
  /**
    * The description of the provisioning artifact, including how it differs from the previous provisioning artifact.
    */
  var Description: js.UndefOr[ProvisioningArtifactDescription] = js.undefined
  
  /**
    * If set to true, AWS Service Catalog stops validating the specified provisioning artifact even if it is invalid.
    */
  var DisableTemplateValidation: js.UndefOr[typings.awsSdk.servicecatalogMod.DisableTemplateValidation] = js.undefined
  
  /**
    * The URL of the CloudFormation template in Amazon S3. Specify the URL in JSON format as follows:  "LoadTemplateFromURL": "https://s3.amazonaws.com/cf-templates-ozkq9d3hgiq2-us-east-1/..." 
    */
  var Info: ProvisioningArtifactInfo
  
  /**
    * The name of the provisioning artifact (for example, v1 v2beta). No spaces are allowed.
    */
  var Name: js.UndefOr[ProvisioningArtifactName] = js.undefined
  
  /**
    * The type of provisioning artifact.    CLOUD_FORMATION_TEMPLATE - AWS CloudFormation template    MARKETPLACE_AMI - AWS Marketplace AMI    MARKETPLACE_CAR - AWS Marketplace Clusters and AWS Resources  
    */
  var Type: js.UndefOr[ProvisioningArtifactType] = js.undefined
}
object ProvisioningArtifactProperties {
  
  inline def apply(Info: ProvisioningArtifactInfo): ProvisioningArtifactProperties = {
    val __obj = js.Dynamic.literal(Info = Info.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningArtifactProperties]
  }
  
  extension [Self <: ProvisioningArtifactProperties](x: Self) {
    
    inline def setDescription(value: ProvisioningArtifactDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDisableTemplateValidation(value: DisableTemplateValidation): Self = StObject.set(x, "DisableTemplateValidation", value.asInstanceOf[js.Any])
    
    inline def setDisableTemplateValidationUndefined: Self = StObject.set(x, "DisableTemplateValidation", js.undefined)
    
    inline def setInfo(value: ProvisioningArtifactInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setName(value: ProvisioningArtifactName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setType(value: ProvisioningArtifactType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
