package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CADESCOM_STORE_LOCATION
  extends StObject
     with StoreLocationPlugin {
  
  val CADESCOM_ACTIVE_DIRECTORY_USER_STORE: `3`
  
  val CADESCOM_MEMORY_STORE: `0`
  
  val CADESCOM_SMART_CARD_USER_STORE: `4`
}
object CADESCOM_STORE_LOCATION {
  
  inline def apply(): CADESCOM_STORE_LOCATION = {
    val __obj = js.Dynamic.literal(CADESCOM_ACTIVE_DIRECTORY_USER_STORE = 3, CADESCOM_CONTAINER_STORE = 100, CADESCOM_CURRENT_USER_STORE = 2, CADESCOM_LOCAL_MACHINE_STORE = 1, CADESCOM_MEMORY_STORE = 0, CADESCOM_SMART_CARD_USER_STORE = 4)
    __obj.asInstanceOf[CADESCOM_STORE_LOCATION]
  }
  
  extension [Self <: CADESCOM_STORE_LOCATION](x: Self) {
    
    inline def setCADESCOM_ACTIVE_DIRECTORY_USER_STORE(value: `3`): Self = StObject.set(x, "CADESCOM_ACTIVE_DIRECTORY_USER_STORE", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_MEMORY_STORE(value: `0`): Self = StObject.set(x, "CADESCOM_MEMORY_STORE", value.asInstanceOf[js.Any])
    
    inline def setCADESCOM_SMART_CARD_USER_STORE(value: `4`): Self = StObject.set(x, "CADESCOM_SMART_CARD_USER_STORE", value.asInstanceOf[js.Any])
  }
}
