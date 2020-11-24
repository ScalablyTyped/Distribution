package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFabricAttributes extends js.Object {
  
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
  implicit class NetworkFabricAttributesOps[Self <: NetworkFabricAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEdition(value: Edition): Self = this.set("Edition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEdition: Self = this.set("Edition", js.undefined)
    
    @scala.inline
    def setOrderingServiceEndpoint(value: String): Self = this.set("OrderingServiceEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderingServiceEndpoint: Self = this.set("OrderingServiceEndpoint", js.undefined)
  }
}
