package typings.azureArmResource.mod

import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ManagementGroupsModels {
  
  @JSImport("azure-arm-resource", "ManagementGroupsModels.BaseResource")
  @js.native
  open class BaseResource ()
    extends typings.azureArmResource.managementModelsMod.BaseResource
  
  @JSImport("azure-arm-resource", "ManagementGroupsModels.CloudError")
  @js.native
  open class CloudError protected ()
    extends typings.azureArmResource.managementModelsMod.CloudError {
    def this(parameters: CloudErrorParameters) = this()
  }
}
