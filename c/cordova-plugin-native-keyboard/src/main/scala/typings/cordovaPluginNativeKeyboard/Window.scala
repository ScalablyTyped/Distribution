package typings.cordovaPluginNativeKeyboard

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var NativeKeyboard: typings.cordovaPluginNativeKeyboard.NativeKeyboard
}
object Window {
  
  inline def apply(NativeKeyboard: NativeKeyboard): Window = {
    val __obj = js.Dynamic.literal(NativeKeyboard = NativeKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  extension [Self <: Window](x: Self) {
    
    inline def setNativeKeyboard(value: NativeKeyboard): Self = StObject.set(x, "NativeKeyboard", value.asInstanceOf[js.Any])
  }
}
