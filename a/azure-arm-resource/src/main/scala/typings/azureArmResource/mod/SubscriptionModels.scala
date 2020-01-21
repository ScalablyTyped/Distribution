package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource", "SubscriptionModels")
@js.native
object SubscriptionModels extends js.Object {
  @js.native
  class BaseResource ()
    extends typings.msRestAzure.mod.BaseResource
  
  @js.native
  class CloudError protected ()
    extends typings.azureArmResource.subscriptionModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
  
}

