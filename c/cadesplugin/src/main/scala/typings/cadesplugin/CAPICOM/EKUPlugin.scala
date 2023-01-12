package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`2`
import typings.cadesplugin.cadespluginInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EKUPlugin extends StObject {
  
  val CAPICOM_EKU_CLIENT_AUTH: `2`
  
  val CAPICOM_EKU_OTHER: `0`
  
  val CAPICOM_EKU_SMARTCARD_LOGON: `5`
}
object EKUPlugin {
  
  inline def apply(): EKUPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_EKU_CLIENT_AUTH = 2, CAPICOM_EKU_OTHER = 0, CAPICOM_EKU_SMARTCARD_LOGON = 5)
    __obj.asInstanceOf[EKUPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EKUPlugin] (val x: Self) extends AnyVal {
    
    inline def setCAPICOM_EKU_CLIENT_AUTH(value: `2`): Self = StObject.set(x, "CAPICOM_EKU_CLIENT_AUTH", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_EKU_OTHER(value: `0`): Self = StObject.set(x, "CAPICOM_EKU_OTHER", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_EKU_SMARTCARD_LOGON(value: `5`): Self = StObject.set(x, "CAPICOM_EKU_SMARTCARD_LOGON", value.asInstanceOf[js.Any])
  }
}
