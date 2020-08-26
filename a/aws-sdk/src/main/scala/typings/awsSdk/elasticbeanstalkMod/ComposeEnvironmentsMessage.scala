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
  def apply(): ComposeEnvironmentsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeEnvironmentsMessage]
  }
  @scala.inline
  implicit class ComposeEnvironmentsMessageOps[Self <: ComposeEnvironmentsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationName: Self = this.set("ApplicationName", js.undefined)
    @scala.inline
    def setGroupName(value: GroupName): Self = this.set("GroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupName: Self = this.set("GroupName", js.undefined)
    @scala.inline
    def setVersionLabelsVarargs(value: VersionLabel*): Self = this.set("VersionLabels", js.Array(value :_*))
    @scala.inline
    def setVersionLabels(value: VersionLabels): Self = this.set("VersionLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionLabels: Self = this.set("VersionLabels", js.undefined)
  }
  
}

