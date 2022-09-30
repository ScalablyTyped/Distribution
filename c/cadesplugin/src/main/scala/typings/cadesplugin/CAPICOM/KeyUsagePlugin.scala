package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`128`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyUsagePlugin extends StObject {
  
  val CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE: `128`
}
object KeyUsagePlugin {
  
  inline def apply(): KeyUsagePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE = 128)
    __obj.asInstanceOf[KeyUsagePlugin]
  }
  
  extension [Self <: KeyUsagePlugin](x: Self) {
    
    inline def setCAPICOM_DIGITAL_SIGNATURE_KEY_USAGE(value: `128`): Self = StObject.set(x, "CAPICOM_DIGITAL_SIGNATURE_KEY_USAGE", value.asInstanceOf[js.Any])
  }
}
