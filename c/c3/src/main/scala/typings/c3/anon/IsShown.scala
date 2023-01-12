package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsShown extends StObject {
  
  /**
    * Hides sub chart.
    */
  def hide(): Unit
  
  /**
    * Returns true if the sub chart is shown.
    */
  def isShown(): Boolean
  
  /**
    * Shows sub chart at the bottom of the chart.
    */
  def show(): Unit
}
object IsShown {
  
  inline def apply(hide: () => Unit, isShown: () => Boolean, show: () => Unit): IsShown = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isShown = js.Any.fromFunction0(isShown), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[IsShown]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IsShown] (val x: Self) extends AnyVal {
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIsShown(value: () => Boolean): Self = StObject.set(x, "isShown", js.Any.fromFunction0(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
