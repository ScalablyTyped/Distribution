package typings.awsSdk.cloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemplateSummaryOutput extends StObject {
  
  /**
    * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.undefined
  
  /**
    * The list of resources that generated the values in the Capabilities response element.
    */
  var CapabilitiesReason: js.UndefOr[typings.awsSdk.cloudformationMod.CapabilitiesReason] = js.undefined
  
  /**
    * A list of the transforms that are declared in the template.
    */
  var DeclaredTransforms: js.UndefOr[TransformsList] = js.undefined
  
  /**
    * The value that is defined in the Description property of the template.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.undefined
  
  /**
    * The value that is defined for the Metadata property of the template.
    */
  var Metadata: js.UndefOr[typings.awsSdk.cloudformationMod.Metadata] = js.undefined
  
  /**
    * A list of parameter declarations that describe various properties for each parameter.
    */
  var Parameters: js.UndefOr[ParameterDeclarations] = js.undefined
  
  /**
    * A list of resource identifier summaries that describe the target resources of an import operation and the properties you can provide during the import to identify the target resources. For example, BucketName is a possible identifier property for an AWS::S3::Bucket resource. 
    */
  var ResourceIdentifierSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceIdentifierSummaries] = js.undefined
  
  /**
    * A list of all the template resource types that are defined in the template, such as AWS::EC2::Instance, AWS::Dynamo::Table, and Custom::MyCustomInstance.
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceTypes] = js.undefined
  
  /**
    * The AWS template format version, which identifies the capabilities of the template.
    */
  var Version: js.UndefOr[typings.awsSdk.cloudformationMod.Version] = js.undefined
}
object GetTemplateSummaryOutput {
  
  @scala.inline
  def apply(): GetTemplateSummaryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateSummaryOutput]
  }
  
  @scala.inline
  implicit class GetTemplateSummaryOutputMutableBuilder[Self <: GetTemplateSummaryOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCapabilities(value: Capabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesReason(value: CapabilitiesReason): Self = StObject.set(x, "CapabilitiesReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapabilitiesReasonUndefined: Self = StObject.set(x, "CapabilitiesReason", js.undefined)
    
    @scala.inline
    def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    @scala.inline
    def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "Capabilities", js.Array(value :_*))
    
    @scala.inline
    def setDeclaredTransforms(value: TransformsList): Self = StObject.set(x, "DeclaredTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclaredTransformsUndefined: Self = StObject.set(x, "DeclaredTransforms", js.undefined)
    
    @scala.inline
    def setDeclaredTransformsVarargs(value: TransformName*): Self = StObject.set(x, "DeclaredTransforms", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setMetadata(value: Metadata): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setParameters(value: ParameterDeclarations): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(value: ParameterDeclaration*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setResourceIdentifierSummaries(value: ResourceIdentifierSummaries): Self = StObject.set(x, "ResourceIdentifierSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceIdentifierSummariesUndefined: Self = StObject.set(x, "ResourceIdentifierSummaries", js.undefined)
    
    @scala.inline
    def setResourceIdentifierSummariesVarargs(value: ResourceIdentifierSummary*): Self = StObject.set(x, "ResourceIdentifierSummaries", js.Array(value :_*))
    
    @scala.inline
    def setResourceTypes(value: ResourceTypes): Self = StObject.set(x, "ResourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "ResourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ResourceType*): Self = StObject.set(x, "ResourceTypes", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: Version): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
