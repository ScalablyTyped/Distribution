package typings.awsSdk.cloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

