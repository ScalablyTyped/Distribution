package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateSummaryOutput extends js.Object {
  /**
    * The capabilities found within the template. If your template contains IAM resources, you must specify the CAPABILITY_IAM or CAPABILITY_NAMED_IAM value for this parameter when you use the CreateStack or UpdateStack actions with your template; otherwise, those actions return an InsufficientCapabilities error. For more information, see Acknowledging IAM Resources in AWS CloudFormation Templates.
    */
  var Capabilities: js.UndefOr[typings.awsSdk.cloudformationMod.Capabilities] = js.native
  /**
    * The list of resources that generated the values in the Capabilities response element.
    */
  var CapabilitiesReason: js.UndefOr[typings.awsSdk.cloudformationMod.CapabilitiesReason] = js.native
  /**
    * A list of the transforms that are declared in the template.
    */
  var DeclaredTransforms: js.UndefOr[TransformsList] = js.native
  /**
    * The value that is defined in the Description property of the template.
    */
  var Description: js.UndefOr[typings.awsSdk.cloudformationMod.Description] = js.native
  /**
    * The value that is defined for the Metadata property of the template.
    */
  var Metadata: js.UndefOr[typings.awsSdk.cloudformationMod.Metadata] = js.native
  /**
    * A list of parameter declarations that describe various properties for each parameter.
    */
  var Parameters: js.UndefOr[ParameterDeclarations] = js.native
  /**
    * A list of resource identifier summaries that describe the target resources of an import operation and the properties you can provide during the import to identify the target resources. For example, BucketName is a possible identifier property for an AWS::S3::Bucket resource. 
    */
  var ResourceIdentifierSummaries: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceIdentifierSummaries] = js.native
  /**
    * A list of all the template resource types that are defined in the template, such as AWS::EC2::Instance, AWS::Dynamo::Table, and Custom::MyCustomInstance.
    */
  var ResourceTypes: js.UndefOr[typings.awsSdk.cloudformationMod.ResourceTypes] = js.native
  /**
    * The AWS template format version, which identifies the capabilities of the template.
    */
  var Version: js.UndefOr[typings.awsSdk.cloudformationMod.Version] = js.native
}

object GetTemplateSummaryOutput {
  @scala.inline
  def apply(): GetTemplateSummaryOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTemplateSummaryOutput]
  }
  @scala.inline
  implicit class GetTemplateSummaryOutputOps[Self <: GetTemplateSummaryOutput] (val x: Self) extends AnyVal {
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
    def setCapabilitiesVarargs(value: Capability*): Self = this.set("Capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: Capabilities): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    @scala.inline
    def setCapabilitiesReason(value: CapabilitiesReason): Self = this.set("CapabilitiesReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilitiesReason: Self = this.set("CapabilitiesReason", js.undefined)
    @scala.inline
    def setDeclaredTransformsVarargs(value: TransformName*): Self = this.set("DeclaredTransforms", js.Array(value :_*))
    @scala.inline
    def setDeclaredTransforms(value: TransformsList): Self = this.set("DeclaredTransforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclaredTransforms: Self = this.set("DeclaredTransforms", js.undefined)
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("Metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMetadata: Self = this.set("Metadata", js.undefined)
    @scala.inline
    def setParametersVarargs(value: ParameterDeclaration*): Self = this.set("Parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: ParameterDeclarations): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameters: Self = this.set("Parameters", js.undefined)
    @scala.inline
    def setResourceIdentifierSummariesVarargs(value: ResourceIdentifierSummary*): Self = this.set("ResourceIdentifierSummaries", js.Array(value :_*))
    @scala.inline
    def setResourceIdentifierSummaries(value: ResourceIdentifierSummaries): Self = this.set("ResourceIdentifierSummaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceIdentifierSummaries: Self = this.set("ResourceIdentifierSummaries", js.undefined)
    @scala.inline
    def setResourceTypesVarargs(value: ResourceType*): Self = this.set("ResourceTypes", js.Array(value :_*))
    @scala.inline
    def setResourceTypes(value: ResourceTypes): Self = this.set("ResourceTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceTypes: Self = this.set("ResourceTypes", js.undefined)
    @scala.inline
    def setVersion(value: Version): Self = this.set("Version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("Version", js.undefined)
  }
  
}

