package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeFrameworkAttributes extends StObject {
  
  /**
    * Attributes of Hyperledger Fabric for a peer node on a Managed Blockchain network that uses Hyperledger Fabric.
    */
  var Fabric: js.UndefOr[NodeFabricAttributes] = js.native
}
object NodeFrameworkAttributes {
  
  @scala.inline
  def apply(): NodeFrameworkAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeFrameworkAttributes]
  }
  
  @scala.inline
  implicit class NodeFrameworkAttributesMutableBuilder[Self <: NodeFrameworkAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFabric(value: NodeFabricAttributes): Self = StObject.set(x, "Fabric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFabricUndefined: Self = StObject.set(x, "Fabric", js.undefined)
  }
}
