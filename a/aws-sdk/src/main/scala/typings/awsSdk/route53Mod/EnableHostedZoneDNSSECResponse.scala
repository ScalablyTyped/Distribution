package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableHostedZoneDNSSECResponse extends StObject {
  
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo
}
object EnableHostedZoneDNSSECResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): EnableHostedZoneDNSSECResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableHostedZoneDNSSECResponse]
  }
  
  extension [Self <: EnableHostedZoneDNSSECResponse](x: Self) {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
