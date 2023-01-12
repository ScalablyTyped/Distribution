package typings.blueprintjsCore.anon

import typings.blueprintjsCore.blueprintjsCoreStrings.ADD_HOTKEYS
import typings.blueprintjsCore.blueprintjsCoreStrings.REMOVE_HOTKEYS
import typings.blueprintjsCore.libEsmContextHotkeysHotkeysProviderMod.HotkeysAction
import typings.blueprintjsCore.libEsmHooksHotkeysHotkeyConfigMod.HotkeyConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Payload
  extends StObject
     with HotkeysAction {
  
  var payload: js.Array[HotkeyConfig]
  
  var `type`: ADD_HOTKEYS | REMOVE_HOTKEYS
}
object Payload {
  
  inline def apply(payload: js.Array[HotkeyConfig], `type`: ADD_HOTKEYS | REMOVE_HOTKEYS): Payload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Payload] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: js.Array[HotkeyConfig]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadVarargs(value: HotkeyConfig*): Self = StObject.set(x, "payload", js.Array(value*))
    
    inline def setType(value: ADD_HOTKEYS | REMOVE_HOTKEYS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
