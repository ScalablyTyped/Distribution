package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationMessage extends js.Object {
  /**
    * The name of the application to update. If no such application is found, UpdateApplication returns an InvalidParameterValue error. 
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * A new description for the application. Default: If not specified, AWS Elastic Beanstalk does not update the description.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
}

object UpdateApplicationMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, Description: Description = null): UpdateApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationMessage]
  }
}

