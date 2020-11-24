package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginSslProtocols extends js.Object {
  
  /**
    * A list that contains allowed SSL/TLS protocols for this distribution.
    */
  var Items: SslProtocolsList = js.native
  
  /**
    * The number of SSL/TLS protocols that you want to allow CloudFront to use when establishing an HTTPS connection with this origin. 
    */
  var Quantity: integer = js.native
}
object OriginSslProtocols {
  
  @scala.inline
  def apply(Items: SslProtocolsList, Quantity: integer): OriginSslProtocols = {
    val __obj = js.Dynamic.literal(Items = Items.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginSslProtocols]
  }
  
  @scala.inline
  implicit class OriginSslProtocolsOps[Self <: OriginSslProtocols] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setItemsVarargs(value: SslProtocol*): Self = this.set("Items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: SslProtocolsList): Self = this.set("Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuantity(value: integer): Self = this.set("Quantity", value.asInstanceOf[js.Any])
  }
}
