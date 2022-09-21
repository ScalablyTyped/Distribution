package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateKeySigningKeyResponse extends StObject {
  
  var ChangeInfo: typings.awsSdk.route53Mod.ChangeInfo
}
object ActivateKeySigningKeyResponse {
  
  inline def apply(ChangeInfo: ChangeInfo): ActivateKeySigningKeyResponse = {
    val __obj = js.Dynamic.literal(ChangeInfo = ChangeInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateKeySigningKeyResponse]
  }
  
  extension [Self <: ActivateKeySigningKeyResponse](x: Self) {
    
    inline def setChangeInfo(value: ChangeInfo): Self = StObject.set(x, "ChangeInfo", value.asInstanceOf[js.Any])
  }
}
