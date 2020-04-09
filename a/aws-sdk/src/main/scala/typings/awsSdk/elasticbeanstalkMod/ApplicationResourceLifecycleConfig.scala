package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationResourceLifecycleConfig extends js.Object {
  /**
    * The ARN of an IAM service role that Elastic Beanstalk has permission to assume. The ServiceRole property is required the first time that you provide a VersionLifecycleConfig for the application in one of the supporting calls (CreateApplication or UpdateApplicationResourceLifecycle). After you provide it once, in either one of the calls, Elastic Beanstalk persists the Service Role with the application, and you don't need to specify it again in subsequent UpdateApplicationResourceLifecycle calls. You can, however, specify it in subsequent calls to change the Service Role to another value.
    */
  var ServiceRole: js.UndefOr[String] = js.native
  /**
    * Defines lifecycle settings for application versions.
    */
  var VersionLifecycleConfig: js.UndefOr[ApplicationVersionLifecycleConfig] = js.native
}

object ApplicationResourceLifecycleConfig {
  @scala.inline
  def apply(ServiceRole: String = null, VersionLifecycleConfig: ApplicationVersionLifecycleConfig = null): ApplicationResourceLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole.asInstanceOf[js.Any])
    if (VersionLifecycleConfig != null) __obj.updateDynamic("VersionLifecycleConfig")(VersionLifecycleConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationResourceLifecycleConfig]
  }
}

