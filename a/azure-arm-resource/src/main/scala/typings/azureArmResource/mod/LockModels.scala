package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LockModels {
  
  @JSImport("azure-arm-resource", "LockModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.azureArmResource.lockModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "LockModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.azureArmResource.lockModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
