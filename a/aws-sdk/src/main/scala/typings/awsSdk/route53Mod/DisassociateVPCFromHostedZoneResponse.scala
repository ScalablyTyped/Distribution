package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateVPCFromHostedZoneResponse extends StObject {
  
  /**
    * A complex type that describes the changes made to the specified private hosted zone.
    */
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo
}
object DisassociateVPCFromHostedZoneResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): DisassociateVPCFromHostedZoneResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateVPCFromHostedZoneResponse]
  }
  
  extension [Self <: DisassociateVPCFromHostedZoneResponse](x: Self) {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
