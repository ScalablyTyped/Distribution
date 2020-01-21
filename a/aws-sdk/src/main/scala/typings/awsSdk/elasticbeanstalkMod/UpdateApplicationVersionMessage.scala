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
  def apply(ApplicationName: ApplicationName, VersionLabel: VersionLabel, Description: Description = null): UpdateApplicationVersionMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], VersionLabel = VersionLabel.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationVersionMessage]
  }
}

