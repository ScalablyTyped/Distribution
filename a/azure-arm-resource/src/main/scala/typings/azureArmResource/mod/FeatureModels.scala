package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureModels {
  
  @JSImport("azure-arm-resource", "FeatureModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.azureArmResource.modelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "FeatureModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.azureArmResource.modelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
