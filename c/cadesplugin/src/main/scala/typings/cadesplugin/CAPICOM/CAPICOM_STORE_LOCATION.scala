package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`0`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import typings.cadesplugin.cadespluginNumbers.`3`
import typings.cadesplugin.cadespluginNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAPICOM_STORE_LOCATION extends StObject {
  
  val CAPICOM_ACTIVE_DIRECTORY_USER_STORE: `3` = js.native
  
  val CAPICOM_CURRENT_USER_STORE: `2` = js.native
  
  val CAPICOM_LOCAL_MACHINE_STORE: `1` = js.native
  
  val CAPICOM_MEMORY_STORE: `0` = js.native
  
  val CAPICOM_SMART_CARD_USER_STORE: `4` = js.native
}
object CAPICOM_STORE_LOCATION {
  
  @scala.inline
  def apply(
    CAPICOM_ACTIVE_DIRECTORY_USER_STORE: `3`,
    CAPICOM_CURRENT_USER_STORE: `2`,
    CAPICOM_LOCAL_MACHINE_STORE: `1`,
    CAPICOM_MEMORY_STORE: `0`,
    CAPICOM_SMART_CARD_USER_STORE: `4`
  ): CAPICOM_STORE_LOCATION = {
    val __obj = js.Dynamic.literal(CAPICOM_ACTIVE_DIRECTORY_USER_STORE = CAPICOM_ACTIVE_DIRECTORY_USER_STORE.asInstanceOf[js.Any], CAPICOM_CURRENT_USER_STORE = CAPICOM_CURRENT_USER_STORE.asInstanceOf[js.Any], CAPICOM_LOCAL_MACHINE_STORE = CAPICOM_LOCAL_MACHINE_STORE.asInstanceOf[js.Any], CAPICOM_MEMORY_STORE = CAPICOM_MEMORY_STORE.asInstanceOf[js.Any], CAPICOM_SMART_CARD_USER_STORE = CAPICOM_SMART_CARD_USER_STORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[CAPICOM_STORE_LOCATION]
  }
  
  @scala.inline
  implicit class CAPICOM_STORE_LOCATIONMutableBuilder[Self <: CAPICOM_STORE_LOCATION] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_ACTIVE_DIRECTORY_USER_STORE(value: `3`): Self = StObject.set(x, "CAPICOM_ACTIVE_DIRECTORY_USER_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_CURRENT_USER_STORE(value: `2`): Self = StObject.set(x, "CAPICOM_CURRENT_USER_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_LOCAL_MACHINE_STORE(value: `1`): Self = StObject.set(x, "CAPICOM_LOCAL_MACHINE_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_MEMORY_STORE(value: `0`): Self = StObject.set(x, "CAPICOM_MEMORY_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_SMART_CARD_USER_STORE(value: `4`): Self = StObject.set(x, "CAPICOM_SMART_CARD_USER_STORE", value.asInstanceOf[js.Any])
  }
}
