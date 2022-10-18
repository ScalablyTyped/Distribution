package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SubscriptionModels {
  
  @JSImport("azure-arm-resource", "SubscriptionModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.azureArmResource.libSubscriptionModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "SubscriptionModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.azureArmResource.libSubscriptionModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
