package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProvisioningArtifactProperties extends js.Object {
  
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
  implicit class ProvisioningArtifactPropertiesOps[Self <: ProvisioningArtifactProperties] (val x: Self) extends AnyVal {
    
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
    def setInfo(value: ProvisioningArtifactInfo): Self = this.set("Info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ProvisioningArtifactDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDisableTemplateValidation(value: DisableTemplateValidation): Self = this.set("DisableTemplateValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableTemplateValidation: Self = this.set("DisableTemplateValidation", js.undefined)
    
    @scala.inline
    def setName(value: ProvisioningArtifactName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setType(value: ProvisioningArtifactType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
