package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SubscriptionModels {
  
  @JSImport("azure-arm-resource", "SubscriptionModels.BaseResource")
  @js.native
  class BaseResource ()
    extends typings.azureArmResource.subscriptionModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "SubscriptionModels.CloudError")
  @js.native
  class CloudError protected ()
    extends typings.azureArmResource.subscriptionModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
