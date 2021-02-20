package typings.cadesplugin.CAdESCOM

import typings.cadesplugin.cadespluginNumbers.`100`
import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreLocationPlugin extends StObject {
  
  val CADESCOM_CONTAINER_STORE: `100` = js.native
  
  val CADESCOM_CURRENT_USER_STORE: `2` = js.native
  
  val CADESCOM_LOCAL_MACHINE_STORE: `1` = js.native
}
object StoreLocationPlugin {
  
  @scala.inline
  def apply(
    CADESCOM_CONTAINER_STORE: `100`,
    CADESCOM_CURRENT_USER_STORE: `2`,
    CADESCOM_LOCAL_MACHINE_STORE: `1`
  ): StoreLocationPlugin = {
    val __obj = js.Dynamic.literal(CADESCOM_CONTAINER_STORE = CADESCOM_CONTAINER_STORE.asInstanceOf[js.Any], CADESCOM_CURRENT_USER_STORE = CADESCOM_CURRENT_USER_STORE.asInstanceOf[js.Any], CADESCOM_LOCAL_MACHINE_STORE = CADESCOM_LOCAL_MACHINE_STORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreLocationPlugin]
  }
  
  @scala.inline
  implicit class StoreLocationPluginMutableBuilder[Self <: StoreLocationPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCADESCOM_CONTAINER_STORE(value: `100`): Self = StObject.set(x, "CADESCOM_CONTAINER_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_CURRENT_USER_STORE(value: `2`): Self = StObject.set(x, "CADESCOM_CURRENT_USER_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADESCOM_LOCAL_MACHINE_STORE(value: `1`): Self = StObject.set(x, "CADESCOM_LOCAL_MACHINE_STORE", value.asInstanceOf[js.Any])
  }
}
