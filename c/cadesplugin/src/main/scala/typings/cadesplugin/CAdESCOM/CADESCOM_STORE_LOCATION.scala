package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`100`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESCOM_STORE_LOCATION extends StoreLocationPlugin {
  
  val CADESCOM_ACTIVE_DIRECTORY_USER_STORE: `3` = js.native
  
  val CADESCOM_MEMORY_STORE: `0` = js.native
  
  val CADESCOM_SMART_CARD_USER_STORE: `4` = js.native
}
object CADESCOM_STORE_LOCATION {
  
  @scala.inline
  def apply(
    CADESCOM_ACTIVE_DIRECTORY_USER_STORE: `3`,
    CADESCOM_CONTAINER_STORE: `100`,
    CADESCOM_CURRENT_USER_STORE: `2`,
    CADESCOM_LOCAL_MACHINE_STORE: `1`,
    CADESCOM_MEMORY_STORE: `0`,
    CADESCOM_SMART_CARD_USER_STORE: `4`
  ): CADESCOM_STORE_LOCATION = {
    val __obj = js.Dynamic.literal(CADESCOM_ACTIVE_DIRECTORY_USER_STORE = CADESCOM_ACTIVE_DIRECTORY_USER_STORE.asInstanceOf[js.Any], CADESCOM_CONTAINER_STORE = CADESCOM_CONTAINER_STORE.asInstanceOf[js.Any], CADESCOM_CURRENT_USER_STORE = CADESCOM_CURRENT_USER_STORE.asInstanceOf[js.Any], CADESCOM_LOCAL_MACHINE_STORE = CADESCOM_LOCAL_MACHINE_STORE.asInstanceOf[js.Any], CADESCOM_MEMORY_STORE = CADESCOM_MEMORY_STORE.asInstanceOf[js.Any], CADESCOM_SMART_CARD_USER_STORE = CADESCOM_SMART_CARD_USER_STORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADESCOM_STORE_LOCATION]
  }
  
  @scala.inline
  implicit class CADESCOM_STORE_LOCATIONMutableBuilder[Self <: CADESCOM_STORE_LOCATION] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCADESCOM_ACTIVE_DIRECTORY_USER_STORE(value: `3`): Self = StObject.set(x, "CADESCOM_ACTIVE_DIRECTORY_USER_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_MEMORY_STORE(value: `0`): Self = StObject.set(x, "CADESCOM_MEMORY_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_SMART_CARD_USER_STORE(value: `4`): Self = StObject.set(x, "CADESCOM_SMART_CARD_USER_STORE", value.asInstanceOf[js.Any])
  }
}
