package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EKUPlugin extends StObject {
  
  val CAPICOM_EKU_CLIENT_AUTH: `2` = js.native
  
  val CAPICOM_EKU_OTHER: `0` = js.native
  
  val CAPICOM_EKU_SMARTCARD_LOGON: `5` = js.native
}
object EKUPlugin {
  
  @scala.inline
  def apply(CAPICOM_EKU_CLIENT_AUTH: `2`, CAPICOM_EKU_OTHER: `0`, CAPICOM_EKU_SMARTCARD_LOGON: `5`): EKUPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_EKU_CLIENT_AUTH = CAPICOM_EKU_CLIENT_AUTH.asInstanceOf[js.Any], CAPICOM_EKU_OTHER = CAPICOM_EKU_OTHER.asInstanceOf[js.Any], CAPICOM_EKU_SMARTCARD_LOGON = CAPICOM_EKU_SMARTCARD_LOGON.asInstanceOf[js.Any])
    __obj.asInstanceOf[EKUPlugin]
  }
  
  @scala.inline
  implicit class EKUPluginMutableBuilder[Self <: EKUPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_EKU_CLIENT_AUTH(value: `2`): Self = StObject.set(x, "CAPICOM_EKU_CLIENT_AUTH", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_EKU_OTHER(value: `0`): Self = StObject.set(x, "CAPICOM_EKU_OTHER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_EKU_SMARTCARD_LOGON(value: `5`): Self = StObject.set(x, "CAPICOM_EKU_SMARTCARD_LOGON", value.asInstanceOf[js.Any])
  }
}
