package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationVersionMessage extends js.Object {
  /**
    * The name of the application associated with this version.  If no application is found with this name, UpdateApplication returns an InvalidParameterValue error.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * A new description for this version.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * The name of the version to update. If no application version is found with this label, UpdateApplication returns an InvalidParameterValue error. 
    */
  var VersionLabel: typings.awsSdk.elasticbeanstalkMod.VersionLabel = js.native
}

object UpdateApplicationVersionMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel): UpdateApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationVersionMessage]
  }
  @scala.inline
  implicit class UpdateApplicationVersionMessageOps[Self <: UpdateApplicationVersionMessage] (val x: Self) extends AnyVal {
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
    def setVersionLabel(value: VersionLabel): Self = this.set("VersionLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Description): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
  }
  
}

