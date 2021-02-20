package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeLogPublishingConfiguration extends StObject {
  
  /**
    * Configuration properties for logging events associated with a node that is owned by a member of a Managed Blockchain network using the Hyperledger Fabric framework.
    */
  var Fabric: js.UndefOr[NodeFabricLogPublishingConfiguration] = js.native
}
object NodeLogPublishingConfiguration {
  
  @scala.inline
  def apply(): NodeLogPublishingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeLogPublishingConfiguration]
  }
  
  @scala.inline
  implicit class NodeLogPublishingConfigurationMutableBuilder[Self <: NodeLogPublishingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFabric(value: NodeFabricLogPublishingConfiguration): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
