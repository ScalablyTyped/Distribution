package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationVersionLifecycleConfig extends js.Object {
  /**
    * Specify a max age rule to restrict the length of time that application versions are retained for an application.
    */
  var MaxAgeRule: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.MaxAgeRule] = js.native
  /**
    * Specify a max count rule to restrict the number of application versions that are retained for an application.
    */
  var MaxCountRule: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.MaxCountRule] = js.native
}

object ApplicationVersionLifecycleConfig {
  @scala.inline
  def apply(MaxAgeRule: MaxAgeRule = null, MaxCountRule: MaxCountRule = null): ApplicationVersionLifecycleConfig = {
    val __obj = js.Dynamic.literal()
    if (MaxAgeRule != null) __obj.updateDynamic("MaxAgeRule")(MaxAgeRule.asInstanceOf[js.Any])
    if (MaxCountRule != null) __obj.updateDynamic("MaxCountRule")(MaxCountRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationVersionLifecycleConfig]
  }
}

