package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`128`
import typings.cadesplugin.cadespluginNumbers.`16`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`32768`
import typings.cadesplugin.cadespluginNumbers.`32`
import typings.cadesplugin.cadespluginNumbers.`4`
import typings.cadesplugin.cadespluginNumbers.`64`
import typings.cadesplugin.cadespluginNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_KEY_USAGE extends KeyUsagePlugin {
  
  val CAPICOM_CRL_SIGN_KEY_USAGE: `2` = js.native
  
  val CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE: `16` = js.native
  
  val CAPICOM_DECIPHER_ONLY_KEY_USAGE: `32768` = js.native
  
  val CAPICOM_ENCIPHER_ONLY_KEY_USAGE: `1` = js.native
  
  val CAPICOM_KEY_AGREEMENT_KEY_USAGE: `8` = js.native
  
  val CAPICOM_KEY_CERT_SIGN_KEY_USAGE: `4` = js.native
  
  val CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE: `32` = js.native
  
  val CAPICOM_NON_REPUDIATION_KEY_USAGE: `64` = js.native
  
  val CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE: `2` = js.native
}
object CAPICOM_KEY_USAGE {
  
  @scala.inline
  def apply(
    CAPICOM_CRL_SIGN_KEY_USAGE: `2`,
    CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE: `16`,
    CAPICOM_DECIPHER_ONLY_KEY_USAGE: `32768`,
    CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE: `128`,
    CAPICOM_ENCIPHER_ONLY_KEY_USAGE: `1`,
    CAPICOM_KEY_AGREEMENT_KEY_USAGE: `8`,
    CAPICOM_KEY_CERT_SIGN_KEY_USAGE: `4`,
    CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE: `32`,
    CAPICOM_NON_REPUDIATION_KEY_USAGE: `64`,
    CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE: `2`
  ): CAPICOM_KEY_USAGE = {
    val __obj = js.Dynamic.literal(CAPICOM_CRL_SIGN_KEY_USAGE = CAPICOM_CRL_SIGN_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE = CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_DECIPHER_ONLY_KEY_USAGE = CAPICOM_DECIPHER_ONLY_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE = CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_ENCIPHER_ONLY_KEY_USAGE = CAPICOM_ENCIPHER_ONLY_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_KEY_AGREEMENT_KEY_USAGE = CAPICOM_KEY_AGREEMENT_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_KEY_CERT_SIGN_KEY_USAGE = CAPICOM_KEY_CERT_SIGN_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE = CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_NON_REPUDIATION_KEY_USAGE = CAPICOM_NON_REPUDIATION_KEY_USAGE.asInstanceOf[js.Any], CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE = CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_KEY_USAGE]
  }
  
  @scala.inline
  implicit class CAPICOM_KEY_USAGEOps[Self <: CAPICOM_KEY_USAGE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCAPICOM_CRL_SIGN_KEY_USAGE(value: `2`): Self = this.set("CAPICOM_CRL_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_DATA_ENCIPHERMENT_KEY_USAGE(value: `16`): Self = this.set("CAPICOM_DATA_ENCIPHERMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_DECIPHER_ONLY_KEY_USAGE(value: `32768`): Self = this.set("CAPICOM_DECIPHER_ONLY_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_ENCIPHER_ONLY_KEY_USAGE(value: `1`): Self = this.set("CAPICOM_ENCIPHER_ONLY_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_KEY_AGREEMENT_KEY_USAGE(value: `8`): Self = this.set("CAPICOM_KEY_AGREEMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_KEY_CERT_SIGN_KEY_USAGE(value: `4`): Self = this.set("CAPICOM_KEY_CERT_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_KEY_ENCIPHERMENT_KEY_USAGE(value: `32`): Self = this.set("CAPICOM_KEY_ENCIPHERMENT_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_NON_REPUDIATION_KEY_USAGE(value: `64`): Self = this.set("CAPICOM_NON_REPUDIATION_KEY_USAGE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE(value: `2`): Self = this.set("CAPICOM_OFFLINE_CRL_SIGN_KEY_USAGE", value.asInstanceOf[js.Any])
  }
}
