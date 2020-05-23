package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VCpuInfo extends js.Object {
  /**
    * The default number of cores for the instance type.
    */
  var DefaultCores: js.UndefOr[CoreCount] = js.native
  /**
    * The default number of threads per core for the instance type.
    */
  var DefaultThreadsPerCore: js.UndefOr[ThreadsPerCore] = js.native
  /**
    * The default number of vCPUs for the instance type.
    */
  var DefaultVCpus: js.UndefOr[VCpuCount] = js.native
  /**
    * List of the valid number of cores that can be configured for the instance type.
    */
  var ValidCores: js.UndefOr[CoreCountList] = js.native
  /**
    * List of the valid number of threads per core that can be configured for the instance type. 
    */
  var ValidThreadsPerCore: js.UndefOr[ThreadsPerCoreList] = js.native
}

object VCpuInfo {
  @scala.inline
  def apply(
    DefaultCores: js.UndefOr[CoreCount] = js.undefined,
    DefaultThreadsPerCore: js.UndefOr[ThreadsPerCore] = js.undefined,
    DefaultVCpus: js.UndefOr[VCpuCount] = js.undefined,
    ValidCores: CoreCountList = null,
    ValidThreadsPerCore: ThreadsPerCoreList = null
  ): VCpuInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DefaultCores)) __obj.updateDynamic("DefaultCores")(DefaultCores.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultThreadsPerCore)) __obj.updateDynamic("DefaultThreadsPerCore")(DefaultThreadsPerCore.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultVCpus)) __obj.updateDynamic("DefaultVCpus")(DefaultVCpus.get.asInstanceOf[js.Any])
    if (ValidCores != null) __obj.updateDynamic("ValidCores")(ValidCores.asInstanceOf[js.Any])
    if (ValidThreadsPerCore != null) __obj.updateDynamic("ValidThreadsPerCore")(ValidThreadsPerCore.asInstanceOf[js.Any])
    __obj.asInstanceOf[VCpuInfo]
  }
}

