package typings.bmapgl.BMapGL

import typings.bmapgl.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaLabel extends StObject {
  
  def addEventListener(event: String, handler: Callback): Unit
  
  def getAltitude(): Double
  
  def getContent(): String
  
  def getPosition(): Point
  
  def getPov(): PanoramaPov
  
  def hide(): Unit
  
  def onclick(event: Target): Unit
  
  def onmouseout(event: Target): Unit
  
  def onmouseover(event: Target): Unit
  
  def onremove(event: Target): Unit
  
  def removeEventListener(event: String, handler: Callback): Unit
  
  def setAltitude(altitude: Double): Unit
  
  def setContent(content: String): Unit
  
  def setPosition(position: Point): Unit
  
  def show(): Unit
}
object PanoramaLabel {
  
  inline def apply(
    addEventListener: (String, Callback) => Unit,
    getAltitude: () => Double,
    getContent: () => String,
    getPosition: () => Point,
    getPov: () => PanoramaPov,
    hide: () => Unit,
    onclick: Target => Unit,
    onmouseout: Target => Unit,
    onmouseover: Target => Unit,
    onremove: Target => Unit,
    removeEventListener: (String, Callback) => Unit,
    setAltitude: Double => Unit,
    setContent: String => Unit,
    setPosition: Point => Unit,
    show: () => Unit
  ): PanoramaLabel = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), getAltitude = js.Any.fromFunction0(getAltitude), getContent = js.Any.fromFunction0(getContent), getPosition = js.Any.fromFunction0(getPosition), getPov = js.Any.fromFunction0(getPov), hide = js.Any.fromFunction0(hide), onclick = js.Any.fromFunction1(onclick), onmouseout = js.Any.fromFunction1(onmouseout), onmouseover = js.Any.fromFunction1(onmouseover), onremove = js.Any.fromFunction1(onremove), removeEventListener = js.Any.fromFunction2(removeEventListener), setAltitude = js.Any.fromFunction1(setAltitude), setContent = js.Any.fromFunction1(setContent), setPosition = js.Any.fromFunction1(setPosition), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[PanoramaLabel]
  }
  
  extension [Self <: PanoramaLabel](x: Self) {
    
    inline def setAddEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
    
    inline def setGetAltitude(value: () => Double): Self = StObject.set(x, "getAltitude", js.Any.fromFunction0(value))
    
    inline def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetPov(value: () => PanoramaPov): Self = StObject.set(x, "getPov", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setOnclick(value: Target => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOnmouseout(value: Target => Unit): Self = StObject.set(x, "onmouseout", js.Any.fromFunction1(value))
    
    inline def setOnmouseover(value: Target => Unit): Self = StObject.set(x, "onmouseover", js.Any.fromFunction1(value))
    
    inline def setOnremove(value: Target => Unit): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    inline def setRemoveEventListener(value: (String, Callback) => Unit): Self = StObject.set(x, "removeEventListener", js.Any.fromFunction2(value))
    
    inline def setSetAltitude(value: Double => Unit): Self = StObject.set(x, "setAltitude", js.Any.fromFunction1(value))
    
    inline def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    inline def setSetPosition(value: Point => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
