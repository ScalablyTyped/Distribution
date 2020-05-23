package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTemplateRequest extends js.Object {
  /**
    * The alias of the template that you want to describe. If you name a specific alias, you describe the version that the alias points to. You can specify the latest version of the template by providing the keyword $LATEST in the AliasName parameter. The keyword $PUBLISHED doesn't apply to templates.
    */
  var AliasName: js.UndefOr[typings.awsSdk.quicksightMod.AliasName] = js.native
  /**
    * The ID of the AWS account that contains the template that you're describing.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the template.
    */
  var TemplateId: RestrictiveResourceId = js.native
  /**
    * (Optional) The number for the version to describe. If a VersionNumber parameter value isn't provided, the latest version of the template is described.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object DescribeTemplateRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    TemplateId: RestrictiveResourceId,
    AliasName: AliasName = null,
    VersionNumber: js.UndefOr[VersionNumber] = js.undefined
  ): DescribeTemplateRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], TemplateId = TemplateId.asInstanceOf[js.Any])
    if (AliasName != null) __obj.updateDynamic("AliasName")(AliasName.asInstanceOf[js.Any])
    if (!js.isUndefined(VersionNumber)) __obj.updateDynamic("VersionNumber")(VersionNumber.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTemplateRequest]
  }
}

