package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI Functions
  * chayns.ui.modeswitch
  * interfaces
  */
// chayns.ui.modeswitch.init()
trait ModeSwitchConfig extends StObject {
  
  def callback(result: ModeSwitchItem): Unit
  
  var headline: js.UndefOr[String] = js.undefined
  
  var items: js.Array[ModeSwitchItem]
  
  var preventclose: js.UndefOr[Boolean] = js.undefined
}
object ModeSwitchConfig {
  
  inline def apply(callback: ModeSwitchItem => Unit, items: js.Array[ModeSwitchItem]): ModeSwitchConfig = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeSwitchConfig]
  }
  
  extension [Self <: ModeSwitchConfig](x: Self) {
    
    inline def setCallback(value: ModeSwitchItem => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    inline def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    inline def setItems(value: js.Array[ModeSwitchItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ModeSwitchItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setPreventclose(value: Boolean): Self = StObject.set(x, "preventclose", value.asInstanceOf[js.Any])
    
    inline def setPreventcloseUndefined: Self = StObject.set(x, "preventclose", js.undefined)
  }
}
