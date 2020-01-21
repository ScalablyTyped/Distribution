package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTemplateSummaryInput extends js.Object {
  /**
    * The name or the stack ID that is associated with the stack, which are not always interchangeable. For running stacks, you can specify either the stack's name or its unique stack ID. For deleted stack, you must specify the unique stack ID. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
  /**
    * The name or unique ID of the stack set from which the stack was created. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var StackSetName: js.UndefOr[StackSetNameOrId] = js.native
  /**
    * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. For more information about templates, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateBody] = js.native
  /**
    * Location of file containing the template body. The URL must point to a template (max size: 460,800 bytes) that is located in an Amazon S3 bucket. For more information about templates, see Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must specify only one of the following parameters: StackName, StackSetName, TemplateBody, or TemplateURL.
    */
  var TemplateURL: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateURL] = js.native
}

object GetTemplateSummaryInput {
  @scala.inline
  def apply(
    StackName: StackNameOrId = null,
    StackSetName: StackSetNameOrId = null,
    TemplateBody: TemplateBody = null,
    TemplateURL: TemplateURL = null
  ): GetTemplateSummaryInput = {
    val __obj = js.Dynamic.literal()
    if (StackName != null) __obj.updateDynamic("StackName")(StackName.asInstanceOf[js.Any])
    if (StackSetName != null) __obj.updateDynamic("StackSetName")(StackSetName.asInstanceOf[js.Any])
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody.asInstanceOf[js.Any])
    if (TemplateURL != null) __obj.updateDynamic("TemplateURL")(TemplateURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemplateSummaryInput]
  }
}

