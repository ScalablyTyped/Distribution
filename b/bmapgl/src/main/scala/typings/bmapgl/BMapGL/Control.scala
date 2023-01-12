package typings.bmapgl.BMapGL

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
  var defaultAnchor: ControlAnchor
  
  var defaultOffset: Size
  
  def getAnchor(): ControlAnchor
  
  /** 自定义Control在add之后立马能读取到Container, 内置Control不能 */
  def getContainer(): js.UndefOr[HTMLElement]
  
  def getOffset(): Size
  
  def hide(): Unit
  
  def initialize(map: Map): HTMLElement
  
  def isVisible(): Boolean
  
  def setAnchor(anchor: ControlAnchor): Unit
  
  def setOffset(offset: Size): Unit
  
  def show(): Unit
}
object Control {
  
  inline def apply(
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    show: () => Unit
  ): Control = {
    val __obj = js.Dynamic.literal(defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    inline def setDefaultAnchor(value: ControlAnchor): Self = StObject.set(x, "defaultAnchor", value.asInstanceOf[js.Any])
    
    inline def setDefaultOffset(value: Size): Self = StObject.set(x, "defaultOffset", value.asInstanceOf[js.Any])
    
    inline def setGetAnchor(value: () => ControlAnchor): Self = StObject.set(x, "getAnchor", js.Any.fromFunction0(value))
    
    inline def setGetContainer(value: () => js.UndefOr[HTMLElement]): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
    
    inline def setGetOffset(value: () => Size): Self = StObject.set(x, "getOffset", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setInitialize(value: Map => HTMLElement): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    inline def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    inline def setSetAnchor(value: ControlAnchor => Unit): Self = StObject.set(x, "setAnchor", js.Any.fromFunction1(value))
    
    inline def setSetOffset(value: Size => Unit): Self = StObject.set(x, "setOffset", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
