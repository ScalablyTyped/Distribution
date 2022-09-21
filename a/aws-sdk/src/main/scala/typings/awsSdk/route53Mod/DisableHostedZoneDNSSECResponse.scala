package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableHostedZoneDNSSECResponse extends StObject {
  
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo
}
object DisableHostedZoneDNSSECResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): DisableHostedZoneDNSSECResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableHostedZoneDNSSECResponse]
  }
  
  extension [Self <: DisableHostedZoneDNSSECResponse](x: Self) {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
