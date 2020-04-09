package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateSpecification extends js.Object {
  /**
    * A unique identifier for an existing EC2 launch template.
    */
  var LaunchTemplateId: js.UndefOr[typings.awsSdk.gameliftMod.LaunchTemplateId] = js.native
  /**
    * A readable identifier for an existing EC2 launch template. 
    */
  var LaunchTemplateName: js.UndefOr[typings.awsSdk.gameliftMod.LaunchTemplateName] = js.native
  /**
    * The version of the EC2 launch template to use. If no version is specified, the default version will be used. EC2 allows you to specify a default version for a launch template, if none is set, the default is the first version created.
    */
  var Version: js.UndefOr[LaunchTemplateVersion] = js.native
}

object LaunchTemplateSpecification {
  @scala.inline
  def apply(
    LaunchTemplateId: LaunchTemplateId = null,
    LaunchTemplateName: LaunchTemplateName = null,
    Version: LaunchTemplateVersion = null
  ): LaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    if (LaunchTemplateId != null) __obj.updateDynamic("LaunchTemplateId")(LaunchTemplateId.asInstanceOf[js.Any])
    if (LaunchTemplateName != null) __obj.updateDynamic("LaunchTemplateName")(LaunchTemplateName.asInstanceOf[js.Any])
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateSpecification]
  }
}

