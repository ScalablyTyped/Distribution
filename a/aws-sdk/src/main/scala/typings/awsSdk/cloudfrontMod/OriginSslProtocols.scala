package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginSslProtocols extends StObject {
  
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
  implicit class OriginSslProtocolsMutableBuilder[Self <: OriginSslProtocols] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: SslProtocolsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: SslProtocol*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
