package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRuntimeConfigurationOutput extends js.Object {
  /**
    * Instructions describing how server processes should be launched and maintained on each instance in the fleet.
    */
  var RuntimeConfiguration: js.UndefOr[typings.awsSdk.gameliftMod.RuntimeConfiguration] = js.native
}

object DescribeRuntimeConfigurationOutput {
  @scala.inline
  def apply(RuntimeConfiguration: RuntimeConfiguration = null): DescribeRuntimeConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    if (RuntimeConfiguration != null) __obj.updateDynamic("RuntimeConfiguration")(RuntimeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRuntimeConfigurationOutput]
  }
}

