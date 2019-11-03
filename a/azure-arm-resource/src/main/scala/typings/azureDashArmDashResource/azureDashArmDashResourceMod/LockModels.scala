package typings.azureDashArmDashResource.azureDashArmDashResourceMod

import typings.msDashRestDashAzure.msDashRestDashAzureMod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource", "LockModels")
@js.native
object LockModels extends js.Object {
  @js.native
  class BaseResource ()
    extends typings.msDashRestDashAzure.msDashRestDashAzureMod.BaseResource
  
  @js.native
  class CloudError protected ()
    extends typings.azureDashArmDashResource.libLockModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
}

