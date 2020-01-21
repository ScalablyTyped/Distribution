package typings.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EstimateTemplateCostInput extends js.Object {
  /**
    * A list of Parameter structures that specify input parameters.
    */
  var Parameters: js.UndefOr[typings.awsSdk.cloudformationMod.Parameters] = js.native
  /**
    * Structure containing the template body with a minimum length of 1 byte and a maximum length of 51,200 bytes. (For more information, go to Template Anatomy in the AWS CloudFormation User Guide.) Conditional: You must pass TemplateBody or TemplateURL. If both are passed, only TemplateBody is used.
    */
  var TemplateBody: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateBody] = js.native
  /**
    * Location of file containing the template body. The URL must point to a template that is located in an Amazon S3 bucket. For more information, go to Template Anatomy in the AWS CloudFormation User Guide. Conditional: You must pass TemplateURL or TemplateBody. If both are passed, only TemplateBody is used.
    */
  var TemplateURL: js.UndefOr[typings.awsSdk.cloudformationMod.TemplateURL] = js.native
}

object EstimateTemplateCostInput {
  @scala.inline
  def apply(Parameters: Parameters = null, TemplateBody: TemplateBody = null, TemplateURL: TemplateURL = null): EstimateTemplateCostInput = {
    val __obj = js.Dynamic.literal()
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (TemplateBody != null) __obj.updateDynamic("TemplateBody")(TemplateBody.asInstanceOf[js.Any])
    if (TemplateURL != null) __obj.updateDynamic("TemplateURL")(TemplateURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[EstimateTemplateCostInput]
  }
}

