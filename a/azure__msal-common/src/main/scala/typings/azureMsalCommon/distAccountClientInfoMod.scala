package typings.azureMsalCommon

import typings.azureMsalCommon.distCryptoIcryptoMod.ICrypto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distAccountClientInfoMod {
  
  @JSImport("@azure/msal-common/dist/account/ClientInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildClientInfo(rawClientInfo: String, crypto: ICrypto): ClientInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("buildClientInfo")(rawClientInfo.asInstanceOf[js.Any], crypto.asInstanceOf[js.Any])).asInstanceOf[ClientInfo]
  
  inline def buildClientInfoFromHomeAccountId(homeAccountId: String): ClientInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClientInfoFromHomeAccountId")(homeAccountId.asInstanceOf[js.Any]).asInstanceOf[ClientInfo]
  
  trait ClientInfo extends StObject {
    
    var uid: String
    
    var utid: String
  }
  object ClientInfo {
    
    inline def apply(uid: String, utid: String): ClientInfo = {
      val __obj = js.Dynamic.literal(uid = uid.asInstanceOf[js.Any], utid = utid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClientInfo] (val x: Self) extends AnyVal {
      
      inline def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
      
      inline def setUtid(value: String): Self = StObject.set(x, "utid", value.asInstanceOf[js.Any])
    }
  }
}
