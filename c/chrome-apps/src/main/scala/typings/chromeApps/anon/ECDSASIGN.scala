package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.ecdsaSign
import typings.chromeApps.chromeAppsStrings.rsaSign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ECDSASIGN extends StObject {
  
  var ECDSA_SIGN: ecdsaSign
  
  var RSA_SIGN: rsaSign
}
object ECDSASIGN {
  
  inline def apply(): ECDSASIGN = {
    val __obj = js.Dynamic.literal(ECDSA_SIGN = "ecdsaSign", RSA_SIGN = "rsaSign")
    __obj.asInstanceOf[ECDSASIGN]
  }
  
  extension [Self <: ECDSASIGN](x: Self) {
    
    inline def setECDSA_SIGN(value: ecdsaSign): Self = StObject.set(x, "ECDSA_SIGN", value.asInstanceOf[js.Any])
    
    inline def setRSA_SIGN(value: rsaSign): Self = StObject.set(x, "RSA_SIGN", value.asInstanceOf[js.Any])
  }
}
