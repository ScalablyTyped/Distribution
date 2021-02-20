package typings.cadesplugin.CAPICOM

import typings.cadesplugin.cadespluginStrings.My
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoreNamePlugin extends StObject {
  
  val CAPICOM_MY_STORE: My = js.native
}
object StoreNamePlugin {
  
  @scala.inline
  def apply(CAPICOM_MY_STORE: My): StoreNamePlugin = {
    val __obj = js.Dynamic.literal(CAPICOM_MY_STORE = CAPICOM_MY_STORE.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreNamePlugin]
  }
  
  @scala.inline
  implicit class StoreNamePluginMutableBuilder[Self <: StoreNamePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCAPICOM_MY_STORE(value: My): Self = StObject.set(x, "CAPICOM_MY_STORE", value.asInstanceOf[js.Any])
  }
}
