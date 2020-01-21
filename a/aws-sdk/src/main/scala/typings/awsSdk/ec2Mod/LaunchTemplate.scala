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
    DefaultVersionNumber: Int | scala.Double = null,
    LatestVersionNumber: Int | scala.Double = null,
    LaunchTemplateId: String = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Tags: TagList = null
  ): LaunchTemplate = {
    val __obj = js.Dynamic.literal()
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (DefaultVersionNumber != null) __obj.updateDynamic("DefaultVersionNumber")(DefaultVersionNumber.asInstanceOf[js.Any])
    if (LatestVersionNumber != null) __obj.updateDynamic("LatestVersionNumber")(LatestVersionNumber.asInstanceOf[js.Any])
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplate]
  }
}

