package typings.atAwsDashSdkRegionDashProvider.buildFromEnvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvConfiguration extends js.Object {
  var environmentVariableName: js.UndefOr[String] = js.undefined
}

object EnvConfiguration {
  @scala.inline
  def apply(environmentVariableName: String = null): EnvConfiguration = {
    val __obj = js.Dynamic.literal()
    if (environmentVariableName != null) __obj.updateDynamic("environmentVariableName")(environmentVariableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvConfiguration]
  }
}

