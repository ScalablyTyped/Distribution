package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_KEY_SPEC extends StObject {
  
  var CAPICOM_KEY_SPEC_KEYEXCHANGE: `1`
  
  var CAPICOM_KEY_SPEC_SIGNATURE: `2`
}
object CAPICOM_KEY_SPEC {
  
  inline def apply(): CAPICOM_KEY_SPEC = {
    val __obj = js.Dynamic.literal(CAPICOM_KEY_SPEC_KEYEXCHANGE = 1, CAPICOM_KEY_SPEC_SIGNATURE = 2)
    __obj.asInstanceOf[CAPICOM_KEY_SPEC]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CAPICOM_KEY_SPEC] (val x: Self) extends AnyVal {
    
    inline def setCAPICOM_KEY_SPEC_KEYEXCHANGE(value: `1`): Self = StObject.set(x, "CAPICOM_KEY_SPEC_KEYEXCHANGE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_KEY_SPEC_SIGNATURE(value: `2`): Self = StObject.set(x, "CAPICOM_KEY_SPEC_SIGNATURE", value.asInstanceOf[js.Any])
  }
}
