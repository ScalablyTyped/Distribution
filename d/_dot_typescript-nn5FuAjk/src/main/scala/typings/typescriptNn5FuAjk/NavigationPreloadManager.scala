package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Available only in secure contexts. */
trait NavigationPreloadManager extends StObject {
  
  def disable(): Promise[Unit]
  
  def enable(): Promise[Unit]
  
  def getState(): Promise[NavigationPreloadState]
  
  def setHeaderValue(value: java.lang.String): Promise[Unit]
}
object NavigationPreloadManager {
  
  inline def apply(
    disable: () => Promise[Unit],
    enable: () => Promise[Unit],
    getState: () => Promise[NavigationPreloadState],
    setHeaderValue: java.lang.String => Promise[Unit]
  ): NavigationPreloadManager = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), getState = js.Any.fromFunction0(getState), setHeaderValue = js.Any.fromFunction1(setHeaderValue))
    __obj.asInstanceOf[NavigationPreloadManager]
  }
  
  extension [Self <: NavigationPreloadManager](x: Self) {
    
    inline def setDisable(value: () => Promise[Unit]): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    inline def setEnable(value: () => Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    inline def setGetState(value: () => Promise[NavigationPreloadState]): Self = StObject.set(x, "getState", js.Any.fromFunction0(value))
    
    inline def setSetHeaderValue(value: java.lang.String => Promise[Unit]): Self = StObject.set(x, "setHeaderValue", js.Any.fromFunction1(value))
  }
}
