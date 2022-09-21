package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hotspot
  extends StObject
     with Overlay {
  
  def getPosition(): Point
  
  def getText(): String
  
  def getUserData(): Any
  
  def setPosition(position: Point): Unit
  
  def setText(text: String): Unit
  
  def setUserData(data: Any): Unit
}
object Hotspot {
  
  inline def apply(
    getPosition: () => Point,
    getText: () => String,
    getUserData: () => Any,
    setPosition: Point => Unit,
    setText: String => Unit,
    setUserData: Any => Unit
  ): Hotspot = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), getText = js.Any.fromFunction0(getText), getUserData = js.Any.fromFunction0(getUserData), setPosition = js.Any.fromFunction1(setPosition), setText = js.Any.fromFunction1(setText), setUserData = js.Any.fromFunction1(setUserData))
    __obj.asInstanceOf[Hotspot]
  }
  
  extension [Self <: Hotspot](x: Self) {
    
    inline def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setGetUserData(value: () => Any): Self = StObject.set(x, "getUserData", js.Any.fromFunction0(value))
    
    inline def setSetPosition(value: Point => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setSetUserData(value: Any => Unit): Self = StObject.set(x, "setUserData", js.Any.fromFunction1(value))
  }
}
