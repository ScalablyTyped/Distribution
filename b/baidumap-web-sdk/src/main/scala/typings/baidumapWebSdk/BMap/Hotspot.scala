package typings.baidumapWebSdk.BMap

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
  implicit class HotspotOps[Self <: Hotspot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetPosition(value: () => Point): Self = this.set("getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = this.set("getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetUserData(value: () => js.Any): Self = this.set("getUserData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPosition(value: Point => Unit): Self = this.set("setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetUserData(value: js.Any => Unit): Self = this.set("setUserData", js.Any.fromFunction1(value))
  }
}
