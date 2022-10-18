package typings.c3.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsShown extends StObject {
  
  /**
    * Hides sub chart.
    */
  def hide(): scala.Unit
  
  /**
    * Returns true if the sub chart is shown.
    */
  def isShown(): Boolean
  
  /**
    * Shows sub chart at the bottom of the chart.
    */
  def show(): scala.Unit
}
object IsShown {
  
  inline def apply(hide: () => scala.Unit, isShown: () => Boolean, show: () => scala.Unit): IsShown = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), isShown = js.Any.fromFunction0(isShown), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[IsShown]
  }
  
  extension [Self <: IsShown](x: Self) {
    
    inline def setHide(value: () => scala.Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setIsShown(value: () => Boolean): Self = StObject.set(x, "isShown", js.Any.fromFunction0(value))
    
    inline def setShow(value: () => scala.Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
