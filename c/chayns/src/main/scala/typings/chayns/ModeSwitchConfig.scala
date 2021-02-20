package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UI Functions
  * chayns.ui.modeswitch
  * interfaces
  */
// chayns.ui.modeswitch.init()
@js.native
trait ModeSwitchConfig extends StObject {
  
  def callback(result: ModeSwitchItem): Unit = js.native
  
  var headline: js.UndefOr[String] = js.native
  
  var items: js.Array[ModeSwitchItem] = js.native
  
  var preventclose: js.UndefOr[Boolean] = js.native
}
object ModeSwitchConfig {
  
  @scala.inline
  def apply(callback: ModeSwitchItem => Unit, items: js.Array[ModeSwitchItem]): ModeSwitchConfig = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeSwitchConfig]
  }
  
  @scala.inline
  implicit class ModeSwitchConfigMutableBuilder[Self <: ModeSwitchConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCallback(value: ModeSwitchItem => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeadline(value: String): Self = StObject.set(x, "headline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadlineUndefined: Self = StObject.set(x, "headline", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[ModeSwitchItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: ModeSwitchItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPreventclose(value: Boolean): Self = StObject.set(x, "preventclose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventcloseUndefined: Self = StObject.set(x, "preventclose", js.undefined)
  }
}
