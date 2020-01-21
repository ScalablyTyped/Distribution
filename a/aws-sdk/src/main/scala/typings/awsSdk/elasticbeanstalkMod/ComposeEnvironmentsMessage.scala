package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeEnvironmentsMessage extends js.Object {
  /**
    * The name of the application to which the specified source bundles belong.
    */
  var ApplicationName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  /**
    * The name of the group to which the target environments belong. Specify a group name only if the environment name defined in each target environment's manifest ends with a + (plus) character. See Environment Manifest (env.yaml) for details.
    */
  var GroupName: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.GroupName] = js.native
  /**
    * A list of version labels, specifying one or more application source bundles that belong to the target application. Each source bundle must include an environment manifest that specifies the name of the environment and the name of the solution stack to use, and optionally can specify environment links to create.
    */
  var VersionLabels: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.VersionLabels] = js.native
}

object ComposeEnvironmentsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    GroupName: GroupName = null,
    VersionLabels: VersionLabels = null
  ): ComposeEnvironmentsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName.asInstanceOf[js.Any])
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName.asInstanceOf[js.Any])
    if (VersionLabels != null) __obj.updateDynamic("VersionLabels")(VersionLabels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeEnvironmentsMessage]
  }
}

