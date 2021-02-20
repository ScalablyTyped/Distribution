package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`1`
import typings.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreLocationPlugin extends StObject {
  
  val CAPICOM_CURRENT_USER_STORE: `2` = js.native
  
  val CAPICOM_LOCAL_MACHINE_STORE: `1` = js.native
}
object StoreLocationPlugin {
  
  @scala.inline
  def apply(CAPICOM_CURRENT_USER_STORE: `2`, CAPICOM_LOCAL_MACHINE_STORE: `1`): StoreLocationPlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_CURRENT_USER_STORE = CAPICOM_CURRENT_USER_STORE.asInstanceOf[js.Any], CAPICOM_LOCAL_MACHINE_STORE = CAPICOM_LOCAL_MACHINE_STORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreLocationPlugin]
  }
  
  @scala.inline
  implicit class StoreLocationPluginMutableBuilder[Self <: StoreLocationPlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_CURRENT_USER_STORE(value: `2`): Self = StObject.set(x, "CAPICOM_CURRENT_USER_STORE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPICOM_LOCAL_MACHINE_STORE(value: `1`): Self = StObject.set(x, "CAPICOM_LOCAL_MACHINE_STORE", value.asInstanceOf[js.Any])
  }
}
