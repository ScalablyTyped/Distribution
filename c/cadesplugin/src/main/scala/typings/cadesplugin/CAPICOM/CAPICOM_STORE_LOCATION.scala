package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CAPICOM_STORE_LOCATION extends StObject {
  
  val CAPICOM_ACTIVE_DIRECTORY_USER_STORE: `3`
  
  val CAPICOM_CURRENT_USER_STORE: `2`
  
  val CAPICOM_LOCAL_MACHINE_STORE: `1`
  
  val CAPICOM_MEMORY_STORE: `0`
  
  val CAPICOM_SMART_CARD_USER_STORE: `4`
}
object CAPICOM_STORE_LOCATION {
  
  inline def apply(): CAPICOM_STORE_LOCATION = {
    val __obj = js.Dynamic.literal(CAPICOM_ACTIVE_DIRECTORY_USER_STORE = 3, CAPICOM_CURRENT_USER_STORE = 2, CAPICOM_LOCAL_MACHINE_STORE = 1, CAPICOM_MEMORY_STORE = 0, CAPICOM_SMART_CARD_USER_STORE = 4)
    __obj.asInstanceOf[CAPICOM_STORE_LOCATION]
  }
  
  extension [Self <: CAPICOM_STORE_LOCATION](x: Self) {
    
    inline def setCAPICOM_ACTIVE_DIRECTORY_USER_STORE(value: `3`): Self = StObject.set(x, "CAPICOM_ACTIVE_DIRECTORY_USER_STORE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_CURRENT_USER_STORE(value: `2`): Self = StObject.set(x, "CAPICOM_CURRENT_USER_STORE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_LOCAL_MACHINE_STORE(value: `1`): Self = StObject.set(x, "CAPICOM_LOCAL_MACHINE_STORE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_MEMORY_STORE(value: `0`): Self = StObject.set(x, "CAPICOM_MEMORY_STORE", value.asInstanceOf[js.Any])
    
    inline def setCAPICOM_SMART_CARD_USER_STORE(value: `4`): Self = StObject.set(x, "CAPICOM_SMART_CARD_USER_STORE", value.asInstanceOf[js.Any])
  }
}
