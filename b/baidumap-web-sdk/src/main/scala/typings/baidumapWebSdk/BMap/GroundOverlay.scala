package typings.baidumapWebSdk.BMap

import typings.baidumapWebSdk.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroundOverlay
  extends StObject
     with Overlay {
  
  def getBounds(): Bounds
  
  def getDispalyOnMaxLevel(): Double
  
  def getDisplayOnMinLevel(): Double
  
  def getImageURL(): String
  
  def getOpacity(): Double
  
  def onclick(event: Target): Unit
  
  def ondblclick(event: Target): Unit
  
  def setBounds(bounds: Bounds): Unit
  
  def setDispalyOnMaxLevel(level: Double): Unit
  
  def setDisplayOnMinLevel(level: Double): Unit
  
  def setImageURL(url: String): Unit
  
  def setOpacity(opcity: Double): Unit
}
object GroundOverlay {
  
  inline def apply(
    getBounds: () => Bounds,
    getDispalyOnMaxLevel: () => Double,
    getDisplayOnMinLevel: () => Double,
    getImageURL: () => String,
    getOpacity: () => Double,
    onclick: Target => Unit,
    ondblclick: Target => Unit,
    setBounds: Bounds => Unit,
    setDispalyOnMaxLevel: Double => Unit,
    setDisplayOnMinLevel: Double => Unit,
    setImageURL: String => Unit,
    setOpacity: Double => Unit
  ): GroundOverlay = {
    val __obj = js.Dynamic.literal(getBounds = js.Any.fromFunction0(getBounds), getDispalyOnMaxLevel = js.Any.fromFunction0(getDispalyOnMaxLevel), getDisplayOnMinLevel = js.Any.fromFunction0(getDisplayOnMinLevel), getImageURL = js.Any.fromFunction0(getImageURL), getOpacity = js.Any.fromFunction0(getOpacity), onclick = js.Any.fromFunction1(onclick), ondblclick = js.Any.fromFunction1(ondblclick), setBounds = js.Any.fromFunction1(setBounds), setDispalyOnMaxLevel = js.Any.fromFunction1(setDispalyOnMaxLevel), setDisplayOnMinLevel = js.Any.fromFunction1(setDisplayOnMinLevel), setImageURL = js.Any.fromFunction1(setImageURL), setOpacity = js.Any.fromFunction1(setOpacity))
    __obj.asInstanceOf[GroundOverlay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GroundOverlay] (val x: Self) extends AnyVal {
    
    inline def setGetBounds(value: () => Bounds): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    inline def setGetDispalyOnMaxLevel(value: () => Double): Self = StObject.set(x, "getDispalyOnMaxLevel", js.Any.fromFunction0(value))
    
    inline def setGetDisplayOnMinLevel(value: () => Double): Self = StObject.set(x, "getDisplayOnMinLevel", js.Any.fromFunction0(value))
    
    inline def setGetImageURL(value: () => String): Self = StObject.set(x, "getImageURL", js.Any.fromFunction0(value))
    
    inline def setGetOpacity(value: () => Double): Self = StObject.set(x, "getOpacity", js.Any.fromFunction0(value))
    
    inline def setOnclick(value: Target => Unit): Self = StObject.set(x, "onclick", js.Any.fromFunction1(value))
    
    inline def setOndblclick(value: Target => Unit): Self = StObject.set(x, "ondblclick", js.Any.fromFunction1(value))
    
    inline def setSetBounds(value: Bounds => Unit): Self = StObject.set(x, "setBounds", js.Any.fromFunction1(value))
    
    inline def setSetDispalyOnMaxLevel(value: Double => Unit): Self = StObject.set(x, "setDispalyOnMaxLevel", js.Any.fromFunction1(value))
    
    inline def setSetDisplayOnMinLevel(value: Double => Unit): Self = StObject.set(x, "setDisplayOnMinLevel", js.Any.fromFunction1(value))
    
    inline def setSetImageURL(value: String => Unit): Self = StObject.set(x, "setImageURL", js.Any.fromFunction1(value))
    
    inline def setSetOpacity(value: Double => Unit): Self = StObject.set(x, "setOpacity", js.Any.fromFunction1(value))
  }
}
