package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFabricAttributes extends StObject {
  
  /**
    * The edition of Amazon Managed Blockchain that Hyperledger Fabric uses. For more information, see Amazon Managed Blockchain Pricing.
    */
  var Edition: js.UndefOr[typings.awsSdk.managedblockchainMod.Edition] = js.native
  
  /**
    * The endpoint of the ordering service for the network.
    */
  var OrderingServiceEndpoint: js.UndefOr[String] = js.native
}
object NetworkFabricAttributes {
  
  @scala.inline
  def apply(): NetworkFabricAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFabricAttributes]
  }
  
  @scala.inline
  implicit class NetworkFabricAttributesMutableBuilder[Self <: NetworkFabricAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdition(value: Edition): Self = StObject.set(x, "Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditionUndefined: Self = StObject.set(x, "Edition", js.undefined)
    
    @scala.inline
    def setOrderingServiceEndpoint(value: String): Self = StObject.set(x, "OrderingServiceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderingServiceEndpointUndefined: Self = StObject.set(x, "OrderingServiceEndpoint", js.undefined)
  }
}
