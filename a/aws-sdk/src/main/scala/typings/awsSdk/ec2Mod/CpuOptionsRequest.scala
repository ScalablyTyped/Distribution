package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuOptionsRequest extends js.Object {
  /**
    * The number of CPU cores for the instance.
    */
  var CoreCount: js.UndefOr[Integer] = js.native
  /**
    * The number of threads per CPU core. To disable multithreading for the instance, specify a value of 1. Otherwise, specify the default value of 2.
    */
  var ThreadsPerCore: js.UndefOr[Integer] = js.native
}

object CpuOptionsRequest {
  @scala.inline
  def apply(CoreCount: js.UndefOr[Integer] = js.undefined, ThreadsPerCore: js.UndefOr[Integer] = js.undefined): CpuOptionsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CoreCount)) __obj.updateDynamic("CoreCount")(CoreCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ThreadsPerCore)) __obj.updateDynamic("ThreadsPerCore")(ThreadsPerCore.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuOptionsRequest]
  }
}

