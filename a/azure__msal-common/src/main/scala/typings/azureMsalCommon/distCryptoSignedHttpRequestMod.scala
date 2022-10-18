package typings.azureMsalCommon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCryptoSignedHttpRequestMod {
  
  trait SignedHttpRequest extends StObject {
    
    var at: js.UndefOr[String] = js.undefined
    
    var client_claims: js.UndefOr[String] = js.undefined
    
    var cnf: js.UndefOr[js.Object] = js.undefined
    
    var m: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var p: js.UndefOr[String] = js.undefined
    
    var q: js.UndefOr[js.Tuple2[js.Array[String], String]] = js.undefined
    
    var ts: js.UndefOr[Double] = js.undefined
    
    var u: js.UndefOr[String] = js.undefined
  }
  object SignedHttpRequest {
    
    inline def apply(): SignedHttpRequest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignedHttpRequest]
    }
    
    extension [Self <: SignedHttpRequest](x: Self) {
      
      inline def setAt(value: String): Self = StObject.set(x, "at", value.asInstanceOf[js.Any])
      
      inline def setAtUndefined: Self = StObject.set(x, "at", js.undefined)
      
      inline def setClient_claims(value: String): Self = StObject.set(x, "client_claims", value.asInstanceOf[js.Any])
      
      inline def setClient_claimsUndefined: Self = StObject.set(x, "client_claims", js.undefined)
      
      inline def setCnf(value: js.Object): Self = StObject.set(x, "cnf", value.asInstanceOf[js.Any])
      
      inline def setCnfUndefined: Self = StObject.set(x, "cnf", js.undefined)
      
      inline def setM(value: String): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
      
      inline def setMUndefined: Self = StObject.set(x, "m", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setP(value: String): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
      
      inline def setPUndefined: Self = StObject.set(x, "p", js.undefined)
      
      inline def setQ(value: js.Tuple2[js.Array[String], String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
      
      inline def setTsUndefined: Self = StObject.set(x, "ts", js.undefined)
      
      inline def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setUUndefined: Self = StObject.set(x, "u", js.undefined)
    }
  }
}
