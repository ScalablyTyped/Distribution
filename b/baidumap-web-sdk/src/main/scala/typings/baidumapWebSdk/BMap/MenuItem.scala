package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  def disable(): Unit
  
  def enable(): Unit
  
  def setIcon(iconUrl: String): Unit
  
  def setText(text: String): Unit
}
object MenuItem {
  
  inline def apply(disable: () => Unit, enable: () => Unit, setIcon: String => Unit, setText: String => Unit): MenuItem = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), setIcon = js.Any.fromFunction1(setIcon), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[MenuItem]
  }
  
  extension [Self <: MenuItem](x: Self) {
    
    inline def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setSetIcon(value: String => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
