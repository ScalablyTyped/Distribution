package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import typings.cadesplugin.cadespluginNumbers.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_EKU extends StObject {
  
  val CAPICOM_EKU_CODE_SIGNING: `3` = js.native
  
  val CAPICOM_EKU_EMAIL_PROTECTION: `4` = js.native
  
  val CAPICOM_EKU_ENCRYPTING_FILE_SYSTEM: `6` = js.native
  
  val CAPICOM_EKU_SERVER_AUTH: `1` = js.native
}
object CAPICOM_EKU {
  
  @scala.inline
  def apply(
    CAPICOM_EKU_CODE_SIGNING: `3`,
    CAPICOM_EKU_EMAIL_PROTECTION: `4`,
    CAPICOM_EKU_ENCRYPTING_FILE_SYSTEM: `6`,
    CAPICOM_EKU_SERVER_AUTH: `1`
  ): CAPICOM_EKU = {
    val __obj = js.Dynamic.literal(CAPICOM_EKU_CODE_SIGNING = CAPICOM_EKU_CODE_SIGNING.asInstanceOf[js.Any], CAPICOM_EKU_EMAIL_PROTECTION = CAPICOM_EKU_EMAIL_PROTECTION.asInstanceOf[js.Any], CAPICOM_EKU_ENCRYPTING_FILE_SYSTEM = CAPICOM_EKU_ENCRYPTING_FILE_SYSTEM.asInstanceOf[js.Any], CAPICOM_EKU_SERVER_AUTH = CAPICOM_EKU_SERVER_AUTH.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_EKU]
  }
  
  @scala.inline
  implicit class CAPICOM_EKUMutableBuilder[Self <: CAPICOM_EKU] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_EKU_CODE_SIGNING(value: `3`): Self = StObject.set(x, "CAPICOM_EKU_CODE_SIGNING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_EKU_EMAIL_PROTECTION(value: `4`): Self = StObject.set(x, "CAPICOM_EKU_EMAIL_PROTECTION", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_EKU_ENCRYPTING_FILE_SYSTEM(value: `6`): Self = StObject.set(x, "CAPICOM_EKU_ENCRYPTING_FILE_SYSTEM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_EKU_SERVER_AUTH(value: `1`): Self = StObject.set(x, "CAPICOM_EKU_SERVER_AUTH", value.asInstanceOf[js.Any])
  }
}
