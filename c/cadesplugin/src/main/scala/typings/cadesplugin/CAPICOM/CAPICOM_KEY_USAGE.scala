package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`16`
import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import typings.cadesplugin.cadespluginInts.`32768`
import typings.cadesplugin.cadespluginInts.`32`
import typings.cadesplugin.cadespluginInts.`4`
import typings.cadesplugin.cadespluginInts.`64`
import typings.cadesplugin.cadespluginInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_KEY_USAGE
  extends StObject
     with KeyUsagePlugin {
  
  val CAPICOM_CRL_SIGN_KEY_USAGE: `2`
  
  val CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE: `16`
  
  val CAPICOM_DECIPHER_ONLY_KEY_USAGE: `32768`
  
  val CAPICOM_ENCIPHER_ONLY_KEY_USAGE: `1`
  
  val CAPICOM_KEY_AGREEMENT_KEY_USAGE: `8`
  
  val CAPICOM_KEY_CERT_SIGN_KEY_USAGE: `4`
  
  val CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE: `32`
  
  val CAPICOM_NON_REPUDIATION_KEY_USAGE: `64`
  
  val CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE: `2`
}
object CAPICOM_KEY_USAGE {
  
  inline def apply(): CAPICOM_KEY_USAGE = {
    val __obj = js.Dynamic.literal(CAPICOM_CRL_SIGN_KEY_USAGE = 2, CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE = 16, CAPICOM_DECIPHER_ONLY_KEY_USAGE = 32768, CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE = 128, CAPICOM_ENCIPHER_ONLY_KEY_USAGE = 1, CAPICOM_KEY_AGREEMENT_KEY_USAGE = 8, CAPICOM_KEY_CERT_SIGN_KEY_USAGE = 4, CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE = 32, CAPICOM_NON_REPUDIATION_KEY_USAGE = 64, CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE = 2)
    __obj.asInstanceOf[CAPICOM_KEY_USAGE]
  }
  
  extension [Self <: CAPICOM_KEY_USAGE](x: Self) {
    
    inline def setCAPICOM_CRL_SIGN_KEY_USAGE(value: `2`): Self = StObject.set(x, "CAPICOM_CRL_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_DATA_ENCIPHERMENT_KEY_USAGE(value: `16`): Self = StObject.set(x, "CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_DECIPHER_ONLY_KEY_USAGE(value: `32768`): Self = StObject.set(x, "CAPICOM_DECIPHER_ONLY_KEY_USAGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_ENCIPHER_ONLY_KEY_USAGE(value: `1`): Self = StObject.set(x, "CAPICOM_ENCIPHER_ONLY_KEY_USAGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_KEY_AGREEMENT_KEY_USAGE(value: `8`): Self = StObject.set(x, "CAPICOM_KEY_AGREEMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_KEY_CERT_SIGN_KEY_USAGE(value: `4`): Self = StObject.set(x, "CAPICOM_KEY_CERT_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_KEY_ENCIPHERMENT_KEY_USAGE(value: `32`): Self = StObject.set(x, "CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_NON_REPUDIATION_KEY_USAGE(value: `64`): Self = StObject.set(x, "CAPICOM_NON_REPUDIATION_KEY_USAGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE(value: `2`): Self = StObject.set(x, "CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
  }
}
