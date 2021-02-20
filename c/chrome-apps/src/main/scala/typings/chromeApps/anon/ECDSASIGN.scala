package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.ecdsaSign
import typings.chromeApps.chromeAppsStrings.rsaSign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ECDSASIGN extends StObject {
  
  var ECDSA_SIGN: ecdsaSign = js.native
  
  var RSA_SIGN: rsaSign = js.native
}
object ECDSASIGN {
  
  @scala.inline
  def apply(ECDSA_SIGN: ecdsaSign, RSA_SIGN: rsaSign): ECDSASIGN = {
    val __obj = js.Dynamic.literal(ECDSA_SIGN = ECDSA_SIGN.asInstanceOf[js.Any], RSA_SIGN = RSA_SIGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECDSASIGN]
  }
  
  @scala.inline
  implicit class ECDSASIGNMutableBuilder[Self <: ECDSASIGN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setECDSA_SIGN(value: ecdsaSign): Self = StObject.set(x, "ECDSA_SIGN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSA_SIGN(value: rsaSign): Self = StObject.set(x, "RSA_SIGN", value.asInstanceOf[js.Any])
  }
}
