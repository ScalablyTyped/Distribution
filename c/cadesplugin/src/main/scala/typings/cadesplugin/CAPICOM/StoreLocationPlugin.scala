package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreLocationPlugin extends StObject {
  
  val CAPICOM_CURRENT_USER_STORE: `2`
  
  val CAPICOM_LOCAL_MACHINE_STORE: `1`
}
object StoreLocationPlugin {
  
  inline def apply(): StoreLocationPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_CURRENT_USER_STORE = 2, CAPICOM_LOCAL_MACHINE_STORE = 1)
    __obj.asInstanceOf[StoreLocationPlugin]
  }
  
  extension [Self <: StoreLocationPlugin](x: Self) {
    
    inline def setCAPICOM_CURRENT_USER_STORE(value: `2`): Self = StObject.set(x, "CAPICOM_CURRENT_USER_STORE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_LOCAL_MACHINE_STORE(value: `1`): Self = StObject.set(x, "CAPICOM_LOCAL_MACHINE_STORE", value.asInstanceOf[js.Any])
  }
}
