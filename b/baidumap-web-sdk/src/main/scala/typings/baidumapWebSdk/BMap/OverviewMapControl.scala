package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.IsOpen
import typings.baidumapWebSdk.anon.Target
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverviewMapControl
  extends StObject
     with Control {
  
  def changeView(): Unit
  
  def getSize(): Size
  
  def onviewchanged(event: IsOpen): Unit
  
  def onviewchanging(event: Target): Unit
  
  def setSize(size: Size): Unit
}
object OverviewMapControl {
  
  inline def apply(
    changeView: () => Unit,
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getOffset: () => Size,
    getSize: () => Size,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    onviewchanged: IsOpen => Unit,
    onviewchanging: Target => Unit,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    setSize: Size => Unit,
    show: () => Unit
  ): OverviewMapControl = {
    val __obj = js.Dynamic.literal(changeView = js.Any.fromFunction0(changeView), defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getOffset = js.Any.fromFunction0(getOffset), getSize = js.Any.fromFunction0(getSize), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), onviewchanged = js.Any.fromFunction1(onviewchanged), onviewchanging = js.Any.fromFunction1(onviewchanging), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), setSize = js.Any.fromFunction1(setSize), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[OverviewMapControl]
  }
  
  extension [Self <: OverviewMapControl](x: Self) {
    
    inline def setChangeView(value: () => Unit): Self = StObject.set(x, "changeView", js.Any.fromFunction0(value))
    
    inline def setGetSize(value: () => Size): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    inline def setOnviewchanged(value: IsOpen => Unit): Self = StObject.set(x, "onviewchanged", js.Any.fromFunction1(value))
    
    inline def setOnviewchanging(value: Target => Unit): Self = StObject.set(x, "onviewchanging", js.Any.fromFunction1(value))
    
    inline def setSetSize(value: Size => Unit): Self = StObject.set(x, "setSize", js.Any.fromFunction1(value))
  }
}
