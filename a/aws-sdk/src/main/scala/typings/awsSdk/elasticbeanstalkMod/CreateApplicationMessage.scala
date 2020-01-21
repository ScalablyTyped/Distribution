package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationMessage extends js.Object {
  /**
    * The name of the application. Constraint: This name must be unique within your account. If the specified name already exists, the action returns an InvalidParameterValue error.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * Describes the application.
    */
  var Description: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Description] = js.native
  /**
    * Specify an application resource lifecycle configuration to prevent your application from accumulating too many versions.
    */
  var ResourceLifecycleConfig: js.UndefOr[ApplicationResourceLifecycleConfig] = js.native
  /**
    * Specifies the tags applied to the application. Elastic Beanstalk applies these tags only to the application. Environments that you create in the application don't inherit the tags.
    */
  var Tags: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.Tags] = js.native
}

object CreateApplicationMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName,
    Description: Description = null,
    ResourceLifecycleConfig: ApplicationResourceLifecycleConfig = null,
    Tags: Tags = null
  ): CreateApplicationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ResourceLifecycleConfig != null) __obj.updateDynamic("ResourceLifecycleConfig")(ResourceLifecycleConfig.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationMessage]
  }
}

