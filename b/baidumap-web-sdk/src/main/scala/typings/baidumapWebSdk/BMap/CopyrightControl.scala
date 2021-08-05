package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyrightControl
  extends StObject
     with Control {
  
  def addCopyright(copyright: Copyright): Unit
  
  def getCopyright(id: Double): Copyright
  
  def getCopyrightCollection(): js.Array[Copyright]
  
  def removeCopyright(id: Double): Unit
}
object CopyrightControl {
  
  inline def apply(
    addCopyright: Copyright => Unit,
    defaultAnchor: ControlAnchor,
    defaultOffset: Size,
    getAnchor: () => ControlAnchor,
    getContainer: () => js.UndefOr[HTMLElement],
    getCopyright: Double => Copyright,
    getCopyrightCollection: () => js.Array[Copyright],
    getOffset: () => Size,
    hide: () => Unit,
    initialize: Map => HTMLElement,
    isVisible: () => Boolean,
    removeCopyright: Double => Unit,
    setAnchor: ControlAnchor => Unit,
    setOffset: Size => Unit,
    show: () => Unit
  ): CopyrightControl = {
    val __obj = js.Dynamic.literal(addCopyright = js.Any.fromFunction1(addCopyright), defaultAnchor = defaultAnchor.asInstanceOf[js.Any], defaultOffset = defaultOffset.asInstanceOf[js.Any], getAnchor = js.Any.fromFunction0(getAnchor), getContainer = js.Any.fromFunction0(getContainer), getCopyright = js.Any.fromFunction1(getCopyright), getCopyrightCollection = js.Any.fromFunction0(getCopyrightCollection), getOffset = js.Any.fromFunction0(getOffset), hide = js.Any.fromFunction0(hide), initialize = js.Any.fromFunction1(initialize), isVisible = js.Any.fromFunction0(isVisible), removeCopyright = js.Any.fromFunction1(removeCopyright), setAnchor = js.Any.fromFunction1(setAnchor), setOffset = js.Any.fromFunction1(setOffset), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[CopyrightControl]
  }
  
  extension [Self <: CopyrightControl](x: Self) {
    
    inline def setAddCopyright(value: Copyright => Unit): Self = StObject.set(x, "addCopyright", js.Any.fromFunction1(value))
    
    inline def setGetCopyright(value: Double => Copyright): Self = StObject.set(x, "getCopyright", js.Any.fromFunction1(value))
    
    inline def setGetCopyrightCollection(value: () => js.Array[Copyright]): Self = StObject.set(x, "getCopyrightCollection", js.Any.fromFunction0(value))
    
    inline def setRemoveCopyright(value: Double => Unit): Self = StObject.set(x, "removeCopyright", js.Any.fromFunction1(value))
  }
}
