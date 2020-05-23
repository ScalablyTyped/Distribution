package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplate extends js.Object {
  /**
    * The time launch template was created.
    */
  var CreateTime: js.UndefOr[DateTime] = js.native
  /**
    * The principal that created the launch template. 
    */
  var CreatedBy: js.UndefOr[String] = js.native
  /**
    * The version number of the default version of the launch template.
    */
  var DefaultVersionNumber: js.UndefOr[Long] = js.native
  /**
    * The version number of the latest version of the launch template.
    */
  var LatestVersionNumber: js.UndefOr[Long] = js.native
  /**
    * The ID of the launch template.
    */
  var LaunchTemplateId: js.UndefOr[String] = js.native
  /**
    * The name of the launch template.
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.ec2Mod.LaunchTemplateName] = js.native
  /**
    * The tags for the launch template.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object LaunchTemplate {
  @scala.inline
  def apply(
    CreateTime: DateTime = null,
    CreatedBy: String = null,
    DefaultVersionNumber: js.UndefOr[Long] = js.undefined,
    LatestVersionNumber: js.UndefOr[Long] = js.undefined,
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Tags: TagList = null
  ): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultVersionNumber)) __obj.updateDynamic("DefaultVersionNumber")(DefaultVersionNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(LatestVersionNumber)) __obj.updateDynamic("LatestVersionNumber")(LatestVersionNumber.get.asInstanceOf[js.Any])
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplate]
  }
}

