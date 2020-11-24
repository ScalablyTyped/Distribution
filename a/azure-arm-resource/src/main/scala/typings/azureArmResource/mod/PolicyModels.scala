package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azure-arm-resource", "PolicyModels")
@js.native
object PolicyModels extends js.Object {
  
  @js.native
  class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @js.native
  class CloudError protected ()
    extends typings.azureArmResource.policyModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
