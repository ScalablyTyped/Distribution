package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`0`
import typings.cadesplugin.cadespluginInts.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OIDPlugin extends StObject {
  
  val CAPICOM_OID_KEY_USAGE_EXTENSION: `10`
  
  val CAPICOM_OID_OTHER: `0`
}
object OIDPlugin {
  
  inline def apply(): OIDPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_OID_KEY_USAGE_EXTENSION = 10, CAPICOM_OID_OTHER = 0)
    __obj.asInstanceOf[OIDPlugin]
  }
  
  extension [Self <: OIDPlugin](x: Self) {
    
    inline def setCAPICOM_OID_KEY_USAGE_EXTENSION(value: `10`): Self = StObject.set(x, "CAPICOM_OID_KEY_USAGE_EXTENSION", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_OID_OTHER(value: `0`): Self = StObject.set(x, "CAPICOM_OID_OTHER", value.asInstanceOf[js.Any])
  }
}
