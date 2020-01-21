package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteEnvironmentConfigurationMessage extends js.Object {
  /**
    * The name of the application the environment is associated with.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * The name of the environment to delete the draft configuration from.
    */
  var EnvironmentName: typings.awsSdk.elasticbeanstalkMod.EnvironmentName = js.native
}

object DeleteEnvironmentConfigurationMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, EnvironmentName: EnvironmentName): DeleteEnvironmentConfigurationMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], EnvironmentName = EnvironmentName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteEnvironmentConfigurationMessage]
  }
}

