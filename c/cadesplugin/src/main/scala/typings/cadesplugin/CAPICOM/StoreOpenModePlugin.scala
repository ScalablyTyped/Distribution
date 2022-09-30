package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOpenModePlugin extends StObject {
  
  val CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED: `2`
}
object StoreOpenModePlugin {
  
  inline def apply(): StoreOpenModePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED = 2)
    __obj.asInstanceOf[StoreOpenModePlugin]
  }
  
  extension [Self <: StoreOpenModePlugin](x: Self) {
    
    inline def setCAPICOM_STORE_OPEN_MAXIMUM_ALLOWED(value: `2`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED", value.asInstanceOf[js.Any])
  }
}
