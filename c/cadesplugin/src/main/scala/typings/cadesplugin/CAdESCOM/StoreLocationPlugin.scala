package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginInts.`100`
import typings.cadesplugin.cadespluginInts.`1`
import typings.cadesplugin.cadespluginInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreLocationPlugin extends StObject {
  
  val CADESCOM_CONTAINER_STORE: `100`
  
  val CADESCOM_CURRENT_USER_STORE: `2`
  
  val CADESCOM_LOCAL_MACHINE_STORE: `1`
}
object StoreLocationPlugin {
  
  inline def apply(): StoreLocationPlugin = {
    val __obj = js.Dynamic.literal(CADESCOM_CONTAINER_STORE = 100, CADESCOM_CURRENT_USER_STORE = 2, CADESCOM_LOCAL_MACHINE_STORE = 1)
    __obj.asInstanceOf[StoreLocationPlugin]
  }
  
  extension [Self <: StoreLocationPlugin](x: Self) {
    
    inline def setCADESCOM_CONTAINER_STORE(value: `100`): Self = StObject.set(x, "CADESCOM_CONTAINER_STORE", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_CURRENT_USER_STORE(value: `2`): Self = StObject.set(x, "CADESCOM_CURRENT_USER_STORE", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_LOCAL_MACHINE_STORE(value: `1`): Self = StObject.set(x, "CADESCOM_LOCAL_MACHINE_STORE", value.asInstanceOf[js.Any])
  }
}
