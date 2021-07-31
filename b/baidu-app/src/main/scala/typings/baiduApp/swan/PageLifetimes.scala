package typings.baiduApp.swan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 组件所在页面的生命周期声明对象，目前仅支持页面的show和hide两个生命周期
  */
trait PageLifetimes extends StObject {
  
  def hide(): Unit
  
  def show(): Unit
}
object PageLifetimes {
  
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): PageLifetimes = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PageLifetimes]
  }
  
  @scala.inline
  implicit class PageLifetimesMutableBuilder[Self <: PageLifetimes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
