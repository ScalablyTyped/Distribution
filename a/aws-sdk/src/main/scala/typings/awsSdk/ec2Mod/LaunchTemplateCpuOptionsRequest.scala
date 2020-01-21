package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCpuOptionsRequest extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.native
  /**
    * The number of threads per CPU core. To disable multithreading for the instance, specify a value of 1. Otherwise, specify the default value of 2.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.native
}

object LaunchTemplateCpuOptionsRequest {
  @scala.inline
  def apply(CoreCount: Int | scala.Double = null, ThreadsPerCore: Int | scala.Double = null): LaunchTemplateCpuOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (CoreCount != null) __obj.updateDynamic("CoreCount")(CoreCount.asInstanceOf[js.Any])
    if (ThreadsPerCore != null) __obj.updateDynamic("ThreadsPerCore")(ThreadsPerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCpuOptionsRequest]
  }
}

