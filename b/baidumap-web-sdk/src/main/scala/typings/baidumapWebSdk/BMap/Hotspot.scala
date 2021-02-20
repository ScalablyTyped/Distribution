package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hotspot extends Overlay {
  
  def getPosition(): Point = js.native
  
  def getText(): String = js.native
  
  def getUserData(): js.Any = js.native
  
  def setPosition(position: Point): Unit = js.native
  
  def setText(text: String): Unit = js.native
  
  def setUserData(data: js.Any): Unit = js.native
}
object Hotspot {
  
  @scala.inline
  def apply(
    getPosition: () => Point,
    getText: () => String,
    getUserData: () => js.Any,
    setPosition: Point => Unit,
    setText: String => Unit,
    setUserData: js.Any => Unit
  ): Hotspot = {
    val __obj = js.Dynamic.literal(getPosition = js.Any.fromFunction0(getPosition), getText = js.Any.fromFunction0(getText), getUserData = js.Any.fromFunction0(getUserData), setPosition = js.Any.fromFunction1(setPosition), setText = js.Any.fromFunction1(setText), setUserData = js.Any.fromFunction1(setUserData))
    __obj.asInstanceOf[Hotspot]
  }
  
  @scala.inline
  implicit class HotspotMutableBuilder[Self <: Hotspot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetPosition(value: () => Point): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserData(value: () => js.Any): Self = StObject.set(x, "getUserData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPosition(value: Point => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUserData(value: js.Any => Unit): Self = StObject.set(x, "setUserData", js.Any.fromFunction1(value))
  }
}
