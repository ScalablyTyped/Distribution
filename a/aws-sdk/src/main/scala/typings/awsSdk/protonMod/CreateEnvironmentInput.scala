package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM service role that Proton uses when provisioning directly defined components in this environment. It determines the scope of infrastructure that a component can provision. You must specify componentRoleArn to allow directly defined components to be associated with this environment. For more information about components, see Proton components in the Proton User Guide.
    */
  var componentRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * A description of the environment that's being created and deployed.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * The ID of the environment account connection that you provide if you're provisioning your environment infrastructure resources to an environment account. For more information, see Environment account connections in the Proton User guide. To use Amazon Web Services-managed provisioning for the environment, specify either the environmentAccountConnectionId or protonServiceRoleArn parameter and omit the provisioningRepository parameter.
    */
  var environmentAccountConnectionId: js.UndefOr[EnvironmentAccountConnectionId] = js.undefined
  
  /**
    * The name of the environment.
    */
  var name: ResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the Proton service role that allows Proton to make calls to other services on your behalf. To use Amazon Web Services-managed provisioning for the environment, specify either the environmentAccountConnectionId or protonServiceRoleArn parameter and omit the provisioningRepository parameter.
    */
  var protonServiceRoleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The linked repository that you use to host your rendered infrastructure templates for self-managed provisioning. A linked repository is a repository that has been registered with Proton. For more information, see CreateRepository. To use self-managed provisioning for the environment, specify this parameter and omit the environmentAccountConnectionId and protonServiceRoleArn parameters.
    */
  var provisioningRepository: js.UndefOr[RepositoryBranchInput] = js.undefined
  
  /**
    * A YAML formatted string that provides inputs as defined in the environment template bundle schema file. For more information, see Environments in the Proton User Guide.
    */
  var spec: SpecContents
  
  /**
    * An optional list of metadata items that you can associate with the Proton environment. A tag is a key-value pair. For more information, see Proton resources and tagging in the Proton User Guide.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The major version of the environment template.
    */
  var templateMajorVersion: TemplateVersionPart
  
  /**
    * The minor version of the environment template.
    */
  var templateMinorVersion: js.UndefOr[TemplateVersionPart] = js.undefined
  
  /**
    * The name of the environment template. For more information, see Environment Templates in the Proton User Guide.
    */
  var templateName: ResourceName
}
object CreateEnvironmentInput {
  
  inline def apply(
    name: ResourceName,
    spec: SpecContents,
    templateMajorVersion: TemplateVersionPart,
    templateName: ResourceName
  ): CreateEnvironmentInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any], templateMajorVersion = templateMajorVersion.asInstanceOf[js.Any], templateName = templateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentInput]
  }
  
  extension [Self <: CreateEnvironmentInput](x: Self) {
    
    inline def setComponentRoleArn(value: Arn): Self = StObject.set(x, "componentRoleArn", value.asInstanceOf[js.Any])
    
    inline def setComponentRoleArnUndefined: Self = StObject.set(x, "componentRoleArn", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEnvironmentAccountConnectionId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "environmentAccountConnectionId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentAccountConnectionIdUndefined: Self = StObject.set(x, "environmentAccountConnectionId", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtonServiceRoleArn(value: Arn): Self = StObject.set(x, "protonServiceRoleArn", value.asInstanceOf[js.Any])
    
    inline def setProtonServiceRoleArnUndefined: Self = StObject.set(x, "protonServiceRoleArn", js.undefined)
    
    inline def setProvisioningRepository(value: RepositoryBranchInput): Self = StObject.set(x, "provisioningRepository", value.asInstanceOf[js.Any])
    
    inline def setProvisioningRepositoryUndefined: Self = StObject.set(x, "provisioningRepository", js.undefined)
    
    inline def setSpec(value: SpecContents): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTemplateMajorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMajorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersion(value: TemplateVersionPart): Self = StObject.set(x, "templateMinorVersion", value.asInstanceOf[js.Any])
    
    inline def setTemplateMinorVersionUndefined: Self = StObject.set(x, "templateMinorVersion", js.undefined)
    
    inline def setTemplateName(value: ResourceName): Self = StObject.set(x, "templateName", value.asInstanceOf[js.Any])
  }
}
