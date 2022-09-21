package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayConnectRequestBgpOptions extends StObject {
  
  /**
    * The peer Autonomous System Number (ASN).
    */
  var PeerAsn: js.UndefOr[Long] = js.undefined
}
object TransitGatewayConnectRequestBgpOptions {
  
  inline def apply(): TransitGatewayConnectRequestBgpOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayConnectRequestBgpOptions]
  }
  
  extension [Self <: TransitGatewayConnectRequestBgpOptions](x: Self) {
    
    inline def setPeerAsn(value: Long): Self = StObject.set(x, "PeerAsn", value.asInstanceOf[js.Any])
    
    inline def setPeerAsnUndefined: Self = StObject.set(x, "PeerAsn", js.undefined)
  }
}
