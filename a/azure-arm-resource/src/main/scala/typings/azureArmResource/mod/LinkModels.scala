package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinkModels {
  
  @JSImport("azure-arm-resource", "LinkModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.azureArmResource.linkModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "LinkModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.azureArmResource.linkModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
