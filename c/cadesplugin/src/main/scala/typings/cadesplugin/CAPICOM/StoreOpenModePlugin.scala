package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOpenModePlugin extends StObject {
  
  val CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED: `2`
}
object StoreOpenModePlugin {
  
  @scala.inline
  def apply(): StoreOpenModePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED = 2)
    __obj.asInstanceOf[StoreOpenModePlugin]
  }
  
  @scala.inline
  implicit class StoreOpenModePluginMutableBuilder[Self <: StoreOpenModePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_STORE_OPEN_MAXIMUM_ALLOWED(value: `2`): Self = StObject.set(x, "CAPICOM_STORE_OPEN_MAXIMUM_ALLOWED", value.asInstanceOf[js.Any])
  }
}
