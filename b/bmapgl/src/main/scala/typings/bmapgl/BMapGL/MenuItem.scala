package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuItem extends StObject {
  
  def disable(): Unit = js.native
  
  def enable(): Unit = js.native
  
  def setIcon(iconUrl: String): Unit = js.native
  
  def setText(text: String): Unit = js.native
}
object MenuItem {
  
  @scala.inline
  def apply(disable: () => Unit, enable: () => Unit, setIcon: String => Unit, setText: String => Unit): MenuItem = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), setIcon = js.Any.fromFunction1(setIcon), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[MenuItem]
  }
  
  @scala.inline
  implicit class MenuItemMutableBuilder[Self <: MenuItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisable(value: () => Unit): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnable(value: () => Unit): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetIcon(value: String => Unit): Self = StObject.set(x, "setIcon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
  }
}
