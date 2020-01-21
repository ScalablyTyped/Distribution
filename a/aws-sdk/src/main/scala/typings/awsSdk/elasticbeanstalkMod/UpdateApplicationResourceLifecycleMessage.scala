package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApplicationResourceLifecycleMessage extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  /**
    * The lifecycle configuration.
    */
  var ResourceLifecycleConfig: ApplicationResourceLifecycleConfig = js.native
}

object UpdateApplicationResourceLifecycleMessage {
  @scala.inline
  def apply(ApplicationName: ApplicationName, ResourceLifecycleConfig: ApplicationResourceLifecycleConfig): UpdateApplicationResourceLifecycleMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], ResourceLifecycleConfig = ResourceLifecycleConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApplicationResourceLifecycleMessage]
  }
}

